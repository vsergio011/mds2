package basededatos;

import basededatos.BDPrincipal;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import appventawebbd.AppventawebPersistentManager;
import appventawebbd.Cibernauta;
import appventawebbd.CibernautaDAO;
import appventawebbd.Usuario;

public class BD_Cibernauta {
	public BDPrincipal _bd_prin_ciber;
	public Vector<Cibernauta> _contiene_cibernautas = new Vector<Cibernauta>();

	/*
	 * public Cliente Cargar_Informacion_Cliente(int Cita) throws PersistentException {
		Cliente cl = null;
		PersistentTransaction t = GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {

			Cita c = CitaDAO.getCitaByORMID(Cita);
			cl = ClienteDAO.getClienteByORMID(c.getCliente().getID());

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return cl;

	}
	*/

	public Cibernauta Login(String aUsuario, String aPassword) {
		throw new UnsupportedOperationException();
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

	/*
	 * public Cliente Cargar_Informacion_Cliente(int Cita) throws PersistentException {
		Cliente cl = null;
		PersistentTransaction t = GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {

			Cita c = CitaDAO.getCitaByORMID(Cita);
			cl = ClienteDAO.getClienteByORMID(c.getCliente().getID());

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return cl;

	}
	*/
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

	public void borrarCuenta(int aIdCiber) {
		throw new UnsupportedOperationException();
	}

	public void cambiarImagen(int aIdCiber, String aImagen) {
		throw new UnsupportedOperationException();
	}

	public boolean existeUsuario(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public Cibernauta getUsuarioLogin(String aUser, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public void registro(Usuario aUser) {
		throw new UnsupportedOperationException();
	}
}