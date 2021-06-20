package basededatos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import appventawebbd.AppventawebPersistentManager;
import appventawebbd.Cibernauta;
import appventawebbd.Mensaje;
import appventawebbd.MensajeCriteria;
import appventawebbd.MensajeDAO;
import appventawebbd.Usuario;
import appventawebbd.UsuarioDAO;

public class BD__Mensaje {
	public BDPrincipal _bd_prin_mens;
	public Vector<Mensaje> _contiene_mensajes = new Vector<Mensaje>();

	public Mensaje detalleMensaje(int aId) {
		throw new UnsupportedOperationException();
	}

	public void nuevaNotificacion(Usuario remitente, Usuario destinatario, String asunto, String cuerpo) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Mensaje m = MensajeDAO.createMensaje();
			m.setCuerpo(cuerpo);
			m.setAsunto(asunto);
			m.setRemitente(remitente);
			m.setDestinatario(destinatario);
			MensajeDAO.save(m);
			
			t.commit();
		} catch (Exception e) {
			System.out.println(">>>>>>>>ERROR EN BD: " + e.getMessage());
			t.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
	}

	public Mensaje[] getMensajesRecibidos(int idUsuario) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Mensaje[] mensajes = {};
		try {
			MensajeCriteria criteria = new MensajeCriteria();
			criteria.destinatarioId.eq(idUsuario);
			
			mensajes = MensajeDAO.listMensajeByCriteria(criteria);
			
			t.commit();
		} catch (Exception e) {
			System.out.println(">>>>>>>>ERROR EN BD: " + e.getMessage());
			t.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
		
		return mensajes;
	}
	
	public Mensaje[] getMensajesEnviados(int idUsuario) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Mensaje[] mensajes = {};
		try {
			MensajeCriteria criteria = new MensajeCriteria();
			criteria.remitenteId.eq(idUsuario);
			
			mensajes = MensajeDAO.listMensajeByCriteria(criteria);
			
			t.commit();
		} catch (Exception e) {
			System.out.println(">>>>>>>>ERROR EN BD: " + e.getMessage());
			t.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
		
		return mensajes;
	}
}