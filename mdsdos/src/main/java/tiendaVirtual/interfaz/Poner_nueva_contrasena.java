package tiendaVirtual.interfaz;

import vistas.VistaCambiocontrasena;

public class Poner_nueva_contrasena extends VistaCambiocontrasena {
	private Object _tituloL;
	private Object _passwordTF;
	private Object _repetirPasswordTF;
	private Object _cancelarB;
	private Object _continuarB;
	public Recuperar_Contrasena _recuperarContrasena;
	public Cambiar_Contrasena _cambiarContrasena;
	public Perfil_empleado _perfilEmpleado;

	public boolean Validar_contrasena() {
		if (!this.getInputNewPassword().getValue().equals(this.getInputRepeatNewPassword().getValue())) {
			this.getErrLayout().setVisible(true);
			return false;
		}
		this.getErrLayout().setVisible(false);
		
		
		return true;
	}
	
	public String GetNewPassword() {
		String password = this.getInputNewPassword().getValue();
		
		this.getInputNewPassword().setValue("");
		this.getInputRepeatNewPassword().setValue("");
		
		return password;
	}
	
	public Poner_nueva_contrasena() {
		this.getErrLayout().setVisible(false);
	}
}