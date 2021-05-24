package tiendaVirtual.interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEncargado;
// import basededatos.iEncargado;

public class Encargado extends VistaEncargado {
	// public iEncargado _iEncargado;
	public Cabecera_Encargado _cabecera;
	//public Seleccion_de_Compras _seleccionDeCompras;
	public Listado_de_Compras__Encargado_ _listadoCompras;
	VerticalLayout containerPrincipal;
	
	public Encargado(appventawebbd.Encargado encargado) {
		_cabecera = new Cabecera_Encargado(encargado);
		_listadoCompras = new Listado_de_Compras__Encargado_();
		containerPrincipal = this.getmainContainer();
		
		containerPrincipal.add(_cabecera);
		containerPrincipal.add(_listadoCompras);
		AddListenerButtons();
		
		_cabecera.getbtnCerraSesion().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				UI.getCurrent().getPage().reload();
			}
		});
		_cabecera.getPrincipalBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				containerPrincipal.removeAll();
				containerPrincipal.add(_cabecera);
				containerPrincipal.add(_listadoCompras);
				AddListenerButtons();
			}
		});
		_cabecera.getbtnMensajes().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				containerPrincipal.removeAll();
				containerPrincipal.add(_cabecera);
				containerPrincipal.add(_cabecera._mensajeria);
			}
		});
		_listadoCompras.getbtnNuevo().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				_listadoCompras._elementoPedido.clear();
				_listadoCompras.filterPendientes();
				_listadoCompras.resetView();
				AddListenerButtons();
			}
		});
		_listadoCompras.getbtnEnviado().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				_listadoCompras._elementoPedido.clear();
				_listadoCompras.filterEnviados();
				_listadoCompras.resetView();
				AddListenerButtons();
			}
		});
		_listadoCompras.getbtnRecibido().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				_listadoCompras._elementoPedido.clear();
				_listadoCompras.filterEntregados();
				_listadoCompras.resetView();
				AddListenerButtons();
			}
		});
		_listadoCompras.getFiltrarBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if (!_listadoCompras.getInputSearch().getValue().isEmpty()) {
					_listadoCompras._elementoPedido.clear();
					_listadoCompras.filterText();
					_listadoCompras.resetView();
					AddListenerButtons();
				}
			}
		});
	}
	
	private void AddListenerButtons() {
		for (Elemento_Pedido__Encargado_ elemento : _listadoCompras._elementoPedido) {
			elemento.getPedidoBtnn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
				@Override
				public void onComponentEvent(ClickEvent<Button> event) {
					containerPrincipal.removeAll();
					containerPrincipal.add(_cabecera);
					containerPrincipal.add(elemento._detalles);
				}
			});
		}
	}
}