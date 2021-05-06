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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class FotoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression productoFotoId;
	public final AssociationExpression productoFoto;
	public final StringExpression ruta;
	
	public FotoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		productoFotoId = new IntegerExpression("productoFoto.id", this);
		productoFoto = new AssociationExpression("productoFoto", this);
		ruta = new StringExpression("ruta", this);
	}
	
	public FotoCriteria(PersistentSession session) {
		this(session.createCriteria(Foto.class));
	}
	
	public FotoCriteria() throws PersistentException {
		this(AppventawebPersistentManager.instance().getSession());
	}
	
	public ProductoCriteria createProductoFotoCriteria() {
		return new ProductoCriteria(createCriteria("productoFoto"));
	}
	
	public Foto uniqueFoto() {
		return (Foto) super.uniqueResult();
	}
	
	public Foto[] listFoto() {
		java.util.List list = super.list();
		return (Foto[]) list.toArray(new Foto[list.size()]);
	}
}

