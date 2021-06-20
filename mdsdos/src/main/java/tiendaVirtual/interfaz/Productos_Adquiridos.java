package tiendaVirtual.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iCibernauta;
import basededatos.iCibernauta_Registrado;
import vistas.VistaDetallecompra;
// import interfaz.Producto_Adquirido;

public class Productos_Adquiridos extends VistaDetallecompra {
	public Compra _compra;
	public Vector<Producto_Adquirido> _productoAdquirido = new Vector<Producto_Adquirido>();
	
	public Productos_Adquiridos(appventawebbd.Pedido pedido) {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.removeAll();
		_productoAdquirido.clear();
		
		iCibernauta_Registrado bd = new BDPrincipal();
		for (appventawebbd.Item item : bd.getItemsPedido(pedido.getId())) {
			Producto_Adquirido pa = new Producto_Adquirido(item);
			_productoAdquirido.add(pa);
			vl.add(pa);
		}
		
		this.getTotal().setValue(pedido.getTotal() + " €");
		this.getCancelarCompraBtn().setEnabled(false);
		this.getLabel().setText(pedido.getFechaPedido());
		this.getIdPedido().setText("ID: " + pedido.getId());
	}	
}