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
@Table(name="Producto")
public class Producto implements Serializable {
	public Producto() {
	}
	
	public static Producto loadProductoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return loadProductoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto getProductoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return getProductoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return loadProductoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto getProductoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return getProductoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Producto) session.load(Diagrama_BD.Producto.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto getProductoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Producto) session.get(Diagrama_BD.Producto.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Producto) session.load(Diagrama_BD.Producto.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto getProductoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Producto) session.get(Diagrama_BD.Producto.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return queryProducto(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return queryProducto(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto[] listProductoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return listProductoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto[] listProductoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return listProductoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProducto(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.Producto as Producto");
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
	
	public static List queryProducto(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.Producto as Producto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Producto", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto[] listProductoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProducto(session, condition, orderBy);
			return (Producto[]) list.toArray(new Producto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto[] listProductoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProducto(session, condition, orderBy, lockMode);
			return (Producto[]) list.toArray(new Producto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return loadProductoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return loadProductoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Producto[] productos = listProductoByQuery(session, condition, orderBy);
		if (productos != null && productos.length > 0)
			return productos[0];
		else
			return null;
	}
	
	public static Producto loadProductoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Producto[] productos = listProductoByQuery(session, condition, orderBy, lockMode);
		if (productos != null && productos.length > 0)
			return productos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProductoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return iterateProductoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProductoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = Diagrama_BD.AppventawebPersistentManager.instance().getSession();
			return iterateProductoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProductoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.Producto as Producto");
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
	
	public static java.util.Iterator iterateProductoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_bd.Producto as Producto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Producto", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Producto loadProductoByCriteria(ProductoCriteria productoCriteria) {
		Producto[] productos = listProductoByCriteria(productoCriteria);
		if(productos == null || productos.length == 0) {
			return null;
		}
		return productos[0];
	}
	
	public static Producto[] listProductoByCriteria(ProductoCriteria productoCriteria) {
		return productoCriteria.listProducto();
	}
	
	public static Producto createProducto() {
		return new Diagrama_BD.Producto();
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
			if(getCategoria() != null) {
				getCategoria().productos.remove(this);
			}
			
			Diagrama_BD.Comentario[] lComentarioss = comentarios.toArray();
			for(int i = 0; i < lComentarioss.length; i++) {
				lComentarioss[i].setProducto(null);
			}
			Diagrama_BD.Oferta[] lOfertass = ofertas.toArray();
			for(int i = 0; i < lOfertass.length; i++) {
				lOfertass[i].setProducto(null);
			}
			Diagrama_BD.Item[] lItemss = items.toArray();
			for(int i = 0; i < lItemss.length; i++) {
				lItemss[i].setProducto(null);
			}
			Diagrama_BD.Foto[] lFotosProductos = fotosProducto.toArray();
			for(int i = 0; i < lFotosProductos.length; i++) {
				lFotosProductos[i].setProductoFoto(null);
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
			if(getCategoria() != null) {
				getCategoria().productos.remove(this);
			}
			
			Diagrama_BD.Comentario[] lComentarioss = comentarios.toArray();
			for(int i = 0; i < lComentarioss.length; i++) {
				lComentarioss[i].setProducto(null);
			}
			Diagrama_BD.Oferta[] lOfertass = ofertas.toArray();
			for(int i = 0; i < lOfertass.length; i++) {
				lOfertass[i].setProducto(null);
			}
			Diagrama_BD.Item[] lItemss = items.toArray();
			for(int i = 0; i < lItemss.length; i++) {
				lItemss[i].setProducto(null);
			}
			Diagrama_BD.Foto[] lFotosProductos = fotosProducto.toArray();
			for(int i = 0; i < lFotosProductos.length; i++) {
				lFotosProductos[i].setProductoFoto(null);
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
		if (key == Diagrama_BD.ORMConstants.KEY_PRODUCTO_COMENTARIOS) {
			return ORM_comentarios;
		}
		else if (key == Diagrama_BD.ORMConstants.KEY_PRODUCTO_OFERTAS) {
			return ORM_ofertas;
		}
		else if (key == Diagrama_BD.ORMConstants.KEY_PRODUCTO_ITEMS) {
			return ORM_items;
		}
		else if (key == Diagrama_BD.ORMConstants.KEY_PRODUCTO_FOTOSPRODUCTO) {
			return ORM_fotosProducto;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == Diagrama_BD.ORMConstants.KEY_PRODUCTO_CATEGORIA) {
			this.categoria = (Diagrama_BD.Categoria) owner;
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
	@GeneratedValue(generator="DIAGRAMA_BD_PRODUCTO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DIAGRAMA_BD_PRODUCTO_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=Diagrama_BD.Categoria.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="CategoriaId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKProducto904800"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Diagrama_BD.Categoria categoria;
	
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
	
	@OneToMany(mappedBy="producto", targetEntity=Diagrama_BD.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_comentarios = new java.util.HashSet();
	
	@OneToMany(mappedBy="producto", targetEntity=Diagrama_BD.Oferta.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_ofertas = new java.util.HashSet();
	
	@OneToMany(mappedBy="producto", targetEntity=Diagrama_BD.Item.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_items = new java.util.HashSet();
	
	@OneToMany(mappedBy="productoFoto", targetEntity=Diagrama_BD.Foto.class)	
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
	public final Diagrama_BD.ComentarioSetCollection comentarios = new Diagrama_BD.ComentarioSetCollection(this, _ormAdapter, Diagrama_BD.ORMConstants.KEY_PRODUCTO_COMENTARIOS, Diagrama_BD.ORMConstants.KEY_COMENTARIO_PRODUCTO, Diagrama_BD.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Ofertas(java.util.Set value) {
		this.ORM_ofertas = value;
	}
	
	private java.util.Set getORM_Ofertas() {
		return ORM_ofertas;
	}
	
	@Transient	
	public final Diagrama_BD.OfertaSetCollection ofertas = new Diagrama_BD.OfertaSetCollection(this, _ormAdapter, Diagrama_BD.ORMConstants.KEY_PRODUCTO_OFERTAS, Diagrama_BD.ORMConstants.KEY_OFERTA_PRODUCTO, Diagrama_BD.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setCategoria(Diagrama_BD.Categoria value) {
		if (categoria != null) {
			categoria.productos.remove(this);
		}
		if (value != null) {
			value.productos.add(this);
		}
	}
	
	public Diagrama_BD.Categoria getCategoria() {
		return categoria;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Categoria(Diagrama_BD.Categoria value) {
		this.categoria = value;
	}
	
	private Diagrama_BD.Categoria getORM_Categoria() {
		return categoria;
	}
	
	private void setORM_Items(java.util.Set value) {
		this.ORM_items = value;
	}
	
	private java.util.Set getORM_Items() {
		return ORM_items;
	}
	
	@Transient	
	public final Diagrama_BD.ItemSetCollection items = new Diagrama_BD.ItemSetCollection(this, _ormAdapter, Diagrama_BD.ORMConstants.KEY_PRODUCTO_ITEMS, Diagrama_BD.ORMConstants.KEY_ITEM_PRODUCTO, Diagrama_BD.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_FotosProducto(java.util.Set value) {
		this.ORM_fotosProducto = value;
	}
	
	private java.util.Set getORM_FotosProducto() {
		return ORM_fotosProducto;
	}
	
	@Transient	
	public final Diagrama_BD.FotoSetCollection fotosProducto = new Diagrama_BD.FotoSetCollection(this, _ormAdapter, Diagrama_BD.ORMConstants.KEY_PRODUCTO_FOTOSPRODUCTO, Diagrama_BD.ORMConstants.KEY_FOTO_PRODUCTOFOTO, Diagrama_BD.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
