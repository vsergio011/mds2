package tiendaVirtual.interfaz;

import vistas.VistaModificargeneral;

public class Modificar_Datos extends VistaModificargeneral {
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
		//this.fillData(ciber);	
		this.getLbNombreUsuario().setValue(ciber.getUsuario());
		this.getImg().setSrc(ciber.getFoto());
		Modificar_general _Modificar_general = new Modificar_general();
		_Modificar_general.fillData(ciber);
		this.getContainerLayout().removeAll();
		this.getContainerLayout().add(_Modificar_general);
	}
	
	public void showLess() {
		this.getBorrarCuentaBtn().setVisible(false);
		this.getDesconectarBtn().setVisible(false);
		this.getComprasBtn().setVisible(false);
		this.getContactoBTn().setVisible(false);
		this.getCambiarPasswordBtn().setVisible(false);
		
	}
}