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
@Table(name="Cibernauta")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Cibernauta")
@PrimaryKeyJoinColumn(name="UsuarioId", referencedColumnName="Id")
public class Cibernauta extends Diagrama_BD.Usuario implements Serializable {
	public Cibernauta() {
	}
	
	public static Cibernauta loadCibernautaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return loadCibernautaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta getCibernautaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return getCibernautaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta loadCibernautaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return loadCibernautaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta getCibernautaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return getCibernautaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta loadCibernautaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Cibernauta) session.load(Diagrama_BD.Cibernauta.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta getCibernautaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Cibernauta) session.get(Diagrama_BD.Cibernauta.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta loadCibernautaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cibernauta) session.load(Diagrama_BD.Cibernauta.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta getCibernautaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cibernauta) session.get(Diagrama_BD.Cibernauta.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCibernauta(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return queryCibernauta(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCibernauta(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return queryCibernauta(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta[] listCibernautaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return listCibernautaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta[] listCibernautaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return listCibernautaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCibernauta(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.Cibernauta as Cibernauta");
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
		StringBuffer sb = new StringBuffer("From diagrama_bd.Cibernauta as Cibernauta");
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
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return loadCibernautaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cibernauta loadCibernautaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
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
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return iterateCibernautaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCibernautaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return iterateCibernautaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCibernautaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.Cibernauta as Cibernauta");
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
		StringBuffer sb = new StringBuffer("From diagrama_bd.Cibernauta as Cibernauta");
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
	
	public static Cibernauta createCibernauta() {
		return new Diagrama_BD.Cibernauta();
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			Diagrama_BD.Pedido[] lPedidoss = pedidos.toArray();
			for(int i = 0; i < lPedidoss.length; i++) {
				lPedidoss[i].setCibernauta(null);
			}
			Diagrama_BD.Comentario[] lComentarios = comentario.toArray();
			for(int i = 0; i < lComentarios.length; i++) {
				lComentarios[i].setCibernauta(null);
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
			Diagrama_BD.Pedido[] lPedidoss = pedidos.toArray();
			for(int i = 0; i < lPedidoss.length; i++) {
				lPedidoss[i].setCibernauta(null);
			}
			Diagrama_BD.Comentario[] lComentarios = comentario.toArray();
			for(int i = 0; i < lComentarios.length; i++) {
				lComentarios[i].setCibernauta(null);
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
		if (key == Diagrama_BD.ORMConstants.KEY_CIBERNAUTA_PEDIDOS) {
			return ORM_pedidos;
		}
		else if (key == Diagrama_BD.ORMConstants.KEY_CIBERNAUTA_COMENTARIO) {
			return ORM_comentario;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@OneToMany(mappedBy="cibernauta", targetEntity=Diagrama_BD.Pedido.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_pedidos = new java.util.HashSet();
	
	@OneToMany(mappedBy="cibernauta", targetEntity=Diagrama_BD.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_comentario = new java.util.HashSet();
	
	private void setORM_Pedidos(java.util.Set value) {
		this.ORM_pedidos = value;
	}
	
	private java.util.Set getORM_Pedidos() {
		return ORM_pedidos;
	}
	
	@Transient	
	public final Diagrama_BD.PedidoSetCollection pedidos = new Diagrama_BD.PedidoSetCollection(this, _ormAdapter, Diagrama_BD.ORMConstants.KEY_CIBERNAUTA_PEDIDOS, Diagrama_BD.ORMConstants.KEY_PEDIDO_CIBERNAUTA, Diagrama_BD.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Comentario(java.util.Set value) {
		this.ORM_comentario = value;
	}
	
	private java.util.Set getORM_Comentario() {
		return ORM_comentario;
	}
	
	@Transient	
	public final Diagrama_BD.ComentarioSetCollection comentario = new Diagrama_BD.ComentarioSetCollection(this, _ormAdapter, Diagrama_BD.ORMConstants.KEY_CIBERNAUTA_COMENTARIO, Diagrama_BD.ORMConstants.KEY_COMENTARIO_CIBERNAUTA, Diagrama_BD.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
