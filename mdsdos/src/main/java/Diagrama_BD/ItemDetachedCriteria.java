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

public class ItemDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression pedidoId;
	public final AssociationExpression pedido;
	public final IntegerExpression productoId;
	public final AssociationExpression producto;
	public final IntegerExpression idProducto;
	public final IntegerExpression idPedido;
	public final IntegerExpression cantidad;
	
	public ItemDetachedCriteria() {
		super(Diagrama_BD.Item.class, Diagrama_BD.ItemCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		pedidoId = new IntegerExpression("pedido.id", this.getDetachedCriteria());
		pedido = new AssociationExpression("pedido", this.getDetachedCriteria());
		productoId = new IntegerExpression("producto.id", this.getDetachedCriteria());
		producto = new AssociationExpression("producto", this.getDetachedCriteria());
		idProducto = new IntegerExpression("idProducto", this.getDetachedCriteria());
		idPedido = new IntegerExpression("idPedido", this.getDetachedCriteria());
		cantidad = new IntegerExpression("cantidad", this.getDetachedCriteria());
	}
	
	public ItemDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, Diagrama_BD.ItemCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		pedidoId = new IntegerExpression("pedido.id", this.getDetachedCriteria());
		pedido = new AssociationExpression("pedido", this.getDetachedCriteria());
		productoId = new IntegerExpression("producto.id", this.getDetachedCriteria());
		producto = new AssociationExpression("producto", this.getDetachedCriteria());
		idProducto = new IntegerExpression("idProducto", this.getDetachedCriteria());
		idPedido = new IntegerExpression("idPedido", this.getDetachedCriteria());
		cantidad = new IntegerExpression("cantidad", this.getDetachedCriteria());
	}
	
	public PedidoDetachedCriteria createPedidoCriteria() {
		return new PedidoDetachedCriteria(createCriteria("pedido"));
	}
	
	public ProductoDetachedCriteria createProductoCriteria() {
		return new ProductoDetachedCriteria(createCriteria("producto"));
	}
	
	public Item uniqueItem(PersistentSession session) {
		return (Item) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Item[] listItem(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Item[]) list.toArray(new Item[list.size()]);
	}
}

