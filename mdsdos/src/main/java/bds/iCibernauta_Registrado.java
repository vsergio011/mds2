package bds;

import Diagrama_BD.Producto;
import Diagrama_BD.Mensaje;
import Diagrama_BD.Cibernauta;
import Diagrama_BD.Comentario;
import Diagrama_BD.Pendiente;
import Diagrama_BD.Entregado;
import Diagrama_BD.Enviado;
import Diagrama_BD.Item;

public interface iCibernauta_Registrado extends iCibernauta {

	public void RealizarCompra(Producto[] aProductos, int aIdUsuario);

	public Mensaje detalleMensaje(int aId);

	public void nuevaNotificacion(int aOrigen, int aDestino, Mensaje aMensaje);

	public void modificarDatos(Cibernauta aCiber);

	public Mensaje[] getMensajes(int aId);

	public Cibernauta getCibernauta(int aId);

	public void borrarCuenta(int aIdCiber);

	public void cambiarImagen(int aIdCiber, String aImagen);

	public void comentarProducto(int aIdProduct, Comentario aComentario);

	public Pendiente[] listadoComprasPendientes(int aIdCiber);

	public Entregado[] listadoComprasEntregadas(int aIdCiber);

	public Enviado[] listadoComprasEnviadas(int aIdCiber);

	public boolean isPedidoEnviado(int aId);

	public void cambioDatosCompra(String aDireccion, String aFormapago, int aIdPedido);

	public Pendiente getPedidoPendiente(int aId);

	public Enviado getPedidoEnviado(int aId);

	public void getPedidoEntregado(int aId);

	public Item[] getItemsPedido(int aIdPedido);

	public Producto[] getProductos(int[] aIdItems);

	public void cancelarCompra(int aIdCiber, int aIdCompra);
}