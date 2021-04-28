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
@Table(name="Mensaje")
public class Mensaje implements Serializable {
	public Mensaje() {
	}
	
	public static Mensaje loadMensajeByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return loadMensajeByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje getMensajeByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return getMensajeByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return loadMensajeByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje getMensajeByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return getMensajeByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Mensaje) session.load(Diagrama_BD.Mensaje.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje getMensajeByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Mensaje) session.get(Diagrama_BD.Mensaje.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Mensaje) session.load(Diagrama_BD.Mensaje.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje getMensajeByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Mensaje) session.get(Diagrama_BD.Mensaje.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMensaje(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return queryMensaje(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMensaje(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return queryMensaje(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje[] listMensajeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return listMensajeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje[] listMensajeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return listMensajeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMensaje(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.Mensaje as Mensaje");
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
	
	public static List queryMensaje(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.Mensaje as Mensaje");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Mensaje", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje[] listMensajeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMensaje(session, condition, orderBy);
			return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje[] listMensajeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMensaje(session, condition, orderBy, lockMode);
			return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return loadMensajeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return loadMensajeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Mensaje[] mensajes = listMensajeByQuery(session, condition, orderBy);
		if (mensajes != null && mensajes.length > 0)
			return mensajes[0];
		else
			return null;
	}
	
	public static Mensaje loadMensajeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Mensaje[] mensajes = listMensajeByQuery(session, condition, orderBy, lockMode);
		if (mensajes != null && mensajes.length > 0)
			return mensajes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMensajeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return iterateMensajeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMensajeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return iterateMensajeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMensajeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.Mensaje as Mensaje");
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
	
	public static java.util.Iterator iterateMensajeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.Mensaje as Mensaje");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Mensaje", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByCriteria(MensajeCriteria mensajeCriteria) {
		Mensaje[] mensajes = listMensajeByCriteria(mensajeCriteria);
		if(mensajes == null || mensajes.length == 0) {
			return null;
		}
		return mensajes[0];
	}
	
	public static Mensaje[] listMensajeByCriteria(MensajeCriteria mensajeCriteria) {
		return mensajeCriteria.listMensaje();
	}
	
	public static Mensaje createMensaje() {
		return new Diagrama_BD.Mensaje();
	}
	
	public boolean save() throws PersistentException {
		try {
			Diagrama_BD.AppventawebPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			Diagrama_BD.AppventawebPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			Diagrama_BD.AppventawebPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			Diagrama_BD.AppventawebPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			if(getOriginal() != null) {
				getOriginal().respuestas.remove(this);
			}
			
			if(getDestinatario() != null) {
				getDestinatario().mensajesRecibidos.remove(this);
			}
			
			if(getRemitente() != null) {
				getRemitente().mensajesEnviados.remove(this);
			}
			
			Diagrama_BD.Mensaje[] lRespuestass = respuestas.toArray();
			for(int i = 0; i < lRespuestass.length; i++) {
				lRespuestass[i].setOriginal(null);
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
			if(getOriginal() != null) {
				getOriginal().respuestas.remove(this);
			}
			
			if(getDestinatario() != null) {
				getDestinatario().mensajesRecibidos.remove(this);
			}
			
			if(getRemitente() != null) {
				getRemitente().mensajesEnviados.remove(this);
			}
			
			Diagrama_BD.Mensaje[] lRespuestass = respuestas.toArray();
			for(int i = 0; i < lRespuestass.length; i++) {
				lRespuestass[i].setOriginal(null);
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
		if (key == Diagrama_BD.ORMConstants.KEY_MENSAJE_RESPUESTAS) {
			return ORM_respuestas;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == Diagrama_BD.ORMConstants.KEY_MENSAJE_REMITENTE) {
			this.remitente = (Diagrama_BD.Usuario) owner;
		}
		
		else if (key == Diagrama_BD.ORMConstants.KEY_MENSAJE_DESTINATARIO) {
			this.destinatario = (Diagrama_BD.Usuario) owner;
		}
		
		else if (key == Diagrama_BD.ORMConstants.KEY_MENSAJE_ORIGINAL) {
			this.original = (Diagrama_BD.Mensaje) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DIAGRAMA_BD_MENSAJE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DIAGRAMA_BD_MENSAJE_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=Diagrama_BD.Mensaje.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="MensajeId", referencedColumnName="Id") }, foreignKey=@ForeignKey(name="FKMensaje450879"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Diagrama_BD.Mensaje original;
	
	@ManyToOne(targetEntity=Diagrama_BD.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioId2", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje844274"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Diagrama_BD.Usuario destinatario;
	
	@ManyToOne(targetEntity=Diagrama_BD.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje983508"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Diagrama_BD.Usuario remitente;
	
	@Column(name="Asunto", nullable=true, length=255)	
	private String Asunto;
	
	@Column(name="Cuerpo", nullable=true, length=255)	
	private String Cuerpo;
	
	@Column(name="AsosciacionReflexiva", nullable=true, length=10)	
	private int AsosciacionReflexiva;
	
	@OneToMany(mappedBy="original", targetEntity=Diagrama_BD.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_respuestas = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setAsunto(String value) {
		this.Asunto = value;
	}
	
	public String getAsunto() {
		return Asunto;
	}
	
	public void setCuerpo(String value) {
		this.Cuerpo = value;
	}
	
	public String getCuerpo() {
		return Cuerpo;
	}
	
	public void setAsosciacionReflexiva(int value) {
		this.AsosciacionReflexiva = value;
	}
	
	public int getAsosciacionReflexiva() {
		return AsosciacionReflexiva;
	}
	
	public void setRemitente(Diagrama_BD.Usuario value) {
		if (remitente != null) {
			remitente.mensajesEnviados.remove(this);
		}
		if (value != null) {
			value.mensajesEnviados.add(this);
		}
	}
	
	public Diagrama_BD.Usuario getRemitente() {
		return remitente;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Remitente(Diagrama_BD.Usuario value) {
		this.remitente = value;
	}
	
	private Diagrama_BD.Usuario getORM_Remitente() {
		return remitente;
	}
	
	public void setDestinatario(Diagrama_BD.Usuario value) {
		if (destinatario != null) {
			destinatario.mensajesRecibidos.remove(this);
		}
		if (value != null) {
			value.mensajesRecibidos.add(this);
		}
	}
	
	public Diagrama_BD.Usuario getDestinatario() {
		return destinatario;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Destinatario(Diagrama_BD.Usuario value) {
		this.destinatario = value;
	}
	
	private Diagrama_BD.Usuario getORM_Destinatario() {
		return destinatario;
	}
	
	private void setORM_Respuestas(java.util.Set value) {
		this.ORM_respuestas = value;
	}
	
	private java.util.Set getORM_Respuestas() {
		return ORM_respuestas;
	}
	
	@Transient	
	public final Diagrama_BD.MensajeSetCollection respuestas = new Diagrama_BD.MensajeSetCollection(this, _ormAdapter, Diagrama_BD.ORMConstants.KEY_MENSAJE_RESPUESTAS, Diagrama_BD.ORMConstants.KEY_MENSAJE_ORIGINAL, Diagrama_BD.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setOriginal(Diagrama_BD.Mensaje value) {
		if (original != null) {
			original.respuestas.remove(this);
		}
		if (value != null) {
			value.respuestas.add(this);
		}
	}
	
	public Diagrama_BD.Mensaje getOriginal() {
		return original;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Original(Diagrama_BD.Mensaje value) {
		this.original = value;
	}
	
	private Diagrama_BD.Mensaje getORM_Original() {
		return original;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
