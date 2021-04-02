package tiendaVirtual.interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaLogin;

public class Login_Cibernauta extends VistaLogin {
	private Object _nombreUsuarioL;
	private Object _nombreUsuarioTF;
	private Object _passwordL;
	private Object _passwordTf;
	private Object _registrarseL;
	private Object _registrarseB;
	private Object _entrarL;
	private Object _entrarB;
	private Object _recuperarPassL;
	private Object _recuperarPassB;
	public Cabecera_Cibernauta _cabecera;
	public Registro _registro;
	public Recuperar_Contrasena _recuperarContrasena;
	
	public Login_Cibernauta() {
		_recuperarContrasena = new Recuperar_Contrasena();
		_registro = new Registro();
	}
}