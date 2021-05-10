package tiendaVirtual.interfaz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iCibernauta_no_Registrado;
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

	public boolean Validar_contrasena() {
		 String regex = "^(?=.*[0-9])"
                 + "(?=.*[a-z])(?=.*[A-Z])"
                 + "(?=.*[@#$%^&+=])"
                 + "(?=\\S+$).{8,20}$";
		 
		 if (this.getPassword().getValue().isEmpty()) {
			 System.out.println("Empty Password");
			 return false;
		 }	
		 
		 // TODO: Descomentar cuando dejemos de hacer pruebas
		 // return Pattern.compile(regex).matcher(this.getPassword().getValue()).matches();
		 return true;
	}
	// (String aNombre, String apellidos, String email, String foto, String direccion, 
	// String formaPago, String usuario, String aPassword)
	public appventawebbd.Cibernauta CrearUsuario() {
		iCibernauta_no_Registrado ciber = new BDPrincipal();
		
		// TODO: Cambiar por el selector de imagen
		String img = "https://image.flaticon.com/icons/png/512/53/53159.png";
		return ciber.Registrar(
				this.getNombreLbl().getValue(), 
				this.getApellidosLbl().getValue(), 
				this.getEmailLbl().getValue(), 
				img, 
				this.getDireccionLbl().getValue(),
				// TODO: Datos de pago.
				"",
				this.getUserLbl().getValue(), 
				this.getPassword().getValue());
	}
	
	public Registro() {}
}