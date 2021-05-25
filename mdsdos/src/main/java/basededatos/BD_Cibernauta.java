package basededatos;

import basededatos.BDPrincipal;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import appventawebbd.AppventawebPersistentManager;
import appventawebbd.Cibernauta;
import appventawebbd.CibernautaDAO;
import appventawebbd.Usuario;
import appventawebbd.UsuarioDAO;

public class BD_Cibernauta {
	public BDPrincipal _bd_prin_ciber;
	public Vector<Cibernauta> _contiene_cibernautas = new Vector<Cibernauta>();

	public Cibernauta Login(String aUsuario, String aPassword) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Cibernauta ciber = null;
		List<Cibernauta> result = null;
		try {
			result = CibernautaDAO.queryCibernauta("Cibernauta.Usuario='" + aUsuario + "'", null);
			if (result.size() == 0) {
				System.out.println("USUARIO NO ENCONTRADO");
				return null;
			}
			
			ciber = result.get(0);
			if (!ciber.getPassword().equals(aPassword)) {
				System.out.println("Password INVALIDA");
				return null;
			}
			
	        t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
		return ciber;      
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

	public void cambiar_contrasena(String aEmail, String aNuevaContrasena) {
		throw new UnsupportedOperationException();
	}

	public void modificarDatos(Cibernauta aCiber) {
		throw new UnsupportedOperationException();
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

	public void borrarCuenta(int aIdCiber) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Cibernauta ciber = this.getCibernauta(aIdCiber);
		try {
			CibernautaDAO.delete(ciber);
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