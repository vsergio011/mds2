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

public class EntregadoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression cibernautaId;
	public final AssociationExpression cibernauta;
	public final DoubleExpression total;
	public final StringExpression direccion;
	public final StringExpression formaPago;
	public final StringExpression fechaPedido;
	public final CollectionExpression items;
	public final StringExpression fecha;
	
	public EntregadoDetachedCriteria() {
		super(appventawebbd.Entregado.class, appventawebbd.EntregadoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		cibernautaId = new IntegerExpression("cibernauta.", this.getDetachedCriteria());
		cibernauta = new AssociationExpression("cibernauta", this.getDetachedCriteria());
		total = new DoubleExpression("total", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		formaPago = new StringExpression("formaPago", this.getDetachedCriteria());
		fechaPedido = new StringExpression("fechaPedido", this.getDetachedCriteria());
		items = new CollectionExpression("ORM_items", this.getDetachedCriteria());
		fecha = new StringExpression("fecha", this.getDetachedCriteria());
	}
	
	public EntregadoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, appventawebbd.EntregadoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		cibernautaId = new IntegerExpression("cibernauta.", this.getDetachedCriteria());
		cibernauta = new AssociationExpression("cibernauta", this.getDetachedCriteria());
		total = new DoubleExpression("total", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		formaPago = new StringExpression("formaPago", this.getDetachedCriteria());
		fechaPedido = new StringExpression("fechaPedido", this.getDetachedCriteria());
		items = new CollectionExpression("ORM_items", this.getDetachedCriteria());
		fecha = new StringExpression("fecha", this.getDetachedCriteria());
	}
	
	public CibernautaDetachedCriteria createCibernautaCriteria() {
		return new CibernautaDetachedCriteria(createCriteria("cibernauta"));
	}
	
	public ItemDetachedCriteria createItemsCriteria() {
		return new ItemDetachedCriteria(createCriteria("ORM_items"));
	}
	
	public Entregado uniqueEntregado(PersistentSession session) {
		return (Entregado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Entregado[] listEntregado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Entregado[]) list.toArray(new Entregado[list.size()]);
	}
}

