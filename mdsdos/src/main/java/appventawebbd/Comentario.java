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
@Table(name="Comentario")
public class Comentario implements Serializable {
	public Comentario() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_COMENTARIO_PRODUCTO) {
			this.producto = (appventawebbd.Producto) owner;
		}
		
		else if (key == ORMConstants.KEY_COMENTARIO_CIBERNAUTA) {
			this.cibernauta = (appventawebbd.Cibernauta) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="APPVENTAWEBBD_COMENTARIO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="APPVENTAWEBBD_COMENTARIO_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=appventawebbd.Cibernauta.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="CibernautaUsuarioId", referencedColumnName="UsuarioId", nullable=false) }, foreignKey=@ForeignKey(name="FKComentario63763"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private appventawebbd.Cibernauta cibernauta;
	
	@ManyToOne(targetEntity=appventawebbd.Producto.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ProductoId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKComentario386234"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private appventawebbd.Producto producto;
	
	@Column(name="Valoracion", nullable=false, length=10)	
	private int valoracion;
	
	@Column(name="Texto", nullable=true, length=255)	
	private String texto;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setValoracion(int value) {
		this.valoracion = value;
	}
	
	public int getValoracion() {
		return valoracion;
	}
	
	public void setTexto(String value) {
		this.texto = value;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setProducto(appventawebbd.Producto value) {
		if (producto != null) {
			producto.comentarios.remove(this);
		}
		if (value != null) {
			value.comentarios.add(this);
		}
	}
	
	public appventawebbd.Producto getProducto() {
		return producto;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Producto(appventawebbd.Producto value) {
		this.producto = value;
	}
	
	private appventawebbd.Producto getORM_Producto() {
		return producto;
	}
	
	public void setCibernauta(appventawebbd.Cibernauta value) {
		if (cibernauta != null) {
			cibernauta.comentario.remove(this);
		}
		if (value != null) {
			value.comentario.add(this);
		}
	}
	
	public appventawebbd.Cibernauta getCibernauta() {
		return cibernauta;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Cibernauta(appventawebbd.Cibernauta value) {
		this.cibernauta = value;
	}
	
	private appventawebbd.Cibernauta getORM_Cibernauta() {
		return cibernauta;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
