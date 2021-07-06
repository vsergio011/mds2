package basededatos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import appventawebbd.AppventawebPersistentManager;
import appventawebbd.Cibernauta;
import appventawebbd.CibernautaDAO;
import appventawebbd.Comentario;
import appventawebbd.ComentarioCriteria;
import appventawebbd.ComentarioDAO;
import appventawebbd.Producto;
import appventawebbd.ProductoDAO;

public class BD_Comentario {
	public BDPrincipal _bd_prin_com;
	public Vector<Comentario> _contiene_comentarios = new Vector<Comentario>();

	public void comentarProducto(int aIdProducto, Comentario aComentario, int idCiber) throws PersistentException {
		PersistentTransaction t2 = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		try {			
			Comentario comentario = ComentarioDAO.createComentario();
			
			Cibernauta ciber = CibernautaDAO.getCibernautaByORMID(idCiber);
			comentario.setCibernauta(ciber);
			
			Producto producto = ProductoDAO.getProductoByORMID(aIdProducto);
			comentario.setProducto(producto);
			
			comentario.setTexto(aComentario.getTexto());
			comentario.setValoracion(aComentario.getValoracion());
			
			ComentarioDAO.save(comentario);
			t2.commit();
		} catch (Exception e) {
			Helpers.Errors.LogBDError(e);
			t2.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
	}

	public Comentario[] listComentarios(int aIdProducto) throws PersistentException {
		PersistentTransaction t2 = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Comentario[] comentarios = {};
		try {
			ComentarioCriteria criteria = new ComentarioCriteria();
			criteria.productoId.eq(aIdProducto);
			
			comentarios = ComentarioDAO.listComentarioByCriteria(criteria);
			t2.commit();
		} catch (Exception e) {
			Helpers.Errors.LogBDError(e);
			t2.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
		
		return comentarios;
	}
}