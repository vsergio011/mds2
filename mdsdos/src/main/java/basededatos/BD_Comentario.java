package basededatos;

import basededatos.BDPrincipal;
import java.util.Vector;
import appventawebbd.Comentario;

public class BD_Comentario {
	public BDPrincipal _bd_prin_com;
	public Vector<Comentario> _contiene_comentarios = new Vector<Comentario>();

	public void comentarProducto(int aIdProducto, Comentario aComentario) {
		throw new UnsupportedOperationException();
	}

	public Comentario[] listComentarios(int aIdProducto) {
		throw new UnsupportedOperationException();
	}
}