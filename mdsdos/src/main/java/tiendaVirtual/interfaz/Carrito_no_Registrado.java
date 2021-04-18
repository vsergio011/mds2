package tiendaVirtual.interfaz;

public class Carrito_no_Registrado extends Carrito {
	private Object _registrarseB;
	public Cabecera_Cibernauta _cabecera;
	public Registro _registrarse;
	
	public Carrito_no_Registrado() {
		this.getComprarBtn().setVisible(false);
	}
}