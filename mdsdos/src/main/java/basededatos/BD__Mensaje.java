package basededatos;

import basededatos.BDPrincipal;

import java.util.ArrayList;
import java.util.List;
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

	public void nuevaNotificacion(Usuario remitente, Usuario destinatario, String asunto, String cuerpo) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		try {			
			Mensaje m = MensajeDAO.createMensaje();
			m.setCuerpo(cuerpo);
			m.setAsunto(asunto);
			
			Usuario remi = UsuarioDAO.getUsuarioByORMID(remitente.getId());
			m.setRemitente(remi);
			
			Usuario desti = UsuarioDAO.getUsuarioByORMID(destinatario.getId());
			m.setDestinatario(desti);
			
			MensajeDAO.save(m);
			
			t.commit();
		} catch (Exception e) {
			Helpers.Errors.LogBDError(e);
			t.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
	}

	public Mensaje[] getMensajesRecibidos(int idUsuario) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Mensaje[] mensajes = {};
		try {
			Usuario u = UsuarioDAO.getUsuarioByORMID(idUsuario);
			System.out.println("MENSAJES Recibidos  " + u.mensajesRecibidos.size());
			mensajes = u.mensajesRecibidos.toArray();
			
			t.commit();
		} catch (Exception e) {
			Helpers.Errors.LogBDError(e);
			t.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
		
		return mensajes;
	}
	
	public Mensaje[] getMensajesEnviados(int idUsuario) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Mensaje[] mensajes = {};
		try {
			Usuario u = UsuarioDAO.getUsuarioByORMID(idUsuario);
			mensajes = u.mensajesEnviados.toArray();
			System.out.println("MENSAJES Recibidos  " + u.mensajesRecibidos.size());
			t.commit();
		} catch (Exception e) {
			Helpers.Errors.LogBDError(e);
			t.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
		
		return mensajes;
	}
}