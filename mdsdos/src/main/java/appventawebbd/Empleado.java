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
@Table(name="Empleado")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Empleado")
@PrimaryKeyJoinColumn(name="UsuarioId", referencedColumnName="Id")
public class Empleado extends appventawebbd.Usuario implements Serializable {
	public Empleado() {
	}
	
	@Column(name="Dni", nullable=true, length=255)	
	private String dni;
	
	@Column(name="NumeroSS", nullable=true, length=255)	
	private String numeroSS;
	
	public void setDni(String value) {
		this.dni = value;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setNumeroSS(String value) {
		this.numeroSS = value;
	}
	
	public String getNumeroSS() {
		return numeroSS;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
