package basededatos;

import appventawebbd.Producto;
import appventawebbd.Usuario;
import appventawebbd.Mensaje;

import java.util.List;

import appventawebbd.Cibernauta;
import appventawebbd.Comentario;
import appventawebbd.Pendiente;
import appventawebbd.Entregado;
import appventawebbd.Enviado;
import appventawebbd.Item;

public interface iCibernauta_Registrado extends iCibernauta {

	public Pendiente RealizaCompra(List<Item> aItems, Cibernauta aCiber, double precio);

	public void modificarDatos(int idCiber, Usuario aCiber);

	public Mensaje[] getMensajesRecibidos(int aId);
	
	public Mensaje[] getMensajesEnviados(int aId);

	public Cibernauta getCibernauta(int aId);

	public void borrarCuenta(int aIdCiber);

	public void comentarProducto(int aIdProduct, Comentario aComentario, int idCiber);

	public Pendiente[] listadoComprasPendientes(int aIdCiber);

	public Entregado[] listadoComprasEntregadas(int aIdCiber);

	public Enviado[] listadoComprasEnviadas(int aIdCiber);

	public boolean isPedidoEnviado(int aId);

	public Pendiente getPedidoPendiente(int aId);

	public Enviado getPedidoEnviado(int aId);

	public Entregado getPedidoEntregado(int aId);

	public Item[] getItemsPedido(int aIdPedido);

	public void cancelarCompra(Pendiente pedido);
	
	public void ActualizarValoracionMedia(int idProducto);
}