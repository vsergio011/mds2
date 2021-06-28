package tiendaVirtual.interfaz;

import basededatos.BDPrincipal;
import basededatos.iTransportista;

public class Detalles_Pedido__Transportista_ extends Detalles_Pedido {
	// private event _recibido;
	public Elemento_Pedido__Transportista_ _pedido;
	
	appventawebbd.Pedido pedido = null;

	public void Recibido() {
		iTransportista transportista = new BDPrincipal();
		transportista.AddPedidoEntregado(pedido.getId());
	}

	public void Comprobar_recibido() {
		throw new UnsupportedOperationException();
	}
	
	public Detalles_Pedido__Transportista_(appventawebbd.Pedido pedido) {
		this.pedido = pedido;
		
		this.getContenedorProductos().setVisible(false);
		this.getTextTotal().setVisible(false);
		this.getCheckEnviado().setVisible(false);
		this.getCheckRecibido().setVisible(false);
		this.getAprobarBtn().setVisible(false);
	}
}