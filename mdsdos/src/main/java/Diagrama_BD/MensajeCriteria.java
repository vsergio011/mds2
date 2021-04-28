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

public class MensajeCriteria extends AbstractORMCriteria {
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
	
	public MensajeCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		originalId = new IntegerExpression("original.id", this);
		original = new AssociationExpression("original", this);
		destinatarioId = new IntegerExpression("destinatario.id", this);
		destinatario = new AssociationExpression("destinatario", this);
		remitenteId = new IntegerExpression("remitente.id", this);
		remitente = new AssociationExpression("remitente", this);
		Asunto = new StringExpression("Asunto", this);
		Cuerpo = new StringExpression("Cuerpo", this);
		AsosciacionReflexiva = new IntegerExpression("AsosciacionReflexiva", this);
		respuestas = new CollectionExpression("ORM_respuestas", this);
	}
	
	public MensajeCriteria(PersistentSession session) {
		this(session.createCriteria(Mensaje.class));
	}
	
	public MensajeCriteria() throws PersistentException {
		this(Diagrama_BD.AppventawebPersistentManager.instance().getSession());
	}
	
	public MensajeCriteria createOriginalCriteria() {
		return new MensajeCriteria(createCriteria("original"));
	}
	
	public UsuarioCriteria createDestinatarioCriteria() {
		return new UsuarioCriteria(createCriteria("destinatario"));
	}
	
	public UsuarioCriteria createRemitenteCriteria() {
		return new UsuarioCriteria(createCriteria("remitente"));
	}
	
	public Diagrama_BD.MensajeCriteria createRespuestasCriteria() {
		return new Diagrama_BD.MensajeCriteria(createCriteria("ORM_respuestas"));
	}
	
	public Mensaje uniqueMensaje() {
		return (Mensaje) super.uniqueResult();
	}
	
	public Mensaje[] listMensaje() {
		java.util.List list = super.list();
		return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
	}
}

