package tiendaVirtual.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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
		_modificar = new Modificar_Datos(ciber);
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
	}
	
	public void hideModificarDatos() {
		this.getNombreApellidosLbl().setVisible(true);
		this.getDireccionLbl().setVisible(true);
		this.getEmailLbl().setVisible(true);
		this.getAceptarCambiosBtn().setVisible(false);
		
		VerticalLayout vl = this.getPerfilLayout().as(VerticalLayout.class);
		vl.remove(this._modificar);		
	}
	
	public void showModificarDatos() {		
		this.getNombreApellidosLbl().setVisible(false);
		this.getDireccionLbl().setVisible(false);
		this.getEmailLbl().setVisible(false);
		this.getAceptarCambiosBtn().setVisible(true);
		
		VerticalLayout vl = this.getPerfilLayout().as(VerticalLayout.class);
		vl.add(this._modificar);
	}
}