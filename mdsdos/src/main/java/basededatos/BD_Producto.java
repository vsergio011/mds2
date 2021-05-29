package basededatos;

import basededatos.BDPrincipal;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import appventawebbd.AppventawebPersistentManager;
import appventawebbd.Categoria;
import appventawebbd.CategoriaDAO;
import appventawebbd.Foto;
import appventawebbd.FotoDAO;
import appventawebbd.Oferta;
import appventawebbd.OfertaDAO;
import appventawebbd.Producto;
import appventawebbd.ProductoCriteria;
import appventawebbd.ProductoDAO;

public class BD_Producto {
	public BDPrincipal _bd_prin_prod;
	public Vector<Producto> _contiene_productos = new Vector<Producto>();

	public Producto altaProducto(Producto aProducto, List<String> images) throws PersistentException {
		PersistentTransaction t2 = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Producto pro = null;
		try {
			pro = ProductoDAO.createProducto();
			
			pro.setCategoria(aProducto.getCategoria());
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
			t2.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
		
		return aProducto;
	}

	public void borrarProducto(Producto aProducto) throws PersistentException {
		PersistentTransaction t2 = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		try {
			ProductoDAO.delete(aProducto);
			t2.commit();
		} catch (Exception e) {
			t2.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
	}

	public List<Producto> getProductosMasVendidos() throws PersistentException {
		// TODO: Filtrar mas vendidos.
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		List<Producto> productos = null;
		try {
			productos = ProductoDAO.queryProducto(null, null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
		
		return productos;
	}

	public List<Producto> listProductos() throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		List<Producto> productos = null;
		try {
			productos = ProductoDAO.queryProducto(null, "Nombre");
			t.commit();
		} catch (Exception e) {
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
			t.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
	}

	public Producto[] getProductos(int[] aIdItems) {
		throw new UnsupportedOperationException();
	}
}