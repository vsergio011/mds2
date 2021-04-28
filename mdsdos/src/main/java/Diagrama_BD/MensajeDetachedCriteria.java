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

public class MensajeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression originalId;
	public final AssociationExpression original;
	public final IntegerExpression destinatarioId;
	public final AssociationExpression destinatario;
	public final IntegerExpression remitenteId;
	public final AssociationExpression remitente;
	public final StringExpression Asunto;
	public final StringExpression Cuerpo;
	public final IntegerExpression AsosciacionReflexiva;
	public final CollectionExpression respuestas;
	
	public MensajeDetachedCriteria() {
		super(Diagrama_BD.Mensaje.class, Diagrama_BD.MensajeCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		originalId = new IntegerExpression("original.id", this.getDetachedCriteria());
		original = new AssociationExpression("original", this.getDetachedCriteria());
		destinatarioId = new IntegerExpression("destinatario.id", this.getDetachedCriteria());
		destinatario = new AssociationExpression("destinatario", this.getDetachedCriteria());
		remitenteId = new IntegerExpression("remitente.id", this.getDetachedCriteria());
		remitente = new AssociationExpression("remitente", this.getDetachedCriteria());
		Asunto = new StringExpression("Asunto", this.getDetachedCriteria());
		Cuerpo = new StringExpression("Cuerpo", this.getDetachedCriteria());
		AsosciacionReflexiva = new IntegerExpression("AsosciacionReflexiva", this.getDetachedCriteria());
		respuestas = new CollectionExpression("ORM_respuestas", this.getDetachedCriteria());
	}
	
	public MensajeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, Diagrama_BD.MensajeCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		originalId = new IntegerExpression("original.id", this.getDetachedCriteria());
		original = new AssociationExpression("original", this.getDetachedCriteria());
		destinatarioId = new IntegerExpression("destinatario.id", this.getDetachedCriteria());
		destinatario = new AssociationExpression("destinatario", this.getDetachedCriteria());
		remitenteId = new IntegerExpression("remitente.id", this.getDetachedCriteria());
		remitente = new AssociationExpression("remitente", this.getDetachedCriteria());
		Asunto = new StringExpression("Asunto", this.getDetachedCriteria());
		Cuerpo = new StringExpression("Cuerpo", this.getDetachedCriteria());
		AsosciacionReflexiva = new IntegerExpression("AsosciacionReflexiva", this.getDetachedCriteria());
		respuestas = new CollectionExpression("ORM_respuestas", this.getDetachedCriteria());
	}
	
	public MensajeDetachedCriteria createOriginalCriteria() {
		return new MensajeDetachedCriteria(createCriteria("original"));
	}
	
	public UsuarioDetachedCriteria createDestinatarioCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("destinatario"));
	}
	
	public UsuarioDetachedCriteria createRemitenteCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("remitente"));
	}
	
	public Diagrama_BD.MensajeDetachedCriteria createRespuestasCriteria() {
		return new Diagrama_BD.MensajeDetachedCriteria(createCriteria("ORM_respuestas"));
	}
	
	public Mensaje uniqueMensaje(PersistentSession session) {
		return (Mensaje) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Mensaje[] listMensaje(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
	}
}

