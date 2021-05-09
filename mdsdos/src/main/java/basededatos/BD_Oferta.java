package basededatos;

import basededatos.BDPrincipal;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import appventawebbd.AppventawebPersistentManager;
import appventawebbd.Oferta;
import appventawebbd.OfertaDAO;

public class BD_Oferta {
	public BDPrincipal _bd_prin_ofer;
	public Vector<Oferta> _contiene_ofertas = new Vector<Oferta>();

	public void anadirAOferta(int aIdProduc, Oferta aOferta) {
		throw new UnsupportedOperationException();
	}

	public void quitarProductoOferta(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public List<Oferta> listOfertas() throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		List<Oferta> ofertas = null;
		try {
			ofertas = OfertaDAO.queryOferta(null, null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
		return ofertas;
	}
}