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
@Table(name="Encargado")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Encargado")
public class Encargado extends appventawebbd.Empleado implements Serializable {
	public Encargado() {
	}
	
	public String toString() {
		return super.toString();
	}
	
}
