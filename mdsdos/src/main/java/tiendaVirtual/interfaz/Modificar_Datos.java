package tiendaVirtual.interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaModificargeneral;

public class Modificar_Datos extends VistaModificargeneral {
	private Object _borrarCuentaB;
	private Object _contactoB;
	private Object _comprasB;
	private Object _desconectarB;
	public Perfil _perfil;
	public VerticalLayout containerInfo;
	
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
		containerInfo = this.getContainerLayout();
		containerInfo.removeAll();
		containerInfo.add(_Modificar_general);
		
		
		this.getCambiarPasswordBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				containerInfo.removeAll();
				Cambiar_Contrasena _Cambiar_Contrasena = new Cambiar_Contrasena();
				containerInfo.add(_Cambiar_Contrasena);
				
			}
		});
		
		
		this.getComprasBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				containerInfo.removeAll();
				/*Cambiar_Contrasena _Cambiar_Contrasena = new Cambiar_Contrasena();
				containerInfo.add(_Cambiar_Contrasena);*/
				
			}
		});
		
		this.getContactoBTn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				containerInfo.removeAll();
				/*Cambiar_Contrasena _Cambiar_Contrasena = new Cambiar_Contrasena();
				containerInfo.add(_Cambiar_Contrasena);*/
				
			}
		});
		
		this.getBorrarCuentaBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				containerInfo.removeAll();
				/*Cambiar_Contrasena _Cambiar_Contrasena = new Cambiar_Contrasena();
				containerInfo.add(_Cambiar_Contrasena);*/
				
			}
		});
		
		this.getDesconectarBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				containerInfo.removeAll();
				/*Cambiar_Contrasena _Cambiar_Contrasena = new Cambiar_Contrasena();
				containerInfo.add(_Cambiar_Contrasena);*/
				
			}
		});
		
		this.getAceptarCambiosBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				containerInfo.removeAll();
				/*Cambiar_Contrasena _Cambiar_Contrasena = new Cambiar_Contrasena();
				containerInfo.add(_Cambiar_Contrasena);*/
				
			}
		});
		
	}
	
	public void showLess() {
		this.getBorrarCuentaBtn().setVisible(false);
		this.getDesconectarBtn().setVisible(false);
		this.getComprasBtn().setVisible(false);
		this.getContactoBTn().setVisible(false);
		this.getCambiarPasswordBtn().setVisible(false);
		
	}
}