package tiendaVirtual.interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaRegistro;

public class Registro extends VistaRegistro {
	private Object _datospersonalesL;
	private Object _nombreUsuarioL;
	private Object _nombreUsuarioTF;
	private Object _nombreL;
	private Object _nombreTF;
	private Object _apellidosL;
	private Object _apellidosTF;
	private Object _emailL;
	private Object _emailTF;
	private Object _passwordL;
	private Object _passwordTF;
	private Object _datosEnvioL;
	private Object _direccionCompletaL;
	private Object _direccionCompletaTF;
	private Object _modoPagoL;
	private Object _datosPagoL;
	private Object _datosPagoTF;
	private Object _imagen;
	private Object _insertarFotoL;
	private Object _insertarFotoB;
	private Object _crearCuentaL;
	private Object _crearCuentaB;
	private Object _cancelarL;
	private Object _cancelarB;
	public Login_Cibernauta _login;
	public Carrito_no_Registrado _carrito;

	public void Validar_contrasena() {
		throw new UnsupportedOperationException();
	}
	
	public Registro() {
		HorizontalLayout layout = this.getVaadinHorizontalLayout();
		
		_carrito = new Carrito_no_Registrado();
		
		this.getCancelBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				// TODO: Investigar como se hace el back a la vista anterior o el main.
				// TODO: ¿Cómo le damos funcionalidad al botón login de la cabecera?
			}
		});
	}
}