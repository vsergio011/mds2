package basededatos;

import basededatos.BDPrincipal;
import java.util.Vector;
import appventawebbd.Foto;

public class BD_Fotos {
	public BDPrincipal _bd_prin_fotos;
	public Vector<Foto> _contiene_fotos = new Vector<Foto>();

	public Foto[] getFotosProducto(int aIdProducto) {
		throw new UnsupportedOperationException();
	}
}