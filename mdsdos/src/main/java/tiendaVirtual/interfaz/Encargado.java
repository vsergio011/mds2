package tiendaVirtual.interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEncargado;
// import basededatos.iEncargado;

public class Encargado extends  VistaEncargado{
	// public iEncargado _iEncargado;
	public Cabecera_Encargado _cabecera;
	//public Seleccion_de_Compras _seleccionDeCompras;
	public Listado_de_Compras__Encargado_ _listadoCompras;
	public VerticalLayout containerPrincipal;
	
	public Encargado(appventawebbd.Cibernauta ciber) {
		Cabecera_Encargado _Cabecera_Encargado = new Cabecera_Encargado();
		Listado_de_Compras__Encargado_ _Listado_de_Compras__Encargado_ = new Listado_de_Compras__Encargado_();
		containerPrincipal = this.getmainContainer();
		
		containerPrincipal.add(_Cabecera_Encargado);
		containerPrincipal.add(_Listado_de_Compras__Encargado_);
		
		_Cabecera_Encargado.getbtnCerraSesion().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				UI.getCurrent().getPage().reload();
				
			}
		});
		
		_Cabecera_Encargado.getbtnMensajes().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Mensajeria _Mensajeria = new Mensajeria(ciber);
				containerPrincipal.removeAll();
				containerPrincipal.add(_Cabecera_Encargado);
				containerPrincipal.add(_Mensajeria);
			}
		});
		
	}
}