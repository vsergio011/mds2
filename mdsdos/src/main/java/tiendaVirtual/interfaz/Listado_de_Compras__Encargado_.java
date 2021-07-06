package tiendaVirtual.interfaz;

import java.util.Vector;
// import interfaz.Elemento_Pedido__Encargado_;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import appventawebbd.Pendiente;
import basededatos.BDPrincipal;
import basededatos.iEncargado;
import vistas.VistaEncargadolistadodecompras;

public class Listado_de_Compras__Encargado_ extends VistaEncargadolistadodecompras {
	public Encargado _encargado;
	public Nuevos _nuevos;
	public Enviados _enviados;
	public Recibidos _recibidos;
	public Fecha _fecha;
	public Vector<Elemento_Pedido__Encargado_> _elementoPedido = new Vector<Elemento_Pedido__Encargado_>();
	
	iEncargado encargado = new BDPrincipal();
	
	public Listado_de_Compras__Encargado_() {
		_elementoPedido.clear();
		
		filterPendientes();
		filterEnviados();
		filterEntregados();
		resetView();
	}
	
	public void clearFilters() {
		filterPendientes();
		filterEnviados();
		filterEntregados();
	}
	
	public void filterPendientes() {
		for (Pendiente pedido : encargado.listadoComprasPendientes()) {
			Elemento_Pedido__Encargado_ elemento = new Elemento_Pedido__Encargado_(pedido);
			elemento.getPedidoBtnn().setText(pedido.getId() + " : " + "Pendiente || " + pedido.getCibernauta().getNombre() + " || " + pedido.getTotal() + "€");
			_elementoPedido.add(elemento);
		}
	}
	
	public void filterEnviados() {
		for (appventawebbd.Enviado pedido : encargado.listadoComprasEnviadas()) {
			Elemento_Pedido__Encargado_ elemento = new Elemento_Pedido__Encargado_(pedido);
			elemento.getPedidoBtnn().setText(pedido.getId() + " : " + "Enviado || " + pedido.getCibernauta().getNombre() + " || " + pedido.getTotal() + "€");
			_elementoPedido.add(elemento);
		}
	}
	
	public void filterEntregados() {
		for (appventawebbd.Entregado pedido : encargado.listadoComprasEntregadas()) {
			Elemento_Pedido__Encargado_ elemento = new Elemento_Pedido__Encargado_(pedido);
			elemento.getPedidoBtnn().setText(pedido.getId() + " : " + "Entregado || " + pedido.getCibernauta().getNombre() + " || " + pedido.getTotal() + "€");
			_elementoPedido.add(elemento);
		}
	}
	
	public void resetView() {
		VerticalLayout vl = this.getcontenedorPedidos();
		vl.removeAll();
		for (Elemento_Pedido__Encargado_ elemento : _elementoPedido) {
			vl.add(elemento);
		}
	}
}