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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ProductoCriteria extends AbstractORMCriteria {
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
	
	public ProductoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		categoriaId = new IntegerExpression("categoria.id", this);
		categoria = new AssociationExpression("categoria", this);
		nombre = new StringExpression("nombre", this);
		descripcion = new StringExpression("descripcion", this);
		detalles = new StringExpression("detalles", this);
		fotos = new StringExpression("fotos", this);
		precio = new DoubleExpression("precio", this);
		valoracionMedia = new DoubleExpression("valoracionMedia", this);
		comentarios = new CollectionExpression("ORM_comentarios", this);
		ofertas = new CollectionExpression("ORM_ofertas", this);
		items = new CollectionExpression("ORM_items", this);
		fotosProducto = new CollectionExpression("ORM_fotosProducto", this);
	}
	
	public ProductoCriteria(PersistentSession session) {
		this(session.createCriteria(Producto.class));
	}
	
	public ProductoCriteria() throws PersistentException {
		this(Diagrama_BD.AppventawebPersistentManager.instance().getSession());
	}
	
	public CategoriaCriteria createCategoriaCriteria() {
		return new CategoriaCriteria(createCriteria("categoria"));
	}
	
	public Diagrama_BD.ComentarioCriteria createComentariosCriteria() {
		return new Diagrama_BD.ComentarioCriteria(createCriteria("ORM_comentarios"));
	}
	
	public Diagrama_BD.OfertaCriteria createOfertasCriteria() {
		return new Diagrama_BD.OfertaCriteria(createCriteria("ORM_ofertas"));
	}
	
	public Diagrama_BD.ItemCriteria createItemsCriteria() {
		return new Diagrama_BD.ItemCriteria(createCriteria("ORM_items"));
	}
	
	public Diagrama_BD.FotoCriteria createFotosProductoCriteria() {
		return new Diagrama_BD.FotoCriteria(createCriteria("ORM_fotosProducto"));
	}
	
	public Producto uniqueProducto() {
		return (Producto) super.uniqueResult();
	}
	
	public Producto[] listProducto() {
		java.util.List list = super.list();
		return (Producto[]) list.toArray(new Producto[list.size()]);
	}
}

