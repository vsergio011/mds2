package basededatos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import appventawebbd.AppventawebPersistentManager;
import appventawebbd.Comentario;
import appventawebbd.ComentarioDAO;
import appventawebbd.Producto;
import appventawebbd.ProductoDAO;

public class BD_Comentario {
	public BDPrincipal _bd_prin_com;
	public Vector<Comentario> _contiene_comentarios = new Vector<Comentario>();

	public void comentarProducto(Producto aIdProducto, Comentario aComentario) throws PersistentException {
		PersistentTransaction t2 = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Comentario comentario = ComentarioDAO.createComentario();
			comentario.setCibernauta(aComentario.getCibernauta());
			comentario.setProducto(aIdProducto);
			comentario.setTexto(aComentario.getTexto());
			comentario.setValoracion(aComentario.getValoracion());
			
			ComentarioDAO.save(comentario);
			t2.commit();
		} catch (Exception e) {
			t2.rollback();
		}
	}

	public Comentario[] listComentarios(int aIdProducto) {
		throw new UnsupportedOperationException();
	}
}