package basededatos;

import appventawebbd.Cibernauta;
import appventawebbd.Usuario;

public interface iCibernauta_no_Registrado extends iCibernauta {

	public boolean Login(String aUsuario, String aPassword);

	public void Registrar(String aNombre, String aPassword);

	public void cambiar_contrasena(String aNueva_contrasena, String aUsuario);

	public boolean existeUsuario(String aEmail);

	public Cibernauta getUsuarioLogin(String aUser, String aPassword);

	public void registro(Usuario aUser);
}