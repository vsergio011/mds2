package tiendaVirtual.interfaz;

public class Cabecera_Administrador extends Cabecera_Pagina {
	private Object _perfilL;
	private Object _perfilB;
	private Object _adminL;
	private Object _adminB;
	public Administrador _administrador;
	public Funciones_Admin _funcionesAdmin;
	public Perfil _perfil;
	public Producto_Admin _producto;
	
	public Cabecera_Administrador(appventawebbd.Administrador admin) {
		_funcionesAdmin = new Funciones_Admin(admin);
		_perfil = new Perfil(admin);
		
		this.getAdminBtn().setVisible(true);
		this.getBtnCarrito().setVisible(false);
		this.getPerfilBtn().setVisible(true);
		this.getBtnLogin().setVisible(false);
	}
}