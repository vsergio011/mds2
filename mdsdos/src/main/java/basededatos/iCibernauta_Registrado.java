package basededatos;

import appventawebbd.Producto;
import appventawebbd.Mensaje;

import java.util.List;

import appventawebbd.Cibernauta;
import appventawebbd.Comentario;
import appventawebbd.Pendiente;
import appventawebbd.Entregado;
import appventawebbd.Enviado;
import appventawebbd.Item;

public interface iCibernauta_Registrado extends iCibernauta {

	public Pendiente RealizaCompra(List<Item> aItems, Cibernauta aCiber);

	public Mensaje detalleMensaje(int aId);

	public void nuevaNotificacion(int aOrigen, int aDestino, Mensaje aMensaje);

	public void modificarDatos(int idCiber, Cibernauta aCiber);

	public Mensaje[] getMensajes(int aId);

	public Cibernauta getCibernauta(int aId);

	public void borrarCuenta(int aIdCiber);

	public void cambiarImagen(int aIdCiber, String aImagen);

	public void comentarProducto(Producto aIdProduct, Comentario aComentario);

	public List<Pendiente> listadoComprasPendientes(int aIdCiber);

	public List<Entregado> listadoComprasEntregadas(int aIdCiber);

	public List<Enviado> listadoComprasEnviadas(int aIdCiber);

	public boolean isPedidoEnviado(int aId);

	public void cambioDatosCompra(String aDireccion, String aFormapago, int aIdPedido);

	public Pendiente getPedidoPendiente(int aId);

	public Enviado getPedidoEnviado(int aId);

	public Entregado getPedidoEntregado(int aId);

	public Item[] getItemsPedido(int aIdPedido);

	public Producto[] getProductos(int[] aIdItems);

	public void cancelarCompra(Pendiente pedido);
}