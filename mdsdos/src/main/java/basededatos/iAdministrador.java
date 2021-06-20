package basededatos;

import appventawebbd.Producto;
import appventawebbd.Empleado;
import appventawebbd.Encargado;
import appventawebbd.Pedido;
import appventawebbd.Item;
import appventawebbd.Mensaje;
import appventawebbd.Pendiente;
import appventawebbd.Entregado;
import appventawebbd.Enviado;
import appventawebbd.Oferta;

import java.util.List;

import appventawebbd.Categoria;

public interface iAdministrador {

	public Producto altaProducto(Producto aProducto, List<String> images);

	public List<Empleado> listempleados();

	public void modificarEmpleado(Encargado aEmpleado);

	public void cambiar_Imagen_de_Perfil(String aImagen, int aIdEmpleado);

	public void transferirAdministrador(int aIdOrigen, int aIdDestino);

	public Producto modificarProducto(int idProducto, Producto aProducto, List<String> fotos);

	public void borrarProducto(Producto aProducto);

	public Empleado[] listEmpleados();

	public Pedido getPedido(int aId);

	public Item[] getItemsProducto(int aIdPedido);

	public Producto getProducto(int aId);

	public Pendiente[] listadoComprasPendientes(int aIdCiber);

	public Entregado[] listadoComprasEntregadas(int aIdCiber);

	public Enviado[] listadoComprasEnviadas(int aIdCiber);

	public void anadirAOferta(int aIdProducto, Oferta aOferta);

	public void quitarProductoOferta(int aIdProducto);

	public Categoria addCategoria(Categoria aCategoria);

	public void anadirFoto(int aIdProducto, String aImage);
	
	public Oferta estaEnOferta(int idProducto);
	
	public Mensaje[] getMensajesRecibidos(int aId);
	
	public Mensaje[] getMensajesEnviados(int aId);
}