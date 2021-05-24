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
import appventawebbd.ProductoDAO;

public class BD_Producto {
	public BDPrincipal _bd_prin_prod;
	public Vector<Producto> _contiene_productos = new Vector<Producto>();

	public Producto altaProducto(Producto aProducto) throws PersistentException {
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
			
			pro.setNombre(aProducto.getNombre());
			pro.setPrecio(aProducto.getPrecio());
			pro.setValoracionMedia(aProducto.getValoracionMedia());
			
			ProductoDAO.save(pro);
			t2.commit();
		} catch (Exception e) {
			t2.rollback();
		}
		return pro;
	}

	public Producto modificarProducto(Producto aProducto) throws PersistentException {
		PersistentTransaction t2 = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		try {
			ProductoDAO.save(aProducto);
			t2.commit();
		} catch (Exception e) {
			t2.rollback();
		}
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
	}

	public Producto getProducto(int aId) throws PersistentException {
		PersistentTransaction t2 = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Producto pro = null;
		try {
			pro = ProductoDAO.getProductoByORMID(aId);
			t2.commit();
		} catch (Exception e) {
			t2.rollback();
		}
		return pro;
	}

	public List<Producto> getProductosMasVendidos() throws PersistentException {
		// TODO: Filtrar mas vendidos.
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		List<Producto> productos = null;
		try {
			productos = ProductoDAO.queryProducto(null, "Nombre");
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
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
		
		return productos;
	}

	public void anadirFoto(int aIdProducto, String aImage) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Producto pro = this.getProducto(aIdProducto);
			Foto f = FotoDAO.createFoto();
			f.setRuta(aImage);
			FotoDAO.save(f);
			
			pro.fotosProducto.add(f);
			ProductoDAO.save(pro);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public Producto[] getProductos(int[] aIdItems) {
		throw new UnsupportedOperationException();
	}
}