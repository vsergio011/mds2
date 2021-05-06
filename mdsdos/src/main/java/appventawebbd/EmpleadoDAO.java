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

public class EmpleadoDAO {
	public static Empleado loadEmpleadoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return loadEmpleadoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado getEmpleadoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return getEmpleadoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado loadEmpleadoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return loadEmpleadoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado getEmpleadoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return getEmpleadoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado loadEmpleadoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Empleado) session.load(appventawebbd.Empleado.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado getEmpleadoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Empleado) session.get(appventawebbd.Empleado.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado loadEmpleadoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Empleado) session.load(appventawebbd.Empleado.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado getEmpleadoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Empleado) session.get(appventawebbd.Empleado.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmpleado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return queryEmpleado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmpleado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return queryEmpleado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado[] listEmpleadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return listEmpleadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado[] listEmpleadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return listEmpleadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEmpleado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From appventawebbd.Empleado as Empleado");
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
	
	public static List queryEmpleado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From appventawebbd.Empleado as Empleado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Empleado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado[] listEmpleadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEmpleado(session, condition, orderBy);
			return (Empleado[]) list.toArray(new Empleado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado[] listEmpleadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEmpleado(session, condition, orderBy, lockMode);
			return (Empleado[]) list.toArray(new Empleado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado loadEmpleadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return loadEmpleadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado loadEmpleadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return loadEmpleadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado loadEmpleadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Empleado[] empleados = listEmpleadoByQuery(session, condition, orderBy);
		if (empleados != null && empleados.length > 0)
			return empleados[0];
		else
			return null;
	}
	
	public static Empleado loadEmpleadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Empleado[] empleados = listEmpleadoByQuery(session, condition, orderBy, lockMode);
		if (empleados != null && empleados.length > 0)
			return empleados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEmpleadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return iterateEmpleadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEmpleadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return iterateEmpleadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEmpleadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From appventawebbd.Empleado as Empleado");
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
	
	public static java.util.Iterator iterateEmpleadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From appventawebbd.Empleado as Empleado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Empleado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado createEmpleado() {
		return new appventawebbd.Empleado();
	}
	
	public static boolean save(appventawebbd.Empleado empleado) throws PersistentException {
		try {
			AppventawebPersistentManager.instance().saveObject(empleado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(appventawebbd.Empleado empleado) throws PersistentException {
		try {
			AppventawebPersistentManager.instance().deleteObject(empleado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(appventawebbd.Empleado empleado)throws PersistentException {
		if (empleado instanceof appventawebbd.Administrador) {
			return appventawebbd.AdministradorDAO.deleteAndDissociate((appventawebbd.Administrador) empleado);
		}
		
		if (empleado instanceof appventawebbd.Encargado) {
			return appventawebbd.EncargadoDAO.deleteAndDissociate((appventawebbd.Encargado) empleado);
		}
		
		if (empleado instanceof appventawebbd.Transportista) {
			return appventawebbd.TransportistaDAO.deleteAndDissociate((appventawebbd.Transportista) empleado);
		}
		
		try {
			appventawebbd.Mensaje[] lMensajesEnviadoss = empleado.mensajesEnviados.toArray();
			for(int i = 0; i < lMensajesEnviadoss.length; i++) {
				lMensajesEnviadoss[i].setRemitente(null);
			}
			appventawebbd.Mensaje[] lMensajesRecibidoss = empleado.mensajesRecibidos.toArray();
			for(int i = 0; i < lMensajesRecibidoss.length; i++) {
				lMensajesRecibidoss[i].setDestinatario(null);
			}
			return delete(empleado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(appventawebbd.Empleado empleado, org.orm.PersistentSession session)throws PersistentException {
		if (empleado instanceof appventawebbd.Administrador) {
			return appventawebbd.AdministradorDAO.deleteAndDissociate((appventawebbd.Administrador) empleado, session);
		}
		
		if (empleado instanceof appventawebbd.Encargado) {
			return appventawebbd.EncargadoDAO.deleteAndDissociate((appventawebbd.Encargado) empleado, session);
		}
		
		if (empleado instanceof appventawebbd.Transportista) {
			return appventawebbd.TransportistaDAO.deleteAndDissociate((appventawebbd.Transportista) empleado, session);
		}
		
		try {
			appventawebbd.Mensaje[] lMensajesEnviadoss = empleado.mensajesEnviados.toArray();
			for(int i = 0; i < lMensajesEnviadoss.length; i++) {
				lMensajesEnviadoss[i].setRemitente(null);
			}
			appventawebbd.Mensaje[] lMensajesRecibidoss = empleado.mensajesRecibidos.toArray();
			for(int i = 0; i < lMensajesRecibidoss.length; i++) {
				lMensajesRecibidoss[i].setDestinatario(null);
			}
			try {
				session.delete(empleado);
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
	
	public static boolean refresh(appventawebbd.Empleado empleado) throws PersistentException {
		try {
			AppventawebPersistentManager.instance().getSession().refresh(empleado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(appventawebbd.Empleado empleado) throws PersistentException {
		try {
			AppventawebPersistentManager.instance().getSession().evict(empleado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Empleado loadEmpleadoByCriteria(EmpleadoCriteria empleadoCriteria) {
		Empleado[] empleados = listEmpleadoByCriteria(empleadoCriteria);
		if(empleados == null || empleados.length == 0) {
			return null;
		}
		return empleados[0];
	}
	
	public static Empleado[] listEmpleadoByCriteria(EmpleadoCriteria empleadoCriteria) {
		return empleadoCriteria.listEmpleado();
	}
}
