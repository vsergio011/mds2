package basededatos;

import appventawebbd.Cibernauta;
import appventawebbd.Usuario;

public interface iCibernauta_no_Registrado extends iCibernauta {

	public Cibernauta Registrar(String aNombre,
			String apellidos,
			String email,
			String foto,
			String direccion,
			String formaPago,
			String usuario, 
			String aPassword);

	public void cambiar_contrasena(int aNueva_contrasena, String aUsuario);

	public Usuario getUsuarioLogin(String aUser);
}