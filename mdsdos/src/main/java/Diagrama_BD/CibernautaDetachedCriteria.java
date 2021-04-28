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

public class CibernautaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final IntegerExpression tipo;
	public final StringExpression usuario;
	public final StringExpression password;
	public final StringExpression correoElectronico;
	public final StringExpression apellidos;
	public final StringExpression formaPago;
	public final StringExpression foto;
	public final StringExpression direccionCompleta;
	public final BooleanExpression operativo;
	public final CollectionExpression mensajesEnviados;
	public final CollectionExpression mensajesRecibidos;
	public final CollectionExpression pedidos;
	public final CollectionExpression comentario;
	
	public CibernautaDetachedCriteria() {
		super(Diagrama_BD.Cibernauta.class, Diagrama_BD.CibernautaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		tipo = new IntegerExpression("tipo", this.getDetachedCriteria());
		usuario = new StringExpression("usuario", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		correoElectronico = new StringExpression("correoElectronico", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		formaPago = new StringExpression("formaPago", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		direccionCompleta = new StringExpression("direccionCompleta", this.getDetachedCriteria());
		operativo = new BooleanExpression("operativo", this.getDetachedCriteria());
		mensajesEnviados = new CollectionExpression("ORM_mensajesEnviados", this.getDetachedCriteria());
		mensajesRecibidos = new CollectionExpression("ORM_mensajesRecibidos", this.getDetachedCriteria());
		pedidos = new CollectionExpression("ORM_pedidos", this.getDetachedCriteria());
		comentario = new CollectionExpression("ORM_comentario", this.getDetachedCriteria());
	}
	
	public CibernautaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, Diagrama_BD.CibernautaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		tipo = new IntegerExpression("tipo", this.getDetachedCriteria());
		usuario = new StringExpression("usuario", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		correoElectronico = new StringExpression("correoElectronico", this.getDetachedCriteria());
		apellidos = new StringExpression("apellidos", this.getDetachedCriteria());
		formaPago = new StringExpression("formaPago", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		direccionCompleta = new StringExpression("direccionCompleta", this.getDetachedCriteria());
		operativo = new BooleanExpression("operativo", this.getDetachedCriteria());
		mensajesEnviados = new CollectionExpression("ORM_mensajesEnviados", this.getDetachedCriteria());
		mensajesRecibidos = new CollectionExpression("ORM_mensajesRecibidos", this.getDetachedCriteria());
		pedidos = new CollectionExpression("ORM_pedidos", this.getDetachedCriteria());
		comentario = new CollectionExpression("ORM_comentario", this.getDetachedCriteria());
	}
	
	public Diagrama_BD.PedidoDetachedCriteria createPedidosCriteria() {
		return new Diagrama_BD.PedidoDetachedCriteria(createCriteria("ORM_pedidos"));
	}
	
	public Diagrama_BD.ComentarioDetachedCriteria createComentarioCriteria() {
		return new Diagrama_BD.ComentarioDetachedCriteria(createCriteria("ORM_comentario"));
	}
	
	public Diagrama_BD.MensajeDetachedCriteria createMensajesEnviadosCriteria() {
		return new Diagrama_BD.MensajeDetachedCriteria(createCriteria("ORM_mensajesEnviados"));
	}
	
	public Diagrama_BD.MensajeDetachedCriteria createMensajesRecibidosCriteria() {
		return new Diagrama_BD.MensajeDetachedCriteria(createCriteria("ORM_mensajesRecibidos"));
	}
	
	public Cibernauta uniqueCibernauta(PersistentSession session) {
		return (Cibernauta) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cibernauta[] listCibernauta(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cibernauta[]) list.toArray(new Cibernauta[list.size()]);
	}
}

