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

	private appventawebbd.Cibernauta ciber = null;
	public void Borrar_cuenta() {
		iCibernauta_Registrado cibernauta = new BDPrincipal();
		cibernauta.borrarCuenta(ciber.getId());
	}
	
	public Perfil_Cibernauta(appventawebbd.Cibernauta ciber) {
		super(ciber);
		this.ciber = ciber;
		
		_cambiarContrasena = new Cambiar_Contrasena();
		_mensajeria = new Mensajeria(ciber);
		_compras = new Compras(ciber);
		
		fillCibernautaData(ciber);
	}
	
	public void UpdateCibernauta(int idCiber) {
		iCibernauta_Registrado cibernauta = new BDPrincipal();
		
		appventawebbd.Cibernauta ciber = new appventawebbd.Cibernauta();
		ciber.setApellidos(_modificar.getLbApellidos().getValue());
		ciber.setCorreoElectronico(_modificar.getLbEmail().getValue());
		ciber.setDireccionCompleta(_modificar.getLbDireccion().getValue());
		ciber.setFormaPago(_modificar.getLbDatosDePago().getValue());
		ciber.setFoto(_modificar.getImg().getSrc());
		ciber.setNombre(_modificar.getLbNombre().getValue());
		ciber.setUsuario(_modificar.getLbNombreUsuario().getValue());
		cibernauta.modificarDatos(idCiber, ciber);
		
		this.fillCibernautaData(ciber);
		_modificar.fillData(ciber);
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
}