package basededatos;

import basededatos.BDPrincipal;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import appventawebbd.AppventawebPersistentManager;
import appventawebbd.Categoria;
import appventawebbd.CategoriaDAO;
import appventawebbd.Comentario;
import appventawebbd.Foto;
import appventawebbd.FotoDAO;
import appventawebbd.Item;
import appventawebbd.Oferta;
import appventawebbd.OfertaDAO;
import appventawebbd.Pendiente;
import appventawebbd.Producto;
import appventawebbd.ProductoCriteria;
import appventawebbd.ProductoDAO;

public class BD_Producto {
	public BDPrincipal _bd_prin_prod;
	public Vector<Producto> _contiene_productos = new Vector<Producto>();

	public void ActualizarValoracionMedia(int idProducto) throws PersistentException {
		PersistentTransaction t2 = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Producto producto = ProductoDAO.loadProductoByORMID(idProducto);
			double valoracionMedia = 0;
			
			if ( producto.comentarios != null &&  producto.comentarios.size() > 0) {
				for(Comentario c : producto.comentarios.toArray()) {
					valoracionMedia += c.getValoracion();
				}
				valoracionMedia = valoracionMedia / producto.comentarios.size();
			}
			producto.setValoracionMedia(valoracionMedia);
			
			t2.commit();
		} catch (Exception e) {
			System.out.println(">>>>>>>>ERROR EN BD: " + e.getMessage());
			t2.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
	}
	
	public Producto altaProducto(Producto aProducto, List<String> images, int cat) throws PersistentException {
		PersistentTransaction t2 = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Producto pro = null;
		try {
			pro = ProductoDAO.createProducto();
			
			Categoria categoria = CategoriaDAO.getCategoriaByORMID(cat);
			pro.setCategoria(categoria);
			pro.setDescripcion(aProducto.getDescripcion());
			pro.setDetalles(aProducto.getDetalles());
			
			String foto = "https://www.mundofino.com/site/assets/files/1729/no_foto.600x600nw.jpg";
			String incomingFoto = aProducto.getFotos();
			if (!incomingFoto.isEmpty()) {
				foto = incomingFoto;
			}
			pro.setFotos(foto);
			
			for (String f : images) {
				Foto image = FotoDAO.createFoto();
				image.setProductoFoto(aProducto);
				image.setRuta(f);
				// FotoDAO.save(foto);
				
				pro.fotosProducto.add(image);
			}
			
			pro.setNombre(aProducto.getNombre());
			pro.setPrecio(aProducto.getPrecio());
			pro.setValoracionMedia(aProducto.getValoracionMedia());
			
			ProductoDAO.save(pro);
			t2.commit();
		} catch (Exception e) {
			Helpers.Errors.LogBDError(e);
			t2.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
		
		return pro;
	}

	public Producto modificarProducto(int idProducto, Producto aProducto, List<String> fotos) throws PersistentException {
		PersistentTransaction t2 = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Producto pro = null;
		try {
			pro = ProductoDAO.loadProductoByORMID(idProducto);
			pro.setCategoria(aProducto.getCategoria());
			pro.setDescripcion(aProducto.getDescripcion());
			pro.setDetalles(aProducto.getDetalles());
			pro.setFotos(aProducto.getFotos());
			pro.setNombre(aProducto.getNombre());
			
			pro.fotosProducto.clear();
			for (String f : fotos) {
				Foto foto = FotoDAO.createFoto();
				foto.setProductoFoto(aProducto);
				foto.setRuta(f);
				// FotoDAO.save(foto);
				
				pro.fotosProducto.add(foto);
			}
			ProductoDAO.save(pro);
			
			t2.commit();
		} catch (Exception e) {
			System.out.println(">>>>>>>>ERROR EN BD: " + e.getMessage());
			t2.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
		
		return aProducto;
	}

	public void borrarProducto(Producto aProducto) throws PersistentException {
		PersistentTransaction t2 = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		try {
			List<Foto> fotos = FotoDAO.queryFoto("ProductoId='"+aProducto.getId()+"'", null);
			for (Foto f : fotos) {
				FotoDAO.delete(f);
			}
			
			List<Oferta> ofertas = OfertaDAO.queryOferta("ProductoId='"+aProducto.getId()+"'", null);
			for (Oferta o : ofertas) {
				OfertaDAO.delete(o);
			}
			
			Producto pro = ProductoDAO.getProductoByORMID(aProducto.getId());
			
			ProductoDAO.delete(pro);
			t2.commit();
		} catch (Exception e) {
			System.out.println(">>>>>>>>ERROR EN BD: " + e.getMessage());
			t2.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
	}

	public List<Producto> getProductosMasVendidos() throws PersistentException {
		// TODO: Filtrar mas vendidos.
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		List<Producto> productos = new ArrayList<Producto>();
		try {
			productos = ProductoDAO.queryProducto(null, null);
			t.commit();
		} catch (Exception e) {
			System.out.println(">>>>>>>>ERROR EN BD: " + e.getMessage());
			t.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
		
		return productos;
	}

	public List<Producto> listProductos() throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		List<Producto> productos =new ArrayList<Producto>();
		try {
			productos = ProductoDAO.queryProducto(null, "Nombre");
			t.commit();
		} catch (Exception e) {
			System.out.println(">>>>>>>>ERROR EN BD: " + e.getMessage());
			t.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
		
		return productos;
	}

	public void anadirFoto(int aIdProducto, String aImage) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Producto pro = ProductoDAO.loadProductoByORMID(aIdProducto);
			Foto f = FotoDAO.createFoto();
			f.setRuta(aImage);
			FotoDAO.save(f);
			
			pro.fotosProducto.add(f);
			ProductoDAO.save(pro);
			
			t.commit();
		} catch (Exception e) {
			System.out.println(">>>>>>>>ERROR EN BD: " + e.getMessage());
			t.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
	}

	public Producto[] getProductos(int idCategoria) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Producto[] productos = {};
		try {
			ProductoCriteria criteria = new ProductoCriteria();
			criteria.categoriaId.eq(idCategoria);
			
			productos = ProductoDAO.listProductoByCriteria(criteria);
			t.commit();
		} catch (Exception e) {
			System.out.println(">>>>>>>>ERROR EN BD: " + e.getMessage());
			t.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
		
		return productos;
	}
}