package tiendaVirtual.interfaz;

import java.util.Vector;
// import interfaz.Elemento_Pedido__Transportista_;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iTransportista;
import vistas.VistaTransportistalistadopedidos;

public class Listado_de_Compras__Transportista_ extends VistaTransportistalistadopedidos {
	private Object _logo;
	private Object _exitB;
	public Transportista _transportista;
	public Vector<Elemento_Pedido__Transportista_> _pedido = new Vector<Elemento_Pedido__Transportista_>();
	
	public Listado_de_Compras__Transportista_(appventawebbd.Transportista transportista) {
		iTransportista t = new BDPrincipal();
		
		VerticalLayout vl = this.getcontainerPedido();
		for (appventawebbd.Enviado pedido : t.listadoComprasEnviadas()) {
			Elemento_Pedido__Transportista_ elemento = new Elemento_Pedido__Transportista_(pedido);
			_pedido.add(elemento);
			vl.add(elemento);
		}
	}
}