package tiendaVirtual.interfaz;

import com.vaadin.flow.component.UI;

import Helpers.Notifications.NotificationType;
import basededatos.BDPrincipal;
import basededatos.iTransportista;

public class Detalles_Pedido__Transportista_ extends Detalles_Pedido {
	// private event _recibido;
	public Elemento_Pedido__Transportista_ _pedido;
	
	appventawebbd.Pedido pedido = null;

	public void Recibido() {
		iTransportista transportista = new BDPrincipal();
		transportista.AddPedidoEntregado(pedido.getId());
		
		Helpers.Notifications.ShowAlert("Pedido entregado con éxito.", NotificationType.INFORMATION);
		UI.getCurrent().getPage().reload();
	}
	
	public Detalles_Pedido__Transportista_(appventawebbd.Pedido pedido) {
		this.pedido = pedido;
		
		this.getContenedorProductos().setVisible(false);
		this.getTextTotal().setVisible(true);
		this.getCheckEnviado().setVisible(false);
		this.getCheckRecibido().setVisible(false);
		this.getAprobarBtn().setVisible(false);
		
		this.getLbDatosComprador().setText(pedido.getCibernauta().getNombre() + " " + pedido.getCibernauta().getApellidos());
		this.getLbDireccionComprador().setText(pedido.getDireccion());
		this.getLbFechaPedido().setText(pedido.getFechaPedido());
		this.getIdentificadorLbl().setText(pedido.getId() + "");
		this.getFormapagoLbl().setText(pedido.getFormaPago());
		this.getTextTotal().setValue(pedido.getTotal() + "");
	}
}