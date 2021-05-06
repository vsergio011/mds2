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
@Table(name="Enviado")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Enviado")
@PrimaryKeyJoinColumn(name="PedidoId", referencedColumnName="Id")
public class Enviado extends appventawebbd.Pedido implements Serializable {
	public Enviado() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ENVIADO_TRANSPORTISTAENVIO) {
			this.transportistaEnvio = (appventawebbd.Transportista) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Fecha", nullable=true, length=255)	
	private String fecha;
	
	@ManyToOne(targetEntity=appventawebbd.Transportista.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TransportistaUsuarioId", referencedColumnName="UsuarioId", nullable=false) }, foreignKey=@ForeignKey(name="FKEnviado826798"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private appventawebbd.Transportista transportistaEnvio;
	
	public void setFecha(String value) {
		this.fecha = value;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setTransportistaEnvio(appventawebbd.Transportista value) {
		if (transportistaEnvio != null) {
			transportistaEnvio.enviados.remove(this);
		}
		if (value != null) {
			value.enviados.add(this);
		}
	}
	
	public appventawebbd.Transportista getTransportistaEnvio() {
		return transportistaEnvio;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_TransportistaEnvio(appventawebbd.Transportista value) {
		this.transportistaEnvio = value;
	}
	
	private appventawebbd.Transportista getORM_TransportistaEnvio() {
		return transportistaEnvio;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
