package tiendaVirtual.interfaz;

public class Carrito_Registrado extends Carrito {
	private Object _comprarB;
	public Cabecera_Registrado _cabecera;
	public Comprar _comprar;
	
	public Carrito_Registrado(appventawebbd.Cibernauta ciber) {
		_comprar = new Comprar();
		
		this.getRegisterBtn().setVisible(false);
	}
}