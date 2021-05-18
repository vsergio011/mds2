package basededatos;

import appventawebbd.Producto;
import appventawebbd.Empleado;
import appventawebbd.Encargado;
import appventawebbd.Pedido;
import appventawebbd.Item;
import appventawebbd.Pendiente;
import appventawebbd.Entregado;
import appventawebbd.Enviado;
import appventawebbd.Oferta;

import java.util.List;

import appventawebbd.Categoria;

public interface iAdministrador {

	public int altaProducto(Producto aProducto);

	public List<Empleado> listempleados();

	public void modificarEmpleado(Encargado aEmpleado);

	public void cambiar_Imagen_de_Perfil(String aImagen, int aIdEmpleado);

	public void transferirAdministrador(int aIdOrigen, int aIdDestino);

	public void modificarProducto(Producto aProducto);

	public void borrarProducto(int aProducto);

	public Empleado[] listEmpleados();

	public Pedido getPedido(int aId);

	public Item[] getItemsProducto(int aIdPedido);

	public Producto getProducto(int aId);

	public Pendiente[] listadoComprasPendientes(int aIdCiber);

	public Entregado[] listadoComprasEntregadas(int aIdCiber);

	public Enviado[] listadoComprasEnviadas(int aIdCiber);

	public void anadirAOferta(int aIdProducto, Oferta aOferta);

	public void quitarProductoOferta(int aIdProducto);

	public void addCategoria(Categoria aCategoria);

	public void anadirFoto(int aIdProducto, String aImage);
}