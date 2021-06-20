package basededatos;

import basededatos.BDPrincipal;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import appventawebbd.AppventawebPersistentManager;
import appventawebbd.Enviado;
import appventawebbd.Oferta;
import appventawebbd.OfertaDAO;
import appventawebbd.Producto;
import appventawebbd.ProductoDAO;

public class BD_Oferta {
	public BDPrincipal _bd_prin_ofer;
	public Vector<Oferta> _contiene_ofertas = new Vector<Oferta>();

	public void anadirAOferta(int aIdProduc, Oferta aOferta) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Producto pro = ProductoDAO.loadProductoByORMID(aIdProduc);
			Oferta oferta = OfertaDAO.createOferta();
			oferta.setORM_Producto(pro);
			oferta.setFechaFin(aOferta.getFechaFin());
			oferta.setPrecio(aOferta.getPrecio());
			OfertaDAO.save(oferta);
			t.commit();
		} catch (Exception e) {
			System.out.println(">>>>>>>>ERROR EN BD: " + e.getMessage());
			t.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
	}

	public void quitarProductoOferta(int aIdProducto) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Oferta oferta = OfertaDAO.getOfertaByORMID(aIdProducto);
			OfertaDAO.delete(oferta);
			t.commit();
		} catch (Exception e) {
			System.out.println(">>>>>>>>ERROR EN BD: " + e.getMessage());
			t.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
	}
	
	public Oferta estaEnOferta(int idProducto) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Oferta oferta = null;
		try {
			oferta = OfertaDAO.loadOfertaByQuery("ProductoId='"+idProducto+"'", null);
			t.commit();
		} catch (Exception e) {
			System.out.println(">>>>>>>>ERROR EN BD: " + e.getMessage());
			t.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
		
		return oferta;
	}

	public List<Oferta> listOfertas() throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		List<Oferta> ofertas = new ArrayList<Oferta>();
		try {
			ofertas = OfertaDAO.queryOferta(null, null);
			t.commit();
		} catch (Exception e) {
			System.out.println(">>>>>>>>ERROR EN BD: " + e.getMessage());
			t.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
		
		return ofertas;
	}
}