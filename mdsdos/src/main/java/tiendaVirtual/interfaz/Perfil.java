package tiendaVirtual.interfaz;

import vistas.VistaPerfil;

public class Perfil extends VistaPerfil{
	private Object _imagen;
	private Object _cambiarPasswordB;
	private Object _modificarDatosB;
	private Object _desconectarB;
	// private event _cambiar_Imagen_de_Perfil;
	private Object _nombreCompletoL;
	private Object _emailL;
	private Object _direccionCompletaL;
	public Cabecera_Administrador _cabecera;
	public Cambiar_Contrasena _cambiarContrasena;
	public Modificar_Datos _modificar;

	public Perfil() {
	}
	
	public void Cambiar_Imagen_de_Perfil() {
		throw new UnsupportedOperationException();
	}
}