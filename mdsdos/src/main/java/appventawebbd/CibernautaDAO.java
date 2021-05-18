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

public class CibernautaDAO {
	public static Cibernauta loadCibernautaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return loadCibernautaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta getCibernautaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return getCibernautaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta loadCibernautaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return loadCibernautaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta getCibernautaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return getCibernautaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta loadCibernautaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Cibernauta) session.load(appventawebbd.Cibernauta.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta getCibernautaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Cibernauta) session.get(appventawebbd.Cibernauta.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta loadCibernautaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cibernauta) session.load(appventawebbd.Cibernauta.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta getCibernautaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cibernauta) session.get(appventawebbd.Cibernauta.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCibernauta(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return queryCibernauta(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCibernauta(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return queryCibernauta(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta[] listCibernautaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return listCibernautaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta[] listCibernautaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return listCibernautaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCibernauta(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From appventawebbd.Cibernauta as Cibernauta");
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
	
	public static List queryCibernauta(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From appventawebbd.Cibernauta as Cibernauta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cibernauta", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta[] listCibernautaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCibernauta(session, condition, orderBy);
			return (Cibernauta[]) list.toArray(new Cibernauta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta[] listCibernautaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCibernauta(session, condition, orderBy, lockMode);
			return (Cibernauta[]) list.toArray(new Cibernauta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta loadCibernautaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return loadCibernautaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta loadCibernautaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return loadCibernautaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta loadCibernautaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Cibernauta[] cibernautas = listCibernautaByQuery(session, condition, orderBy);
		if (cibernautas != null && cibernautas.length > 0)
			return cibernautas[0];
		else
			return null;
	}
	
	public static Cibernauta loadCibernautaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Cibernauta[] cibernautas = listCibernautaByQuery(session, condition, orderBy, lockMode);
		if (cibernautas != null && cibernautas.length > 0)
			return cibernautas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCibernautaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return iterateCibernautaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCibernautaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return iterateCibernautaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCibernautaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From appventawebbd.Cibernauta as Cibernauta");
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
	
	public static java.util.Iterator iterateCibernautaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From appventawebbd.Cibernauta as Cibernauta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cibernauta", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta createCibernauta() {
		return new appventawebbd.Cibernauta();
	}
	
	public static boolean save(appventawebbd.Cibernauta cibernauta) throws PersistentException {
		try {
			AppventawebPersistentManager.instance().saveObject(cibernauta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(appventawebbd.Cibernauta cibernauta) throws PersistentException {
		try {
			AppventawebPersistentManager.instance().deleteObject(cibernauta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(appventawebbd.Cibernauta cibernauta)throws PersistentException {
		try {
			appventawebbd.Pedido[] lPedidoss = cibernauta.pedidos.toArray();
			for(int i = 0; i < lPedidoss.length; i++) {
				lPedidoss[i].setCibernauta(null);
			}
			appventawebbd.Comentario[] lComentarios = cibernauta.comentario.toArray();
			for(int i = 0; i < lComentarios.length; i++) {
				lComentarios[i].setCibernauta(null);
			}
			appventawebbd.Mensaje[] lMensajesEnviadoss = cibernauta.mensajesEnviados.toArray();
			for(int i = 0; i < lMensajesEnviadoss.length; i++) {
				lMensajesEnviadoss[i].setRemitente(null);
			}
			appventawebbd.Mensaje[] lMensajesRecibidoss = cibernauta.mensajesRecibidos.toArray();
			for(int i = 0; i < lMensajesRecibidoss.length; i++) {
				lMensajesRecibidoss[i].setDestinatario(null);
			}
			return delete(cibernauta);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(appventawebbd.Cibernauta cibernauta, org.orm.PersistentSession session)throws PersistentException {
		try {
			appventawebbd.Pedido[] lPedidoss = cibernauta.pedidos.toArray();
			for(int i = 0; i < lPedidoss.length; i++) {
				lPedidoss[i].setCibernauta(null);
			}
			appventawebbd.Comentario[] lComentarios = cibernauta.comentario.toArray();
			for(int i = 0; i < lComentarios.length; i++) {
				lComentarios[i].setCibernauta(null);
			}
			appventawebbd.Mensaje[] lMensajesEnviadoss = cibernauta.mensajesEnviados.toArray();
			for(int i = 0; i < lMensajesEnviadoss.length; i++) {
				lMensajesEnviadoss[i].setRemitente(null);
			}
			appventawebbd.Mensaje[] lMensajesRecibidoss = cibernauta.mensajesRecibidos.toArray();
			for(int i = 0; i < lMensajesRecibidoss.length; i++) {
				lMensajesRecibidoss[i].setDestinatario(null);
			}
			try {
				session.delete(cibernauta);
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
	
	public static boolean refresh(appventawebbd.Cibernauta cibernauta) throws PersistentException {
		try {
			AppventawebPersistentManager.instance().getSession().refresh(cibernauta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(appventawebbd.Cibernauta cibernauta) throws PersistentException {
		try {
			AppventawebPersistentManager.instance().getSession().evict(cibernauta);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta loadCibernautaByCriteria(CibernautaCriteria cibernautaCriteria) {
		Cibernauta[] cibernautas = listCibernautaByCriteria(cibernautaCriteria);
		if(cibernautas == null || cibernautas.length == 0) {
			return null;
		}
		return cibernautas[0];
	}
	
	public static Cibernauta[] listCibernautaByCriteria(CibernautaCriteria cibernautaCriteria) {
		return cibernautaCriteria.listCibernauta();
	}
}
