package basededatos;

import basededatos.BDPrincipal;
import java.util.Vector;
import appventawebbd.Entregado;
import appventawebbd.Pedido;

public class BD_Entregado {
	public BDPrincipal _bd_prin_entr;
	public Vector<Entregado> _contiene_entregados = new Vector<Entregado>();

	public Pedido getPedido(int aId) {
		throw new UnsupportedOperationException();
	}

	public Entregado[] listadoComprasEntregadas(int aIdCiber) {
		throw new UnsupportedOperationException();
	}

	public Entregado[] listadoComprasEntregadas() {
		throw new UnsupportedOperationException();
	}

	public Entregado getPedidoEntregado(int aId) {
		throw new UnsupportedOperationException();
	}
}