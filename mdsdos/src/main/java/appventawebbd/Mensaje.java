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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Mensaje")
public class Mensaje implements Serializable {
	public Mensaje() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MENSAJE_RESPUESTAS) {
			return ORM_respuestas;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_MENSAJE_REMITENTE) {
			this.remitente = (appventawebbd.Usuario) owner;
		}
		
		else if (key == ORMConstants.KEY_MENSAJE_DESTINATARIO) {
			this.destinatario = (appventawebbd.Usuario) owner;
		}
		
		else if (key == ORMConstants.KEY_MENSAJE_ORIGINAL) {
			this.original = (appventawebbd.Mensaje) owner;
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
	@GeneratedValue(generator="APPVENTAWEBBD_MENSAJE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="APPVENTAWEBBD_MENSAJE_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=appventawebbd.Mensaje.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="MensajeId", referencedColumnName="Id") }, foreignKey=@ForeignKey(name="FKMensaje450879"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private appventawebbd.Mensaje original;
	
	@ManyToOne(targetEntity=appventawebbd.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioId2", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje844274"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private appventawebbd.Usuario destinatario;
	
	@ManyToOne(targetEntity=appventawebbd.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje983508"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private appventawebbd.Usuario remitente;
	
	@Column(name="Asunto", nullable=true, length=255)	
	private String Asunto;
	
	@Column(name="Cuerpo", nullable=true, length=255)	
	private String Cuerpo;
	
	@Column(name="AsosciacionReflexiva", nullable=true, length=10)	
	private int AsosciacionReflexiva;
	
	@OneToMany(mappedBy="original", targetEntity=appventawebbd.Mensaje.class)	
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
	
	public void setRemitente(appventawebbd.Usuario value) {
		if (remitente != null) {
			remitente.mensajesEnviados.remove(this);
		}
		if (value != null) {
			value.mensajesEnviados.add(this);
		}
	}
	
	public appventawebbd.Usuario getRemitente() {
		return remitente;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Remitente(appventawebbd.Usuario value) {
		this.remitente = value;
	}
	
	private appventawebbd.Usuario getORM_Remitente() {
		return remitente;
	}
	
	public void setDestinatario(appventawebbd.Usuario value) {
		if (destinatario != null) {
			destinatario.mensajesRecibidos.remove(this);
		}
		if (value != null) {
			value.mensajesRecibidos.add(this);
		}
	}
	
	public appventawebbd.Usuario getDestinatario() {
		return destinatario;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Destinatario(appventawebbd.Usuario value) {
		this.destinatario = value;
	}
	
	private appventawebbd.Usuario getORM_Destinatario() {
		return destinatario;
	}
	
	private void setORM_Respuestas(java.util.Set value) {
		this.ORM_respuestas = value;
	}
	
	private java.util.Set getORM_Respuestas() {
		return ORM_respuestas;
	}
	
	@Transient	
	public final appventawebbd.MensajeSetCollection respuestas = new appventawebbd.MensajeSetCollection(this, _ormAdapter, ORMConstants.KEY_MENSAJE_RESPUESTAS, ORMConstants.KEY_MENSAJE_ORIGINAL, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setOriginal(appventawebbd.Mensaje value) {
		if (original != null) {
			original.respuestas.remove(this);
		}
		if (value != null) {
			value.respuestas.add(this);
		}
	}
	
	public appventawebbd.Mensaje getOriginal() {
		return original;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Original(appventawebbd.Mensaje value) {
		this.original = value;
	}
	
	private appventawebbd.Mensaje getORM_Original() {
		return original;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
