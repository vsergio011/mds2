package tiendaVirtual.interfaz;

import basededatos.BDPrincipal;
import basededatos.iCibernauta_Registrado;

public class Perfil_Cibernauta extends Perfil {
	// private event _borrar_cuenta;
	private Object _comprasB;
	private Object _contactoB;
	private Object _borrarCuentaB;
	public Cabecera_Registrado _cabecera;
	public Compras _compras;
	public Mensajeria _mensajeria;

	public void Borrar_cuenta() {
		throw new UnsupportedOperationException();
	}
	
	public Perfil_Cibernauta(int idCiber) {
		_cambiarContrasena = new Cambiar_Contrasena();
		
		iCibernauta_Registrado bd = new BDPrincipal();
		
		appventawebbd.Cibernauta ciber = bd.getCibernauta(idCiber);
		fillCibernautaData(ciber);
	}
	
	private void fillCibernautaData(appventawebbd.Cibernauta ciber) {
		// Vista de perfil inicial
		this.getImg().setSrc(ciber.getFoto());
		this.getImg().setWidth("150px");
		this.getImg().setHeight("150px");
		this.getNombreApellidosLbl().setText(ciber.getNombre() + " " + ciber.getApellidos());
		this.getDireccionLbl().setText("Dirección: " + ciber.getDireccionCompleta());
		this.getEmailLbl().setText("Email: "+ ciber.getCorreoElectronico());
		
		// Vista modificar datos
		this.getNombreInput().setValue(ciber.getNombre());
		this.getApellidosInput().setValue(ciber.getApellidos());
		this.getDatosPagoInput().setValue(ciber.getFormaPago());
		this.getDireccionInput().setValue(ciber.getDireccionCompleta());
		this.getEmailInput().setValue(ciber.getCorreoElectronico());
		this.getUsuarioInput().setValue(ciber.getUsuario());
	}
	
	public void hideModificarDatos() {
		this.getModificarDatosPerfilLayout().setVisible(false);
		this.getPerfilLayout().setVisible(true);
		this.getAceptarCambiosBtn().setVisible(false);
	}
	
	public void showModificarDatos() {
		this.getModificarDatosPerfilLayout().setVisible(true);
		this.getPerfilLayout().setVisible(false);
		this.getAceptarCambiosBtn().setVisible(true);
	}
}