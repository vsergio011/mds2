package tiendaVirtual.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaDetallecompra;
// import interfaz.Producto_Adquirido;

public class Productos_Adquiridos extends VistaDetallecompra {
	public Compra _compra;
	public Vector<Producto_Adquirido> _productoAdquirido = new Vector<Producto_Adquirido>();
	
	public Productos_Adquiridos(appventawebbd.Pedido pedido) {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		for (appventawebbd.Item item : pedido.items.toArray()) {
			vl.add(new Producto_Adquirido(item));
		}
		
		this.getTotal().setValue(pedido.getTotal() + " €");
		
		// TODO: Esto debe ser con una condicion de si se ha enviado o no.
		this.getCancelarCompraBtn().setEnabled(false);
		this.getLabel().setText(pedido.getFechaPedido());
		this.getIdPedido().setText("ID: " + pedido.getId());
		
	}
}