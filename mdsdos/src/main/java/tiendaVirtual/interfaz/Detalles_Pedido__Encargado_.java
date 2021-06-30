package tiendaVirtual.interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iEncargado;

public class Detalles_Pedido__Encargado_ extends Detalles_Pedido {
	// private event _enviado;
	private Object _enviadoCHK;
	private Object _recibidoCHK;
	public Elemento_Pedido__Encargado_ _elementoPedido;
	
	private appventawebbd.Pedido pedido = null;

	public void Enviado() {
		iEncargado encargado = new BDPrincipal();
		encargado.AddPedidoEnviado(pedido.getId());
	}
	
	public Detalles_Pedido__Encargado_(appventawebbd.Pendiente pedido) {
		this.pedido = pedido;
		
		this.getCheckEnviado().setValue(false);
		this.getCheckRecibido().setValue(false);
		
		this.getCheckEnviado().setReadOnly(true);
		this.getCheckRecibido().setReadOnly(true);
		
		this.getAprobarBtn().setVisible(true);
		this.getRecibidoBtn().setVisible(false);
		
		fillData(pedido);
	}
	
	public Detalles_Pedido__Encargado_(appventawebbd.Enviado pedido) {
		this.pedido = pedido;
		
		this.getCheckEnviado().setValue(true);
		this.getCheckEnviado().setReadOnly(true);
		this.getCheckRecibido().setValue(false);
		this.getCheckRecibido().setReadOnly(true);
		
		this.getAprobarBtn().setVisible(false);
		this.getRecibidoBtn().setVisible(false);
		
		fillData(pedido);
	}

	public Detalles_Pedido__Encargado_(appventawebbd.Entregado pedido) {
		this.pedido = pedido;
		
		this.getCheckEnviado().setValue(false);
		this.getCheckEnviado().setReadOnly(true);
		this.getCheckRecibido().setValue(true);
		this.getCheckRecibido().setReadOnly(true);
		
		this.getAprobarBtn().setVisible(false);
		this.getRecibidoBtn().setVisible(false);
		
		fillData(pedido);
	}
	
	private void fillData(appventawebbd.Pedido pedido) {
		this.getIdentificadorLbl().setText("ID: " + pedido.getId());
		this.getLbDatosComprador().setText(pedido.getCibernauta().getNombre() + " " + pedido.getCibernauta().getApellidos());
		this.getLbDireccionComprador().setText(pedido.getCibernauta().getDireccionCompleta());
		this.getLbFechaPedido().setText(pedido.getFechaPedido());
		
		VerticalLayout vl = this.getContenedorProductos().as(VerticalLayout.class);
		
		double precioTotal = 0;
		BDPrincipal bd = new BDPrincipal();
		for (appventawebbd.Item item : bd.getItemsPedido(pedido.getId())) {
			Label label = new Label();
			precioTotal += item.getCantidad() * item.getProducto().getPrecio();
			label.setText("Producto ID: " + item.getProducto().getId() + ", Cantidad: " + item.getCantidad() + ", Precio unidad: " + item.getProducto().getPrecio() + "€");
			label.setWidthFull();
			vl.add(label);
		}
		
		this.getTextTotal().setValue(precioTotal + " €");
	}
}