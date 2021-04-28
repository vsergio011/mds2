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

public class EntregadoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression cibernautaId;
	public final AssociationExpression cibernauta;
	public final DoubleExpression total;
	public final StringExpression direccion;
	public final StringExpression formaPago;
	public final CollectionExpression items;
	
	public EntregadoDetachedCriteria() {
		super(Diagrama_BD.Entregado.class, Diagrama_BD.EntregadoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		cibernautaId = new IntegerExpression("cibernauta.", this.getDetachedCriteria());
		cibernauta = new AssociationExpression("cibernauta", this.getDetachedCriteria());
		total = new DoubleExpression("total", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		formaPago = new StringExpression("formaPago", this.getDetachedCriteria());
		items = new CollectionExpression("ORM_items", this.getDetachedCriteria());
	}
	
	public EntregadoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, Diagrama_BD.EntregadoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		cibernautaId = new IntegerExpression("cibernauta.", this.getDetachedCriteria());
		cibernauta = new AssociationExpression("cibernauta", this.getDetachedCriteria());
		total = new DoubleExpression("total", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		formaPago = new StringExpression("formaPago", this.getDetachedCriteria());
		items = new CollectionExpression("ORM_items", this.getDetachedCriteria());
	}
	
	public CibernautaDetachedCriteria createCibernautaCriteria() {
		return new CibernautaDetachedCriteria(createCriteria("cibernauta"));
	}
	
	public Diagrama_BD.ItemDetachedCriteria createItemsCriteria() {
		return new Diagrama_BD.ItemDetachedCriteria(createCriteria("ORM_items"));
	}
	
	public Entregado uniqueEntregado(PersistentSession session) {
		return (Entregado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Entregado[] listEntregado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Entregado[]) list.toArray(new Entregado[list.size()]);
	}
}

