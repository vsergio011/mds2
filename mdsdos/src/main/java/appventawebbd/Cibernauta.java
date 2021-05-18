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
@Table(name="Cibernauta")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Cibernauta")
@PrimaryKeyJoinColumn(name="UsuarioId", referencedColumnName="Id")
public class Cibernauta extends appventawebbd.Usuario implements Serializable {
	public Cibernauta() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CIBERNAUTA_PEDIDOS) {
			return ORM_pedidos;
		}
		else if (key == ORMConstants.KEY_CIBERNAUTA_COMENTARIO) {
			return ORM_comentario;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@OneToMany(mappedBy="cibernauta", targetEntity=appventawebbd.Pedido.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_pedidos = new java.util.HashSet();
	
	@OneToMany(mappedBy="cibernauta", targetEntity=appventawebbd.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_comentario = new java.util.HashSet();
	
	private void setORM_Pedidos(java.util.Set value) {
		this.ORM_pedidos = value;
	}
	
	private java.util.Set getORM_Pedidos() {
		return ORM_pedidos;
	}
	
	@Transient	
	public final appventawebbd.PedidoSetCollection pedidos = new appventawebbd.PedidoSetCollection(this, _ormAdapter, ORMConstants.KEY_CIBERNAUTA_PEDIDOS, ORMConstants.KEY_PEDIDO_CIBERNAUTA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Comentario(java.util.Set value) {
		this.ORM_comentario = value;
	}
	
	private java.util.Set getORM_Comentario() {
		return ORM_comentario;
	}
	
	@Transient	
	public final appventawebbd.ComentarioSetCollection comentario = new appventawebbd.ComentarioSetCollection(this, _ormAdapter, ORMConstants.KEY_CIBERNAUTA_COMENTARIO, ORMConstants.KEY_COMENTARIO_CIBERNAUTA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
