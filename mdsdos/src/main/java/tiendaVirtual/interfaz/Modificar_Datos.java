package tiendaVirtual.interfaz;

public class Modificar_Datos extends Modificar_general {
	private Object _borrarCuentaB;
	private Object _contactoB;
	private Object _comprasB;
	private Object _desconectarB;
	public Perfil _perfil;
	
	public Modificar_Datos() {
	}
	
	public Modificar_Datos(appventawebbd.Usuario ciber) {		
		if (ciber == null) {
			return;
		}
		this.fillData(ciber);		
	}
	
	public void showLess() {
		this.getBorrarCuentaBtn().setVisible(false);
		this.getDesconectarBtn().setVisible(false);
		this.getComprasBtn().setVisible(false);
		this.getContactoBTn().setVisible(false);
		this.getCambiarPasswordBtn().setVisible(false);
	}
}