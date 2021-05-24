package tiendaVirtual.interfaz;

import basededatos.BDPrincipal;
import basededatos.iCibernauta_Registrado;
import vistas.VistaCompra;

public class Compra extends VistaCompra {
	// private event _cancelar_Pedido;
	public Compras _compras;
	public Datos_Compra _datosCompra;
	public Productos_Adquiridos _productosAdquiridos;
	
	private appventawebbd.Pedido pedido = null;

	public void Cancelar_Pedido() {
		iCibernauta_Registrado cibernauta = new BDPrincipal();
		
		appventawebbd.Pendiente pendiente = cibernauta.getPedidoPendiente(this.pedido.getId());
		if (pendiente != null) {
			cibernauta.cancelarCompra(pendiente);
		}
	}

	public void Comprobar_envio() {
		throw new UnsupportedOperationException();
	}
	
	public Compra(appventawebbd.Pedido pedido) {
		_productosAdquiridos = new Productos_Adquiridos(pedido);
		this.pedido = pedido;
		
		this.getFechaPedidoLbl().setText(pedido.getFechaPedido());
		this.getIdLBL().setText("ID: " + pedido.getId());
		this.getPrecioLbl().setText(pedido.getTotal() + " €");
	}
	
	public appventawebbd.Pedido GetPedido() {
		return pedido;
	}
}