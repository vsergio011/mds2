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
@Table(name="Foto")
public class Foto implements Serializable {
	public Foto() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_FOTO_PRODUCTOFOTO) {
			this.productoFoto = (appventawebbd.Producto) owner;
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
	@GeneratedValue(generator="APPVENTAWEBBD_FOTO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="APPVENTAWEBBD_FOTO_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=appventawebbd.Producto.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ProductoId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKFoto399859"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private appventawebbd.Producto productoFoto;
	
	@Column(name="Ruta", nullable=true, length=255)	
	private String ruta;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setRuta(String value) {
		this.ruta = value;
	}
	
	public String getRuta() {
		return ruta;
	}
	
	public void setProductoFoto(appventawebbd.Producto value) {
		if (productoFoto != null) {
			productoFoto.fotosProducto.remove(this);
		}
		if (value != null) {
			value.fotosProducto.add(this);
		}
	}
	
	public appventawebbd.Producto getProductoFoto() {
		return productoFoto;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_ProductoFoto(appventawebbd.Producto value) {
		this.productoFoto = value;
	}
	
	private appventawebbd.Producto getORM_ProductoFoto() {
		return productoFoto;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
