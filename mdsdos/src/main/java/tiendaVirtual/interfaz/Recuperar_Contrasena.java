package tiendaVirtual.interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iCibernauta_no_Registrado;
import vistas.VistaCambiocontrasenapaso1;
import vistas.VistaRecuperarcontrasena;

public class Recuperar_Contrasena extends VistaRecuperarcontrasena {
	private Object _tituloL;
	private Object _instruccionesL;
	private Object _correoTF;
	private Object _continuarB;
	public Login_Cibernauta _login;
	public Poner_nueva_contrasena _nuevaContrasena;

	public void Enviar_Link() {
		throw new UnsupportedOperationException();
	}
	
	public boolean ValidarEmail() {
		iCibernauta_no_Registrado bd = new BDPrincipal();
		
		if (bd.getUsuarioEmail(this.getEmailInput().getValue()) == null) {
			this.getLayoutEmailNoValido().setVisible(true);
			return false;
		}
		this.getLayoutEmailNoValido().setVisible(false);
		
		return true;
	}
	
	public String GetEmail() {
		return this.getEmailInput().getValue();
	}
	
	public void UpdatePassword(String email) {
		iCibernauta_no_Registrado bd = new BDPrincipal();
		appventawebbd.Usuario user = bd.getUsuarioEmail(email);
		bd.cambiar_contrasena(user.getId(), this._nuevaContrasena.getInputNewPassword().getValue());
	}
	
	public Recuperar_Contrasena() {
		this.getLayoutEmailNoValido().setVisible(false);
		_nuevaContrasena = new Poner_nueva_contrasena();
	}
}