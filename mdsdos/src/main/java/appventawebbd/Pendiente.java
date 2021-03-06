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
@Table(name="Pendiente")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Pendiente")
@PrimaryKeyJoinColumn(name="PedidoId", referencedColumnName="Id")
public class Pendiente extends appventawebbd.Pedido implements Serializable {
	public Pendiente() {
	}
	
	@Column(name="Fecha", nullable=true, length=255)	
	private String fecha;
	
	public void setFecha(String value) {
		this.fecha = value;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
