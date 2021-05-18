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
@Table(name="Pedido")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Pedido")
public class Pedido implements Serializable {
	public Pedido() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PEDIDO_ITEMS) {
			return ORM_items;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PEDIDO_CIBERNAUTA) {
			this.cibernauta = (appventawebbd.Cibernauta) owner;
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
	@GeneratedValue(generator="APPVENTAWEBBD_PEDIDO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="APPVENTAWEBBD_PEDIDO_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=appventawebbd.Cibernauta.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="CibernautaUsuarioId", referencedColumnName="UsuarioId", nullable=false) }, foreignKey=@ForeignKey(name="FKPedido423899"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private appventawebbd.Cibernauta cibernauta;
	
	@Column(name="Total", nullable=false)	
	private double total;
	
	@Column(name="Direccion", nullable=true, length=255)	
	private String direccion;
	
	@Column(name="FormaPago", nullable=true, length=255)	
	private String formaPago;
	
	@Column(name="FechaPedido", nullable=true, length=255)	
	private String fechaPedido;
	
	@OneToMany(mappedBy="pedido", targetEntity=appventawebbd.Item.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_items = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setTotal(double value) {
		this.total = value;
	}
	
	public double getTotal() {
		return total;
	}
	
	public void setDireccion(String value) {
		this.direccion = value;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setFormaPago(String value) {
		this.formaPago = value;
	}
	
	public String getFormaPago() {
		return formaPago;
	}
	
	public void setFechaPedido(String value) {
		this.fechaPedido = value;
	}
	
	public String getFechaPedido() {
		return fechaPedido;
	}
	
	public void setCibernauta(appventawebbd.Cibernauta value) {
		if (cibernauta != null) {
			cibernauta.pedidos.remove(this);
		}
		if (value != null) {
			value.pedidos.add(this);
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
	
	private void setORM_Items(java.util.Set value) {
		this.ORM_items = value;
	}
	
	private java.util.Set getORM_Items() {
		return ORM_items;
	}
	
	@Transient	
	public final appventawebbd.ItemSetCollection items = new appventawebbd.ItemSetCollection(this, _ormAdapter, ORMConstants.KEY_PEDIDO_ITEMS, ORMConstants.KEY_ITEM_PEDIDO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
