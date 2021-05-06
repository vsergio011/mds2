package basededatos;

import basededatos.BDPrincipal;
import java.util.Vector;
import appventawebbd.Producto;

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

	public Producto[] getProductosMasVendidos() {
		throw new UnsupportedOperationException();
	}

	public Producto[] listProductos() {
		throw new UnsupportedOperationException();
	}

	public void anadirFoto(int aIdProducto, String aImage) {
		throw new UnsupportedOperationException();
	}

	public Producto[] getProductos(int[] aIdItems) {
		throw new UnsupportedOperationException();
	}
}