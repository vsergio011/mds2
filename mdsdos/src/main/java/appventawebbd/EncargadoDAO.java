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

public class EncargadoDAO {
	public static Encargado loadEncargadoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return loadEncargadoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado getEncargadoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return getEncargadoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado loadEncargadoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return loadEncargadoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado getEncargadoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return getEncargadoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado loadEncargadoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Encargado) session.load(appventawebbd.Encargado.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado getEncargadoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Encargado) session.get(appventawebbd.Encargado.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado loadEncargadoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Encargado) session.load(appventawebbd.Encargado.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado getEncargadoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Encargado) session.get(appventawebbd.Encargado.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEncargado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return queryEncargado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEncargado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return queryEncargado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado[] listEncargadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return listEncargadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado[] listEncargadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return listEncargadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEncargado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From appventawebbd.Encargado as Encargado");
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
	
	public static List queryEncargado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From appventawebbd.Encargado as Encargado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Encargado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado[] listEncargadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEncargado(session, condition, orderBy);
			return (Encargado[]) list.toArray(new Encargado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado[] listEncargadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEncargado(session, condition, orderBy, lockMode);
			return (Encargado[]) list.toArray(new Encargado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado loadEncargadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return loadEncargadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado loadEncargadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return loadEncargadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado loadEncargadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Encargado[] encargados = listEncargadoByQuery(session, condition, orderBy);
		if (encargados != null && encargados.length > 0)
			return encargados[0];
		else
			return null;
	}
	
	public static Encargado loadEncargadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Encargado[] encargados = listEncargadoByQuery(session, condition, orderBy, lockMode);
		if (encargados != null && encargados.length > 0)
			return encargados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEncargadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return iterateEncargadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEncargadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return iterateEncargadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEncargadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From appventawebbd.Encargado as Encargado");
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
	
	public static java.util.Iterator iterateEncargadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From appventawebbd.Encargado as Encargado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Encargado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado createEncargado() {
		return new appventawebbd.Encargado();
	}
	
	public static boolean save(appventawebbd.Encargado encargado) throws PersistentException {
		try {
			AppventawebPersistentManager.instance().saveObject(encargado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(appventawebbd.Encargado encargado) throws PersistentException {
		try {
			AppventawebPersistentManager.instance().deleteObject(encargado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(appventawebbd.Encargado encargado)throws PersistentException {
		try {
			appventawebbd.Mensaje[] lMensajesEnviadoss = encargado.mensajesEnviados.toArray();
			for(int i = 0; i < lMensajesEnviadoss.length; i++) {
				lMensajesEnviadoss[i].setRemitente(null);
			}
			appventawebbd.Mensaje[] lMensajesRecibidoss = encargado.mensajesRecibidos.toArray();
			for(int i = 0; i < lMensajesRecibidoss.length; i++) {
				lMensajesRecibidoss[i].setDestinatario(null);
			}
			return delete(encargado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(appventawebbd.Encargado encargado, org.orm.PersistentSession session)throws PersistentException {
		try {
			appventawebbd.Mensaje[] lMensajesEnviadoss = encargado.mensajesEnviados.toArray();
			for(int i = 0; i < lMensajesEnviadoss.length; i++) {
				lMensajesEnviadoss[i].setRemitente(null);
			}
			appventawebbd.Mensaje[] lMensajesRecibidoss = encargado.mensajesRecibidos.toArray();
			for(int i = 0; i < lMensajesRecibidoss.length; i++) {
				lMensajesRecibidoss[i].setDestinatario(null);
			}
			try {
				session.delete(encargado);
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
	
	public static boolean refresh(appventawebbd.Encargado encargado) throws PersistentException {
		try {
			AppventawebPersistentManager.instance().getSession().refresh(encargado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(appventawebbd.Encargado encargado) throws PersistentException {
		try {
			AppventawebPersistentManager.instance().getSession().evict(encargado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Encargado loadEncargadoByCriteria(EncargadoCriteria encargadoCriteria) {
		Encargado[] encargados = listEncargadoByCriteria(encargadoCriteria);
		if(encargados == null || encargados.length == 0) {
			return null;
		}
		return encargados[0];
	}
	
	public static Encargado[] listEncargadoByCriteria(EncargadoCriteria encargadoCriteria) {
		return encargadoCriteria.listEncargado();
	}
}
