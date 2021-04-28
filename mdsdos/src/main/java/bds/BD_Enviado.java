package bds;

import java.util.Vector;


import Diagrama_BD.Enviado;
import Diagrama_BD.Pedido;

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