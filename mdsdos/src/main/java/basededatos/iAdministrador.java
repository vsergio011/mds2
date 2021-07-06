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

	public Producto altaProducto(Producto aProducto, List<String> images, int cat);

	public List<Empleado> listempleados();

	public Producto modificarProducto(int idProducto, Producto aProducto, List<String> fotos, int cat);

	public void borrarProducto(Producto aProducto);

	public Item[] getItemsProducto(int aIdPedido);

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
	
	public void modificarDatos(int idCiber, appventawebbd.Usuario aCiber);
}