package tiendaVirtual.interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaTransportista;

// import basededatos.iTransportista;

public class Transportista extends VistaTransportista{
	// public iTransportista _iTransportista;
	public Listado_de_Compras__Transportista_ _compras;
	public VerticalLayout containerPrincipal;
	public Transportista (appventawebbd.Cibernauta ciber) {
	Listado_de_Compras__Transportista_ _Listado_de_Compras__Transportista_ = new Listado_de_Compras__Transportista_();
	containerPrincipal = this.getcontainerPrincipal();
	containerPrincipal.add(_Listado_de_Compras__Transportista_);
		
	_Listado_de_Compras__Transportista_.getbtnExit().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				UI.getCurrent().getPage().reload();
				
			}
		});
	}
}