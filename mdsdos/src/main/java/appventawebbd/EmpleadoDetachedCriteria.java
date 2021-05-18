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

public class EmpleadoDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public EmpleadoDetachedCriteria() {
		super(appventawebbd.Empleado.class, appventawebbd.EmpleadoCriteria.class);
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
	}
	
	public EmpleadoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, appventawebbd.EmpleadoCriteria.class);
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
	}
	
	public MensajeDetachedCriteria createMensajesEnviadosCriteria() {
		return new MensajeDetachedCriteria(createCriteria("ORM_mensajesEnviados"));
	}
	
	public MensajeDetachedCriteria createMensajesRecibidosCriteria() {
		return new MensajeDetachedCriteria(createCriteria("ORM_mensajesRecibidos"));
	}
	
	public Empleado uniqueEmpleado(PersistentSession session) {
		return (Empleado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Empleado[] listEmpleado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Empleado[]) list.toArray(new Empleado[list.size()]);
	}
}

