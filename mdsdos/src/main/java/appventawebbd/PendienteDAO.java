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

public class PendienteDAO {
	public static Pendiente loadPendienteByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return loadPendienteByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente getPendienteByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return getPendienteByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente loadPendienteByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return loadPendienteByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente getPendienteByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return getPendienteByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente loadPendienteByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Pendiente) session.load(appventawebbd.Pendiente.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente getPendienteByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Pendiente) session.get(appventawebbd.Pendiente.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente loadPendienteByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Pendiente) session.load(appventawebbd.Pendiente.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente getPendienteByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Pendiente) session.get(appventawebbd.Pendiente.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPendiente(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return queryPendiente(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPendiente(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return queryPendiente(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente[] listPendienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return listPendienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente[] listPendienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return listPendienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPendiente(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From appventawebbd.Pendiente as Pendiente");
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
	
	public static List queryPendiente(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From appventawebbd.Pendiente as Pendiente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Pendiente", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente[] listPendienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPendiente(session, condition, orderBy);
			return (Pendiente[]) list.toArray(new Pendiente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente[] listPendienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPendiente(session, condition, orderBy, lockMode);
			return (Pendiente[]) list.toArray(new Pendiente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente loadPendienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return loadPendienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente loadPendienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return loadPendienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente loadPendienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Pendiente[] pendientes = listPendienteByQuery(session, condition, orderBy);
		if (pendientes != null && pendientes.length > 0)
			return pendientes[0];
		else
			return null;
	}
	
	public static Pendiente loadPendienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Pendiente[] pendientes = listPendienteByQuery(session, condition, orderBy, lockMode);
		if (pendientes != null && pendientes.length > 0)
			return pendientes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePendienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return iteratePendienteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePendienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return iteratePendienteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePendienteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From appventawebbd.Pendiente as Pendiente");
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
	
	public static java.util.Iterator iteratePendienteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From appventawebbd.Pendiente as Pendiente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Pendiente", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente createPendiente() {
		return new appventawebbd.Pendiente();
	}
	
	public static boolean save(appventawebbd.Pendiente pendiente) throws PersistentException {
		try {
			AppventawebPersistentManager.instance().saveObject(pendiente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(appventawebbd.Pendiente pendiente) throws PersistentException {
		try {
			AppventawebPersistentManager.instance().deleteObject(pendiente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(appventawebbd.Pendiente pendiente)throws PersistentException {
		try {
			if (pendiente.getCibernauta() != null) {
				pendiente.getCibernauta().pedidos.remove(pendiente);
			}
			
			appventawebbd.Item[] lItemss = pendiente.items.toArray();
			for(int i = 0; i < lItemss.length; i++) {
				lItemss[i].setPedido(null);
			}
			return delete(pendiente);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(appventawebbd.Pendiente pendiente, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (pendiente.getCibernauta() != null) {
				pendiente.getCibernauta().pedidos.remove(pendiente);
			}
			
			appventawebbd.Item[] lItemss = pendiente.items.toArray();
			for(int i = 0; i < lItemss.length; i++) {
				lItemss[i].setPedido(null);
			}
			try {
				session.delete(pendiente);
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
	
	public static boolean refresh(appventawebbd.Pendiente pendiente) throws PersistentException {
		try {
			AppventawebPersistentManager.instance().getSession().refresh(pendiente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(appventawebbd.Pendiente pendiente) throws PersistentException {
		try {
			AppventawebPersistentManager.instance().getSession().evict(pendiente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Pendiente loadPendienteByCriteria(PendienteCriteria pendienteCriteria) {
		Pendiente[] pendientes = listPendienteByCriteria(pendienteCriteria);
		if(pendientes == null || pendientes.length == 0) {
			return null;
		}
		return pendientes[0];
	}
	
	public static Pendiente[] listPendienteByCriteria(PendienteCriteria pendienteCriteria) {
		return pendienteCriteria.listPendiente();
	}
}
