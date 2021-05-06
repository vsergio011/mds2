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

public class FotoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression productoFotoId;
	public final AssociationExpression productoFoto;
	public final StringExpression ruta;
	
	public FotoDetachedCriteria() {
		super(appventawebbd.Foto.class, appventawebbd.FotoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		productoFotoId = new IntegerExpression("productoFoto.id", this.getDetachedCriteria());
		productoFoto = new AssociationExpression("productoFoto", this.getDetachedCriteria());
		ruta = new StringExpression("ruta", this.getDetachedCriteria());
	}
	
	public FotoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, appventawebbd.FotoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		productoFotoId = new IntegerExpression("productoFoto.id", this.getDetachedCriteria());
		productoFoto = new AssociationExpression("productoFoto", this.getDetachedCriteria());
		ruta = new StringExpression("ruta", this.getDetachedCriteria());
	}
	
	public ProductoDetachedCriteria createProductoFotoCriteria() {
		return new ProductoDetachedCriteria(createCriteria("productoFoto"));
	}
	
	public Foto uniqueFoto(PersistentSession session) {
		return (Foto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Foto[] listFoto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Foto[]) list.toArray(new Foto[list.size()]);
	}
}

