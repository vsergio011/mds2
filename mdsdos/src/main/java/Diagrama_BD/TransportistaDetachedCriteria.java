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

public class TransportistaDetachedCriteria extends AbstractORMDetachedCriteria {
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
	public final StringExpression dni;
	public final StringExpression numeroSS;
	public final CollectionExpression enviados;
	
	public TransportistaDetachedCriteria() {
		super(Diagrama_BD.Transportista.class, Diagrama_BD.TransportistaCriteria.class);
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
		dni = new StringExpression("dni", this.getDetachedCriteria());
		numeroSS = new StringExpression("numeroSS", this.getDetachedCriteria());
		enviados = new CollectionExpression("ORM_enviados", this.getDetachedCriteria());
	}
	
	public TransportistaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, Diagrama_BD.TransportistaCriteria.class);
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
		dni = new StringExpression("dni", this.getDetachedCriteria());
		numeroSS = new StringExpression("numeroSS", this.getDetachedCriteria());
		enviados = new CollectionExpression("ORM_enviados", this.getDetachedCriteria());
	}
	
	public Diagrama_BD.EnviadoDetachedCriteria createEnviadosCriteria() {
		return new Diagrama_BD.EnviadoDetachedCriteria(createCriteria("ORM_enviados"));
	}
	
	public Diagrama_BD.MensajeDetachedCriteria createMensajesEnviadosCriteria() {
		return new Diagrama_BD.MensajeDetachedCriteria(createCriteria("ORM_mensajesEnviados"));
	}
	
	public Diagrama_BD.MensajeDetachedCriteria createMensajesRecibidosCriteria() {
		return new Diagrama_BD.MensajeDetachedCriteria(createCriteria("ORM_mensajesRecibidos"));
	}
	
	public Transportista uniqueTransportista(PersistentSession session) {
		return (Transportista) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Transportista[] listTransportista(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Transportista[]) list.toArray(new Transportista[list.size()]);
	}
}

