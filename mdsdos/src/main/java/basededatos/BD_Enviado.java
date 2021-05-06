package basededatos;

import basededatos.BDPrincipal;
import java.util.Vector;
import appventawebbd.Enviado;
import appventawebbd.Pedido;

public class BD_Enviado {
	public BDPrincipal _bd_prin_env;
	public Vector<Enviado> _contiene_enviados = new Vector<Enviado>();

	public Pedido getPedido(int aId) {
		throw new UnsupportedOperationException();
	}

	public Enviado[] listadoComprasEnviadas(int aIdCiber) {
		throw new UnsupportedOperationException();
	}

	public boolean isPedidoEnviado(int aId) {
		throw new UnsupportedOperationException();
	}

	public Enviado getPedidoEnviado(int aId) {
		throw new UnsupportedOperationException();
	}
}