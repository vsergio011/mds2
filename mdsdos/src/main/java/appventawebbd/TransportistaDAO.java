/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: antonioofdzj(University of Almeria)
 * License Type: Academic
 */
package appventawebbd;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class TransportistaDAO {
	public static Transportista loadTransportistaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return loadTransportistaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista getTransportistaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return getTransportistaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista loadTransportistaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return loadTransportistaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista getTransportistaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return getTransportistaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista loadTransportistaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Transportista) session.load(appventawebbd.Transportista.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista getTransportistaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Transportista) session.get(appventawebbd.Transportista.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista loadTransportistaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Transportista) session.load(appventawebbd.Transportista.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista getTransportistaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Transportista) session.get(appventawebbd.Transportista.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTransportista(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return queryTransportista(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTransportista(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return queryTransportista(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista[] listTransportistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return listTransportistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista[] listTransportistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return listTransportistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTransportista(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From appventawebbd.Transportista as Transportista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTransportista(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From appventawebbd.Transportista as Transportista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Transportista", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista[] listTransportistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTransportista(session, condition, orderBy);
			return (Transportista[]) list.toArray(new Transportista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista[] listTransportistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTransportista(session, condition, orderBy, lockMode);
			return (Transportista[]) list.toArray(new Transportista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista loadTransportistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return loadTransportistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista loadTransportistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return loadTransportistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista loadTransportistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Transportista[] transportistas = listTransportistaByQuery(session, condition, orderBy);
		if (transportistas != null && transportistas.length > 0)
			return transportistas[0];
		else
			return null;
	}
	
	public static Transportista loadTransportistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Transportista[] transportistas = listTransportistaByQuery(session, condition, orderBy, lockMode);
		if (transportistas != null && transportistas.length > 0)
			return transportistas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTransportistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return iterateTransportistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTransportistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return iterateTransportistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTransportistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From appventawebbd.Transportista as Transportista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTransportistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From appventawebbd.Transportista as Transportista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Transportista", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista createTransportista() {
		return new appventawebbd.Transportista();
	}
	
	public static boolean save(appventawebbd.Transportista transportista) throws PersistentException {
		try {
			AppventawebPersistentManager.instance().saveObject(transportista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(appventawebbd.Transportista transportista) throws PersistentException {
		try {
			AppventawebPersistentManager.instance().deleteObject(transportista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(appventawebbd.Transportista transportista)throws PersistentException {
		try {
			appventawebbd.Enviado[] lEnviadoss = transportista.enviados.toArray();
			for(int i = 0; i < lEnviadoss.length; i++) {
				lEnviadoss[i].setTransportistaEnvio(null);
			}
			appventawebbd.Mensaje[] lMensajesEnviadoss = transportista.mensajesEnviados.toArray();
			for(int i = 0; i < lMensajesEnviadoss.length; i++) {
				lMensajesEnviadoss[i].setRemitente(null);
			}
			appventawebbd.Mensaje[] lMensajesRecibidoss = transportista.mensajesRecibidos.toArray();
			for(int i = 0; i < lMensajesRecibidoss.length; i++) {
				lMensajesRecibidoss[i].setDestinatario(null);
			}
			return delete(transportista);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(appventawebbd.Transportista transportista, org.orm.PersistentSession session)throws PersistentException {
		try {
			appventawebbd.Enviado[] lEnviadoss = transportista.enviados.toArray();
			for(int i = 0; i < lEnviadoss.length; i++) {
				lEnviadoss[i].setTransportistaEnvio(null);
			}
			appventawebbd.Mensaje[] lMensajesEnviadoss = transportista.mensajesEnviados.toArray();
			for(int i = 0; i < lMensajesEnviadoss.length; i++) {
				lMensajesEnviadoss[i].setRemitente(null);
			}
			appventawebbd.Mensaje[] lMensajesRecibidoss = transportista.mensajesRecibidos.toArray();
			for(int i = 0; i < lMensajesRecibidoss.length; i++) {
				lMensajesRecibidoss[i].setDestinatario(null);
			}
			try {
				session.delete(transportista);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(appventawebbd.Transportista transportista) throws PersistentException {
		try {
			AppventawebPersistentManager.instance().getSession().refresh(transportista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(appventawebbd.Transportista transportista) throws PersistentException {
		try {
			AppventawebPersistentManager.instance().getSession().evict(transportista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista loadTransportistaByCriteria(TransportistaCriteria transportistaCriteria) {
		Transportista[] transportistas = listTransportistaByCriteria(transportistaCriteria);
		if(transportistas == null || transportistas.length == 0) {
			return null;
		}
		return transportistas[0];
	}
	
	public static Transportista[] listTransportistaByCriteria(TransportistaCriteria transportistaCriteria) {
		return transportistaCriteria.listTransportista();
	}
}
