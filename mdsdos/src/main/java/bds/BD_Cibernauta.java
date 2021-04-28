package bds;

import java.util.Vector;


import Diagrama_BD.Cibernauta;
import Diagrama_BD.Usuario;

public class BD_Cibernauta {
	public BDPrincipal _bd_prin_ciber;
	public Vector<Cibernauta> _contiene_cibernautas = new Vector<Cibernauta>();

	public boolean Login(String aUsuario, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public boolean Registrar(String aNombre, String aPassword) {
		throw new UnsupportedOperationException();
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

	public Cibernauta getCibernauta(int aId) {
		throw new UnsupportedOperationException();
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