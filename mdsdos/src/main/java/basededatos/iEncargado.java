package basededatos;

import appventawebbd.Pedido;
import appventawebbd.Transportista;

public interface iEncargado {
	void AddPedidoEnviado(Pedido pedido, Transportista transportista);
}