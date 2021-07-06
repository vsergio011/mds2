package basededatos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import appventawebbd.AppventawebPersistentManager;
import appventawebbd.Comentario;
import appventawebbd.ComentarioCriteria;
import appventawebbd.ComentarioDAO;
import appventawebbd.Foto;
import appventawebbd.FotoCriteria;
import appventawebbd.FotoDAO;

public class BD_Fotos {
	public BDPrincipal _bd_prin_fotos;
	public Vector<Foto> _contiene_fotos = new Vector<Foto>();

	public Foto[] getFotosProducto(int aIdProducto) throws PersistentException {
		PersistentTransaction t2 = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Foto[] fotos = {};
		try {
			FotoCriteria criteria = new FotoCriteria();
			criteria.productoFotoId.eq(aIdProducto);
			
			fotos = FotoDAO.listFotoByCriteria(criteria);
			t2.commit();
		} catch (Exception e) {
			Helpers.Errors.LogBDError(e);
			t2.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
		
		return fotos;
	}
}