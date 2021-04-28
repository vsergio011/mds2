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

public class EntregadoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression cibernautaId;
	public final AssociationExpression cibernauta;
	public final DoubleExpression total;
	public final StringExpression direccion;
	public final StringExpression formaPago;
	public final CollectionExpression items;
	
	public EntregadoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		cibernautaId = new IntegerExpression("cibernauta.", this);
		cibernauta = new AssociationExpression("cibernauta", this);
		total = new DoubleExpression("total", this);
		direccion = new StringExpression("direccion", this);
		formaPago = new StringExpression("formaPago", this);
		items = new CollectionExpression("ORM_items", this);
	}
	
	public EntregadoCriteria(PersistentSession session) {
		this(session.createCriteria(Entregado.class));
	}
	
	public EntregadoCriteria() throws PersistentException {
		this(Diagrama_BD.AppventawebPersistentManager.instance().getSession());
	}
	
	public CibernautaCriteria createCibernautaCriteria() {
		return new CibernautaCriteria(createCriteria("cibernauta"));
	}
	
	public Diagrama_BD.ItemCriteria createItemsCriteria() {
		return new Diagrama_BD.ItemCriteria(createCriteria("ORM_items"));
	}
	
	public Entregado uniqueEntregado() {
		return (Entregado) super.uniqueResult();
	}
	
	public Entregado[] listEntregado() {
		java.util.List list = super.list();
		return (Entregado[]) list.toArray(new Entregado[list.size()]);
	}
}

