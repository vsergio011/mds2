package basededatos;

import java.util.List;

import appventawebbd.Enviado;
import appventawebbd.Pedido;

public interface iTransportista {
	void AddPedidoEntregado(int pedido);
	
	public Enviado[] listadoComprasEnviadas();
}