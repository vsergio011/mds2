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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ProductoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression categoriaId;
	public final AssociationExpression categoria;
	public final StringExpression nombre;
	public final StringExpression descripcion;
	public final StringExpression detalles;
	public final StringExpression fotos;
	public final DoubleExpression precio;
	public final DoubleExpression valoracionMedia;
	public final CollectionExpression comentarios;
	public final CollectionExpression ofertas;
	public final CollectionExpression items;
	public final CollectionExpression fotosProducto;
	
	public ProductoDetachedCriteria() {
		super(Diagrama_BD.Producto.class, Diagrama_BD.ProductoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		categoriaId = new IntegerExpression("categoria.id", this.getDetachedCriteria());
		categoria = new AssociationExpression("categoria", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		detalles = new StringExpression("detalles", this.getDetachedCriteria());
		fotos = new StringExpression("fotos", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
		valoracionMedia = new DoubleExpression("valoracionMedia", this.getDetachedCriteria());
		comentarios = new CollectionExpression("ORM_comentarios", this.getDetachedCriteria());
		ofertas = new CollectionExpression("ORM_ofertas", this.getDetachedCriteria());
		items = new CollectionExpression("ORM_items", this.getDetachedCriteria());
		fotosProducto = new CollectionExpression("ORM_fotosProducto", this.getDetachedCriteria());
	}
	
	public ProductoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, Diagrama_BD.ProductoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		categoriaId = new IntegerExpression("categoria.id", this.getDetachedCriteria());
		categoria = new AssociationExpression("categoria", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		detalles = new StringExpression("detalles", this.getDetachedCriteria());
		fotos = new StringExpression("fotos", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
		valoracionMedia = new DoubleExpression("valoracionMedia", this.getDetachedCriteria());
		comentarios = new CollectionExpression("ORM_comentarios", this.getDetachedCriteria());
		ofertas = new CollectionExpression("ORM_ofertas", this.getDetachedCriteria());
		items = new CollectionExpression("ORM_items", this.getDetachedCriteria());
		fotosProducto = new CollectionExpression("ORM_fotosProducto", this.getDetachedCriteria());
	}
	
	public CategoriaDetachedCriteria createCategoriaCriteria() {
		return new CategoriaDetachedCriteria(createCriteria("categoria"));
	}
	
	public Diagrama_BD.ComentarioDetachedCriteria createComentariosCriteria() {
		return new Diagrama_BD.ComentarioDetachedCriteria(createCriteria("ORM_comentarios"));
	}
	
	public Diagrama_BD.OfertaDetachedCriteria createOfertasCriteria() {
		return new Diagrama_BD.OfertaDetachedCriteria(createCriteria("ORM_ofertas"));
	}
	
	public Diagrama_BD.ItemDetachedCriteria createItemsCriteria() {
		return new Diagrama_BD.ItemDetachedCriteria(createCriteria("ORM_items"));
	}
	
	public Diagrama_BD.FotoDetachedCriteria createFotosProductoCriteria() {
		return new Diagrama_BD.FotoDetachedCriteria(createCriteria("ORM_fotosProducto"));
	}
	
	public Producto uniqueProducto(PersistentSession session) {
		return (Producto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Producto[] listProducto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Producto[]) list.toArray(new Producto[list.size()]);
	}
}

