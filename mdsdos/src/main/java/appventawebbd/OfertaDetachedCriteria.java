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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class OfertaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression productoId;
	public final AssociationExpression producto;
	public final StringExpression fechaFin;
	public final DoubleExpression precio;
	
	public OfertaDetachedCriteria() {
		super(appventawebbd.Oferta.class, appventawebbd.OfertaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		productoId = new IntegerExpression("producto.id", this.getDetachedCriteria());
		producto = new AssociationExpression("producto", this.getDetachedCriteria());
		fechaFin = new StringExpression("fechaFin", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
	}
	
	public OfertaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, appventawebbd.OfertaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		productoId = new IntegerExpression("producto.id", this.getDetachedCriteria());
		producto = new AssociationExpression("producto", this.getDetachedCriteria());
		fechaFin = new StringExpression("fechaFin", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
	}
	
	public ProductoDetachedCriteria createProductoCriteria() {
		return new ProductoDetachedCriteria(createCriteria("producto"));
	}
	
	public Oferta uniqueOferta(PersistentSession session) {
		return (Oferta) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Oferta[] listOferta(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Oferta[]) list.toArray(new Oferta[list.size()]);
	}
}

