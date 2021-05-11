package tiendaVirtual.interfaz;

import vistas.VistaCambiocontrasenapaso1;

public class Cambiar_Contrasena extends VistaCambiocontrasenapaso1{
	private Object _tituloL;
	private Object _instruccionesL;
	private Object _numeroVerificacionTF;
	private Object _continuarB;
	public Perfil _perfil;
	public Poner_nueva_contrasena _nuevaContrasena;

	public void Enviar_Link() {
		throw new UnsupportedOperationException();
	}
	
	public Cambiar_Contrasena() {
		_nuevaContrasena = new Poner_nueva_contrasena();
	}
}