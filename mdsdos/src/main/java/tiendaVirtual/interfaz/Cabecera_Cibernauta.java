package tiendaVirtual.interfaz;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Cabecera_Cibernauta extends Cabecera_Pagina {
	private Object _loginL;
	private Object _loginB;
	private Object _carritoL;
	private Object _carritoB;
	public Cibernauta_no_Registrado _cibernauta;
	public Carrito_no_Registrado _carrito;
	public Login_Cibernauta _login;

	public Cabecera_Cibernauta() {
		_login = new Login_Cibernauta();
		_carrito = new Carrito_no_Registrado();
	}
}