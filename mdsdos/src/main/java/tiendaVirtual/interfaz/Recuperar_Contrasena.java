package tiendaVirtual.interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCambiocontrasenapaso1;
import vistas.VistaRecuperarcontrasena;

public class Recuperar_Contrasena extends VistaCambiocontrasenapaso1 {
	private Object _tituloL;
	private Object _instruccionesL;
	private Object _correoTF;
	private Object _continuarB;
	public Login_Cibernauta _login;
	public Poner_nueva_contrasena _nuevaContrasena;

	public void Enviar_Link() {
		throw new UnsupportedOperationException();
	}
	
	public Recuperar_Contrasena() {
		_nuevaContrasena = new Poner_nueva_contrasena();
	}
}