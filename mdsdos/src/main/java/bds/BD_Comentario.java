package bds;

import java.util.Vector;


import Diagrama_BD.Comentario;

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