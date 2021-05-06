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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Transportista")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Transportista")
public class Transportista extends appventawebbd.Empleado implements Serializable {
	public Transportista() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_TRANSPORTISTA_ENVIADOS) {
			return ORM_enviados;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@OneToMany(mappedBy="transportistaEnvio", targetEntity=appventawebbd.Enviado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_enviados = new java.util.HashSet();
	
	private void setORM_Enviados(java.util.Set value) {
		this.ORM_enviados = value;
	}
	
	private java.util.Set getORM_Enviados() {
		return ORM_enviados;
	}
	
	@Transient	
	public final appventawebbd.EnviadoSetCollection enviados = new appventawebbd.EnviadoSetCollection(this, _ormAdapter, ORMConstants.KEY_TRANSPORTISTA_ENVIADOS, ORMConstants.KEY_ENVIADO_TRANSPORTISTAENVIO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
