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
@Table(name="Oferta")
public class Oferta implements Serializable {
	public Oferta() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_OFERTA_PRODUCTO) {
			this.producto = (appventawebbd.Producto) owner;
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
	@GeneratedValue(generator="APPVENTAWEBBD_OFERTA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="APPVENTAWEBBD_OFERTA_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=appventawebbd.Producto.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ProductoId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKOferta430958"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private appventawebbd.Producto producto;
	
	@Column(name="FechaFin", nullable=true, length=255)	
	private String fechaFin;
	
	@Column(name="Precio", nullable=false)	
	private double precio;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setFechaFin(String value) {
		this.fechaFin = value;
	}
	
	public String getFechaFin() {
		return fechaFin;
	}
	
	public void setPrecio(double value) {
		this.precio = value;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setProducto(appventawebbd.Producto value) {
		if (producto != null) {
			producto.ofertas.remove(this);
		}
		if (value != null) {
			value.ofertas.add(this);
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
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
