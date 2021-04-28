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

public class TransportistaCriteria extends AbstractORMCriteria {
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
	
	public TransportistaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre = new StringExpression("nombre", this);
		tipo = new IntegerExpression("tipo", this);
		usuario = new StringExpression("usuario", this);
		password = new StringExpression("password", this);
		correoElectronico = new StringExpression("correoElectronico", this);
		apellidos = new StringExpression("apellidos", this);
		formaPago = new StringExpression("formaPago", this);
		foto = new StringExpression("foto", this);
		direccionCompleta = new StringExpression("direccionCompleta", this);
		operativo = new BooleanExpression("operativo", this);
		mensajesEnviados = new CollectionExpression("ORM_mensajesEnviados", this);
		mensajesRecibidos = new CollectionExpression("ORM_mensajesRecibidos", this);
		dni = new StringExpression("dni", this);
		numeroSS = new StringExpression("numeroSS", this);
		enviados = new CollectionExpression("ORM_enviados", this);
	}
	
	public TransportistaCriteria(PersistentSession session) {
		this(session.createCriteria(Transportista.class));
	}
	
	public TransportistaCriteria() throws PersistentException {
		this(Diagrama_BD.AppventawebPersistentManager.instance().getSession());
	}
	
	public Diagrama_BD.EnviadoCriteria createEnviadosCriteria() {
		return new Diagrama_BD.EnviadoCriteria(createCriteria("ORM_enviados"));
	}
	
	public Diagrama_BD.MensajeCriteria createMensajesEnviadosCriteria() {
		return new Diagrama_BD.MensajeCriteria(createCriteria("ORM_mensajesEnviados"));
	}
	
	public Diagrama_BD.MensajeCriteria createMensajesRecibidosCriteria() {
		return new Diagrama_BD.MensajeCriteria(createCriteria("ORM_mensajesRecibidos"));
	}
	
	public Transportista uniqueTransportista() {
		return (Transportista) super.uniqueResult();
	}
	
	public Transportista[] listTransportista() {
		java.util.List list = super.list();
		return (Transportista[]) list.toArray(new Transportista[list.size()]);
	}
}

