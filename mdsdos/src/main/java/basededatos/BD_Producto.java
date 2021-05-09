package basededatos;

import basededatos.BDPrincipal;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import appventawebbd.AppventawebPersistentManager;
import appventawebbd.Oferta;
import appventawebbd.OfertaDAO;
import appventawebbd.Producto;
import appventawebbd.ProductoDAO;

public class BD_Producto {
	public BDPrincipal _bd_prin_prod;
	public Vector<Producto> _contiene_productos = new Vector<Producto>();

	public int altaProducto(Producto aProducto) {
		throw new UnsupportedOperationException();
	}

	public void modificarProducto(Producto aProducto) {
		throw new UnsupportedOperationException();
	}

	public void borrarProducto(int aProducto) {
		throw new UnsupportedOperationException();
	}

	public Producto getProducto(int aId) {
		throw new UnsupportedOperationException();
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
		
		return productos;
	}

	public List<Producto> listProductos() throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		List<Producto> productos = null;
		try {
			productos = ProductoDAO.queryProducto(null, null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
		return productos;
	}

	public void anadirFoto(int aIdProducto, String aImage) {
		throw new UnsupportedOperationException();
	}

	public Producto[] getProductos(int[] aIdItems) {
		throw new UnsupportedOperationException();
	}
}