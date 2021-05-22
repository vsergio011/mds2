package tiendaVirtual.interfaz;

import vistas.VistaModificardatos;
import vistas.VistaModificargeneral;

public class Modificar_general extends VistaModificargeneral {
	// private event _cambiar_Imagen_de_Perfil;
	private Object _imagen;
	private Object _aceptarB;
	private Object _cancelarB;
	private Object _nombreL;
	private Object _nombreTF;
	private Object _apellidosL;
	private Object _apellidosTF;
	private Object _emailL;
	private Object _emailTF;
	private Object _direccionCompletaL;
	private Object _direccionCompletaTF;
	private Object _nombreUsuarioL;
	private Object _nombreUsuarioTF;
	private Object _datosPagoL;
	private Object _datosPagoTF;
	
	public Modificar_general() {
		System.out.println("YEAHHHHHHHHHHHHH");
	}
	
	public void fillData(appventawebbd.Usuario ciber) {
		this.getLbNombre().setValue(ciber.getNombre());
		this.getLbApellidos().setValue(ciber.getApellidos());
		this.getLbDatosDePago().setValue(ciber.getFormaPago());
		this.getLbDireccion().setValue(ciber.getDireccionCompleta());
		this.getLbEmail().setValue(ciber.getCorreoElectronico());
		this.getLbNombreUsuario().setValue(ciber.getUsuario());
		this.getImg().setSrc(ciber.getFoto());
	}

	public void Cambiar_Imagen_de_Perfil() {
		throw new UnsupportedOperationException();
	}
}