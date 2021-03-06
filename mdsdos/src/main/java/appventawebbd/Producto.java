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
@Table(name="Producto")
public class Producto implements Serializable {
	public Producto() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PRODUCTO_COMENTARIOS) {
			return ORM_comentarios;
		}
		else if (key == ORMConstants.KEY_PRODUCTO_OFERTAS) {
			return ORM_ofertas;
		}
		else if (key == ORMConstants.KEY_PRODUCTO_ITEMS) {
			return ORM_items;
		}
		else if (key == ORMConstants.KEY_PRODUCTO_FOTOSPRODUCTO) {
			return ORM_fotosProducto;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PRODUCTO_CATEGORIA) {
			this.categoria = (appventawebbd.Categoria) owner;
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
	@GeneratedValue(generator="APPVENTAWEBBD_PRODUCTO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="APPVENTAWEBBD_PRODUCTO_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=appventawebbd.Categoria.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="CategoriaId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKProducto904800"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private appventawebbd.Categoria categoria;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Descripcion", nullable=true, length=255)	
	private String descripcion;
	
	@Column(name="Detalles", nullable=true, length=255)	
	private String detalles;
	
	@Column(name="Fotos", nullable=true, length=255)	
	private String fotos;
	
	@Column(name="Precio", nullable=false)	
	private double precio;
	
	@Column(name="ValoracionMedia", nullable=false)	
	private double valoracionMedia;
	
	@OneToMany(mappedBy="producto", targetEntity=appventawebbd.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_comentarios = new java.util.HashSet();
	
	@OneToMany(mappedBy="producto", targetEntity=appventawebbd.Oferta.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_ofertas = new java.util.HashSet();
	
	@OneToMany(mappedBy="producto", targetEntity=appventawebbd.Item.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_items = new java.util.HashSet();
	
	@OneToMany(mappedBy="productoFoto", targetEntity=appventawebbd.Foto.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_fotosProducto = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDetalles(String value) {
		this.detalles = value;
	}
	
	public String getDetalles() {
		return detalles;
	}
	
	public void setFotos(String value) {
		this.fotos = value;
	}
	
	public String getFotos() {
		return fotos;
	}
	
	public void setPrecio(double value) {
		this.precio = value;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setValoracionMedia(double value) {
		this.valoracionMedia = value;
	}
	
	public double getValoracionMedia() {
		return valoracionMedia;
	}
	
	private void setORM_Comentarios(java.util.Set value) {
		this.ORM_comentarios = value;
	}
	
	private java.util.Set getORM_Comentarios() {
		return ORM_comentarios;
	}
	
	@Transient	
	public final appventawebbd.ComentarioSetCollection comentarios = new appventawebbd.ComentarioSetCollection(this, _ormAdapter, ORMConstants.KEY_PRODUCTO_COMENTARIOS, ORMConstants.KEY_COMENTARIO_PRODUCTO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Ofertas(java.util.Set value) {
		this.ORM_ofertas = value;
	}
	
	private java.util.Set getORM_Ofertas() {
		return ORM_ofertas;
	}
	
	@Transient	
	public final appventawebbd.OfertaSetCollection ofertas = new appventawebbd.OfertaSetCollection(this, _ormAdapter, ORMConstants.KEY_PRODUCTO_OFERTAS, ORMConstants.KEY_OFERTA_PRODUCTO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setCategoria(appventawebbd.Categoria value) {
		if (categoria != null) {
			categoria.productos.remove(this);
		}
		if (value != null) {
			value.productos.add(this);
		}
	}
	
	public appventawebbd.Categoria getCategoria() {
		return categoria;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Categoria(appventawebbd.Categoria value) {
		this.categoria = value;
	}
	
	private appventawebbd.Categoria getORM_Categoria() {
		return categoria;
	}
	
	private void setORM_Items(java.util.Set value) {
		this.ORM_items = value;
	}
	
	private java.util.Set getORM_Items() {
		return ORM_items;
	}
	
	@Transient	
	public final appventawebbd.ItemSetCollection items = new appventawebbd.ItemSetCollection(this, _ormAdapter, ORMConstants.KEY_PRODUCTO_ITEMS, ORMConstants.KEY_ITEM_PRODUCTO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_FotosProducto(java.util.Set value) {
		this.ORM_fotosProducto = value;
	}
	
	private java.util.Set getORM_FotosProducto() {
		return ORM_fotosProducto;
	}
	
	@Transient	
	public final appventawebbd.FotoSetCollection fotosProducto = new appventawebbd.FotoSetCollection(this, _ormAdapter, ORMConstants.KEY_PRODUCTO_FOTOSPRODUCTO, ORMConstants.KEY_FOTO_PRODUCTOFOTO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
