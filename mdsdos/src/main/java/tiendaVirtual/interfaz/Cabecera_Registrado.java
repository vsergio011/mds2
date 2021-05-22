package tiendaVirtual.interfaz;

public class Cabecera_Registrado extends Cabecera_Pagina {
	private Object _perfilL;
	private Object _perfilB;
	private Object _carritoL;
	private Object _carritoB;
	public Cibernauta_Registrado _cibernauta;
	public Perfil_Cibernauta _perfil;
	public Carrito_Registrado _carrito;
	
	public Cabecera_Registrado(int idCiber) {
		_perfil = new Perfil_Cibernauta(idCiber);
		
		this.getBtnLogin().setVisible(false);
		this.getAdminBtn().setVisible(false);
	}
}