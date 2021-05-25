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

	public void anadirAOferta(int aIdProduc, Oferta aOferta) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Oferta oferta = OfertaDAO.createOferta();
			// oferta.setProducto(aIdProduc);
			oferta.setFechaFin(aOferta.getFechaFin());
			oferta.setPrecio(aOferta.getPrecio());
			OfertaDAO.save(oferta);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public void quitarProductoOferta(int aIdProducto) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Oferta oferta = this.estaEnOferta(aIdProducto);
		try {
			OfertaDAO.delete(oferta);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}
	
	public Oferta estaEnOferta(int idProducto) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Oferta oferta = null;
		try {
			oferta = OfertaDAO.loadOfertaByQuery("ProductoId='"+idProducto+"'", null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
		return oferta;
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