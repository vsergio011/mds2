package basededatos;

import basededatos.BDPrincipal;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import appventawebbd.AppventawebPersistentManager;
import appventawebbd.Cibernauta;
import appventawebbd.CibernautaDAO;
import appventawebbd.Transportista;
import appventawebbd.TransportistaDAO;
import appventawebbd.Usuario;
import appventawebbd.UsuarioDAO;

public class BD_Cibernauta {
	public BDPrincipal _bd_prin_ciber;
	public Vector<Cibernauta> _contiene_cibernautas = new Vector<Cibernauta>();

	public Usuario Login(String aUsuario) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Usuario u = null;
		try {
			System.out.println("Logeando al usuario : " + aUsuario);
			u = UsuarioDAO.loadUsuarioByQuery("Usuario='"+aUsuario.trim().toLowerCase()+"'", null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return u; 
	}

	public Cibernauta Registrar(
			String aNombre,
			String apellidos,
			String email,
			String foto,
			String direccion,
			String formaPago,
			String usuario, 
			String aPassword) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Cibernauta ciber = null;
		try {
			ciber = CibernautaDAO.createCibernauta();
			ciber.setNombre(aNombre);
			ciber.setUsuario(usuario);
	        ciber.setPassword(aPassword);
	        ciber.setApellidos(apellidos);
	        ciber.setOperativo(true);
	        ciber.setCorreoElectronico(email);
	        
	        ciber.setFoto(foto);
	        ciber.setDireccionCompleta(direccion);
	        ciber.setFormaPago(formaPago);
	        CibernautaDAO.save(ciber);
	        
	        t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
		return ciber;        
	}

	public void anadirPedido(int aIdPedido) {
		throw new UnsupportedOperationException();
	}

	public void cambiar_contrasena(String aEmail, String aNuevaContrasena) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Cibernauta ciber = (Cibernauta) this.getUsuarioEmail(aEmail);
		try {
			ciber.setPassword(aNuevaContrasena);
			CibernautaDAO.save(ciber);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public void modificarDatos(Cibernauta aCiber) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		try {
			CibernautaDAO.save(aCiber);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public Cibernauta getCibernauta(int aId) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Cibernauta ciber = null;
		try {
			ciber = CibernautaDAO.getCibernautaByORMID(aId);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return ciber;
	}
	
	public Usuario getUsuario(int aId) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Usuario usuario = null;
		try {
			usuario = CibernautaDAO.getCibernautaByORMID(aId);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return usuario;
	}

	public void borrarCuenta(int aIdCiber) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Usuario ciber = this.getUsuario(aIdCiber);
		
		try {
			CibernautaDAO.deleteAndDissociate((Cibernauta) ciber);
			UsuarioDAO.deleteAndDissociate(ciber);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public void cambiarImagen(int aIdCiber, String aImagen) {
		throw new UnsupportedOperationException();
	}

	public boolean existeUsuario(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public Usuario getUsuarioEmail(String email) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Usuario u = null;
		try {
			System.out.println("CORREO : " + email);
			u = UsuarioDAO.loadUsuarioByQuery("CorreoElectronico='"+email+"'", null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return u;
	}

	public void registro(Usuario aUser) {
		throw new UnsupportedOperationException();
	}
}