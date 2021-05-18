package tiendaVirtual.interfaz;

import vistas.VistaModificardatos;

public class Modificar_general extends VistaModificardatos{
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
	
	public Modificar_general() {}
	
	public void fillData(appventawebbd.Usuario ciber) {
		this.getNomreInput().setValue(ciber.getNombre());
		this.getApellidosInput().setValue(ciber.getApellidos());
		this.getDatosPagoInput().setValue(ciber.getFormaPago());
		this.getDireccionInput().setValue(ciber.getDireccionCompleta());
		this.getEmailInput().setValue(ciber.getCorreoElectronico());
		this.getNombreUsuarioInput().setValue(ciber.getUsuario());
	}

	public void Cambiar_Imagen_de_Perfil() {
		throw new UnsupportedOperationException();
	}
}