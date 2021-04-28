package bds;

import java.util.Vector;


import Diagrama_BD.Oferta;

public class BD_Oferta {
	public BDPrincipal _bd_prin_ofer;
	public Vector<Oferta> _contiene_ofertas = new Vector<Oferta>();

	public void anadirAOferta(int aIdProduc, Oferta aOferta) {
		throw new UnsupportedOperationException();
	}

	public void quitarProductoOferta(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public Oferta[] listOfertas() {
		throw new UnsupportedOperationException();
	}
}