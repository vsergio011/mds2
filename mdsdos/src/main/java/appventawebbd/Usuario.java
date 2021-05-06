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
@Table(name="Usuario")
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuario implements Serializable {
	public Usuario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIO_MENSAJESENVIADOS) {
			return ORM_mensajesEnviados;
		}
		else if (key == ORMConstants.KEY_USUARIO_MENSAJESRECIBIDOS) {
			return ORM_mensajesRecibidos;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="APPVENTAWEBBD_USUARIO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="APPVENTAWEBBD_USUARIO_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Tipo", nullable=true, length=10)	
	private int tipo;
	
	@Column(name="Usuario", nullable=true, length=255)	
	private String usuario;
	
	@Column(name="Password", nullable=true, length=255)	
	private String password;
	
	@Column(name="CorreoElectronico", nullable=true, length=255)	
	private String correoElectronico;
	
	@Column(name="Apellidos", nullable=true, length=255)	
	private String apellidos;
	
	@Column(name="FormaPago", nullable=true, length=255)	
	private String formaPago;
	
	@Column(name="Foto", nullable=true, length=255)	
	private String foto;
	
	@Column(name="DireccionCompleta", nullable=true, length=255)	
	private String direccionCompleta;
	
	@Column(name="Operativo", nullable=false, length=1)	
	private boolean operativo;
	
	@OneToMany(mappedBy="remitente", targetEntity=appventawebbd.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_mensajesEnviados = new java.util.HashSet();
	
	@OneToMany(mappedBy="destinatario", targetEntity=appventawebbd.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_mensajesRecibidos = new java.util.HashSet();
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setTipo(int value) {
		this.tipo = value;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public void setUsuario(String value) {
		this.usuario = value;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setCorreoElectronico(String value) {
		this.correoElectronico = value;
	}
	
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	
	public void setApellidos(String value) {
		this.apellidos = value;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setFormaPago(String value) {
		this.formaPago = value;
	}
	
	public String getFormaPago() {
		return formaPago;
	}
	
	public void setFoto(String value) {
		this.foto = value;
	}
	
	public String getFoto() {
		return foto;
	}
	
	public void setDireccionCompleta(String value) {
		this.direccionCompleta = value;
	}
	
	public String getDireccionCompleta() {
		return direccionCompleta;
	}
	
	public void setOperativo(boolean value) {
		this.operativo = value;
	}
	
	public boolean getOperativo() {
		return operativo;
	}
	
	private void setORM_MensajesEnviados(java.util.Set value) {
		this.ORM_mensajesEnviados = value;
	}
	
	private java.util.Set getORM_MensajesEnviados() {
		return ORM_mensajesEnviados;
	}
	
	@Transient	
	public final appventawebbd.MensajeSetCollection mensajesEnviados = new appventawebbd.MensajeSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_MENSAJESENVIADOS, ORMConstants.KEY_MENSAJE_REMITENTE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_MensajesRecibidos(java.util.Set value) {
		this.ORM_mensajesRecibidos = value;
	}
	
	private java.util.Set getORM_MensajesRecibidos() {
		return ORM_mensajesRecibidos;
	}
	
	@Transient	
	public final appventawebbd.MensajeSetCollection mensajesRecibidos = new appventawebbd.MensajeSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_MENSAJESRECIBIDOS, ORMConstants.KEY_MENSAJE_DESTINATARIO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
