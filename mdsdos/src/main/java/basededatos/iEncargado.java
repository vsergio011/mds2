package basededatos;

import java.util.List;

import appventawebbd.Entregado;
import appventawebbd.Enviado;
import appventawebbd.Mensaje;
import appventawebbd.Pedido;
import appventawebbd.Pendiente;
import appventawebbd.Transportista;

public interface iEncargado {
	void AddPedidoEnviado(Pedido pedido, Transportista transportista);
	
	public List<Pendiente> listadoComprasPendientes();

	public List<Entregado> listadoComprasEntregadas();

	public List<Enviado> listadoComprasEnviadas();
	
	public Mensaje[] getMensajesRecibidos(int aId);
	
	public Mensaje[] getMensajesEnviados(int aId);
}