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

public class EnviadoDAO {
	public static Enviado loadEnviadoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return loadEnviadoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado getEnviadoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return getEnviadoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado loadEnviadoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return loadEnviadoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado getEnviadoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return getEnviadoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado loadEnviadoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Enviado) session.load(appventawebbd.Enviado.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado getEnviadoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Enviado) session.get(appventawebbd.Enviado.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado loadEnviadoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Enviado) session.load(appventawebbd.Enviado.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado getEnviadoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Enviado) session.get(appventawebbd.Enviado.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEnviado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return queryEnviado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEnviado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return queryEnviado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado[] listEnviadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return listEnviadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado[] listEnviadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return listEnviadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEnviado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From appventawebbd.Enviado as Enviado");
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
	
	public static List queryEnviado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From appventawebbd.Enviado as Enviado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Enviado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado[] listEnviadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEnviado(session, condition, orderBy);
			return (Enviado[]) list.toArray(new Enviado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado[] listEnviadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEnviado(session, condition, orderBy, lockMode);
			return (Enviado[]) list.toArray(new Enviado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado loadEnviadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return loadEnviadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado loadEnviadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return loadEnviadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado loadEnviadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Enviado[] enviados = listEnviadoByQuery(session, condition, orderBy);
		if (enviados != null && enviados.length > 0)
			return enviados[0];
		else
			return null;
	}
	
	public static Enviado loadEnviadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Enviado[] enviados = listEnviadoByQuery(session, condition, orderBy, lockMode);
		if (enviados != null && enviados.length > 0)
			return enviados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEnviadoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return iterateEnviadoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEnviadoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AppventawebPersistentManager.instance().getSession();
			return iterateEnviadoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEnviadoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From appventawebbd.Enviado as Enviado");
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
	
	public static java.util.Iterator iterateEnviadoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From appventawebbd.Enviado as Enviado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Enviado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado createEnviado() {
		return new appventawebbd.Enviado();
	}
	
	public static boolean save(appventawebbd.Enviado enviado) throws PersistentException {
		try {
			AppventawebPersistentManager.instance().saveObject(enviado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(appventawebbd.Enviado enviado) throws PersistentException {
		try {
			AppventawebPersistentManager.instance().deleteObject(enviado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(appventawebbd.Enviado enviado)throws PersistentException {
		try {
			if (enviado.getTransportistaEnvio() != null) {
				enviado.getTransportistaEnvio().enviados.remove(enviado);
			}
			
			if (enviado.getCibernauta() != null) {
				enviado.getCibernauta().pedidos.remove(enviado);
			}
			
			appventawebbd.Item[] lItemss = enviado.items.toArray();
			for(int i = 0; i < lItemss.length; i++) {
				lItemss[i].setPedido(null);
			}
			return delete(enviado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(appventawebbd.Enviado enviado, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (enviado.getTransportistaEnvio() != null) {
				enviado.getTransportistaEnvio().enviados.remove(enviado);
			}
			
			if (enviado.getCibernauta() != null) {
				enviado.getCibernauta().pedidos.remove(enviado);
			}
			
			appventawebbd.Item[] lItemss = enviado.items.toArray();
			for(int i = 0; i < lItemss.length; i++) {
				lItemss[i].setPedido(null);
			}
			try {
				session.delete(enviado);
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
	
	public static boolean refresh(appventawebbd.Enviado enviado) throws PersistentException {
		try {
			AppventawebPersistentManager.instance().getSession().refresh(enviado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
<<<<<<< HEAD:mdsdos/src/main/java/Diagrama_BD/Enviado.java
		
	};
	
	@Column(name="Fecha", nullable=true)	
	//private date fecha;
	
	//@ManyToOne(targetEntity=Diagrama_BD.Transportista.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TransportistaUsuarioId", referencedColumnName="UsuarioId", nullable=false) }, foreignKey=@ForeignKey(name="FKEnviado826798"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Diagrama_BD.Transportista transportista;
	
	/*public void setFecha(date value) {
		this.fecha = value;
=======
>>>>>>> 5fb90ba799d9eb89af5d59a016856f805feda354:mdsdos/src/main/java/appventawebbd/EnviadoDAO.java
	}
	
	public static boolean evict(appventawebbd.Enviado enviado) throws PersistentException {
		try {
			AppventawebPersistentManager.instance().getSession().evict(enviado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Enviado loadEnviadoByCriteria(EnviadoCriteria enviadoCriteria) {
		Enviado[] enviados = listEnviadoByCriteria(enviadoCriteria);
		if(enviados == null || enviados.length == 0) {
			return null;
		}
		return enviados[0];
	}
	
	public static Enviado[] listEnviadoByCriteria(EnviadoCriteria enviadoCriteria) {
		return enviadoCriteria.listEnviado();
	}
}
