package tiendaVirtual.interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaTransportista;

// import basededatos.iTransportista;

public class Transportista extends VistaTransportista {
	// public iTransportista _iTransportista;
	public Listado_de_Compras__Transportista_ _compras;
	public VerticalLayout containerPrincipal;
	public Transportista (appventawebbd.Transportista transportista) {
	_compras = new Listado_de_Compras__Transportista_(transportista);
	containerPrincipal = this.getcontainerPrincipal();
	containerPrincipal.add(_compras);
		
		/*this.getCerrarSesionBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				UI.getCurrent().getPage().reload();
			}
		});*/
		
		for(Elemento_Pedido__Transportista_ pedido : _compras._pedido) {
			pedido.getPedidoBtnn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
				@Override
				public void onComponentEvent(ClickEvent<Button> event) {
					containerPrincipal.removeAll();
					containerPrincipal.add(pedido._detalles);
					
					pedido._detalles.getRecibidoBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
						@Override
						public void onComponentEvent(ClickEvent<Button> event) {
							containerPrincipal.removeAll();
							pedido._detalles.Recibido();
							containerPrincipal.add(_compras);
						}
					});
				}
			});
		}
	}
}