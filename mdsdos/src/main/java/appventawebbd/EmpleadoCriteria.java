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

public class EmpleadoCriteria extends AbstractORMCriteria {
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
	
	public EmpleadoCriteria(Criteria criteria) {
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
	}
	
	public EmpleadoCriteria(PersistentSession session) {
		this(session.createCriteria(Empleado.class));
	}
	
	public EmpleadoCriteria() throws PersistentException {
		this(AppventawebPersistentManager.instance().getSession());
	}
	
	public MensajeCriteria createMensajesEnviadosCriteria() {
		return new MensajeCriteria(createCriteria("ORM_mensajesEnviados"));
	}
	
	public MensajeCriteria createMensajesRecibidosCriteria() {
		return new MensajeCriteria(createCriteria("ORM_mensajesRecibidos"));
	}
	
	public Empleado uniqueEmpleado() {
		return (Empleado) super.uniqueResult();
	}
	
	public Empleado[] listEmpleado() {
		java.util.List list = super.list();
		return (Empleado[]) list.toArray(new Empleado[list.size()]);
	}
}

