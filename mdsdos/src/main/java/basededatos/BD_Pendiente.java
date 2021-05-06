package basededatos;

import basededatos.BDPrincipal;
import java.util.Vector;

import appventawebbd.Item;
import appventawebbd.Pedido;
import appventawebbd.Pendiente;

public class BD_Pendiente {
	public BDPrincipal _bd_prin_pend;
	public Vector<Pendiente> _contiene_pedidos = new Vector<Pendiente>();

	public void RealizaCompra(Item[] aItems, int aCiber) {
		throw new UnsupportedOperationException();
	}

	public Pedido getPedido(int aId) {
		throw new UnsupportedOperationException();
	}

	public Pendiente[] listadoComprasPendientes(int aIdCiber) {
		throw new UnsupportedOperationException();
	}

	public void operation(int aIdCiber) {
		throw new UnsupportedOperationException();
	}

	public void cambioDatosCompra(String aDireccion, String aFormapago, int aIdPedido) {
		throw new UnsupportedOperationException();
	}

	public Pendiente getPedidoPendiente(int aId) {
		throw new UnsupportedOperationException();
	}

	public void cancelarCompra(int aIdCiber, int aIdCompra) {
		throw new UnsupportedOperationException();
	}
}