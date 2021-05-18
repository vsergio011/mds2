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
@Table(name="Item")
public class Item implements Serializable {
	public Item() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ITEM_PRODUCTO) {
			this.producto = (appventawebbd.Producto) owner;
		}
		
		else if (key == ORMConstants.KEY_ITEM_PEDIDO) {
			this.pedido = (appventawebbd.Pedido) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="APPVENTAWEBBD_ITEM_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="APPVENTAWEBBD_ITEM_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=appventawebbd.Pedido.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="PedidoId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKItem548829"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private appventawebbd.Pedido pedido;
	
	@ManyToOne(targetEntity=appventawebbd.Producto.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ProductoId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKItem306148"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private appventawebbd.Producto producto;
	
	@Column(name="IdProducto", nullable=false, length=10)	
	private int idProducto;
	
	@Column(name="IdPedido", nullable=false, length=10)	
	private int idPedido;
	
	@Column(name="Cantidad", nullable=false, length=10)	
	private int cantidad;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setIdProducto(int value) {
		this.idProducto = value;
	}
	
	public int getIdProducto() {
		return idProducto;
	}
	
	public void setIdPedido(int value) {
		this.idPedido = value;
	}
	
	public int getIdPedido() {
		return idPedido;
	}
	
	public void setCantidad(int value) {
		this.cantidad = value;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setProducto(appventawebbd.Producto value) {
		if (producto != null) {
			producto.items.remove(this);
		}
		if (value != null) {
			value.items.add(this);
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
	
	public void setPedido(appventawebbd.Pedido value) {
		if (pedido != null) {
			pedido.items.remove(this);
		}
		if (value != null) {
			value.items.add(this);
		}
	}
	
	public appventawebbd.Pedido getPedido() {
		return pedido;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Pedido(appventawebbd.Pedido value) {
		this.pedido = value;
	}
	
	private appventawebbd.Pedido getORM_Pedido() {
		return pedido;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
