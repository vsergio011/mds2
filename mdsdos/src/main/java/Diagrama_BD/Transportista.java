/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package Diagrama_BD;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Transportista")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Transportista")
public class Transportista extends Diagrama_BD.Empleado implements Serializable {
	public Transportista() {
	}
	
	public static Transportista loadTransportistaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return loadTransportistaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista getTransportistaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return getTransportistaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista loadTransportistaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return loadTransportistaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista getTransportistaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return getTransportistaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista loadTransportistaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Transportista) session.load(Diagrama_BD.Transportista.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista getTransportistaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Transportista) session.get(Diagrama_BD.Transportista.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista loadTransportistaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Transportista) session.load(Diagrama_BD.Transportista.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista getTransportistaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Transportista) session.get(Diagrama_BD.Transportista.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTransportista(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return queryTransportista(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTransportista(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return queryTransportista(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista[] listTransportistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return listTransportistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista[] listTransportistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return listTransportistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTransportista(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.Transportista as Transportista");
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
		StringBuffer sb = new StringBuffer("From diagrama_bd.Transportista as Transportista");
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
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return loadTransportistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Transportista loadTransportistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
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
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return iterateTransportistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTransportistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return iterateTransportistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTransportistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.Transportista as Transportista");
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
		StringBuffer sb = new StringBuffer("From diagrama_bd.Transportista as Transportista");
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
	
	public static Transportista createTransportista() {
		return new Diagrama_BD.Transportista();
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			Diagrama_BD.Enviado[] lEnviadoss = enviados.toArray();
			for(int i = 0; i < lEnviadoss.length; i++) {
				lEnviadoss[i].setTransportista(null);
			}
			Diagrama_BD.Mensaje[] lMensajesEnviadoss = mensajesEnviados.toArray();
			for(int i = 0; i < lMensajesEnviadoss.length; i++) {
				lMensajesEnviadoss[i].setRemitente(null);
			}
			Diagrama_BD.Mensaje[] lMensajesRecibidoss = mensajesRecibidos.toArray();
			for(int i = 0; i < lMensajesRecibidoss.length; i++) {
				lMensajesRecibidoss[i].setDestinatario(null);
			}
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			Diagrama_BD.Enviado[] lEnviadoss = enviados.toArray();
			for(int i = 0; i < lEnviadoss.length; i++) {
				lEnviadoss[i].setTransportista(null);
			}
			Diagrama_BD.Mensaje[] lMensajesEnviadoss = mensajesEnviados.toArray();
			for(int i = 0; i < lMensajesEnviadoss.length; i++) {
				lMensajesEnviadoss[i].setRemitente(null);
			}
			Diagrama_BD.Mensaje[] lMensajesRecibidoss = mensajesRecibidos.toArray();
			for(int i = 0; i < lMensajesRecibidoss.length; i++) {
				lMensajesRecibidoss[i].setDestinatario(null);
			}
			try {
				session.delete(this);
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
	
	private java.util.Set this_getSet (int key) {
		if (key == Diagrama_BD.ORMConstants.KEY_TRANSPORTISTA_ENVIADOS) {
			return ORM_enviados;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@OneToMany(mappedBy="transportista", targetEntity=Diagrama_BD.Enviado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_enviados = new java.util.HashSet();
	
	private void setORM_Enviados(java.util.Set value) {
		this.ORM_enviados = value;
	}
	
	private java.util.Set getORM_Enviados() {
		return ORM_enviados;
	}
	
	@Transient	
	public final Diagrama_BD.EnviadoSetCollection enviados = new Diagrama_BD.EnviadoSetCollection(this, _ormAdapter, Diagrama_BD.ORMConstants.KEY_TRANSPORTISTA_ENVIADOS, Diagrama_BD.ORMConstants.KEY_ENVIADO_TRANSPORTISTA, Diagrama_BD.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
