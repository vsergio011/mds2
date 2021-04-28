package bds;

import Diagrama_BD.Producto;
import Diagrama_BD.Empleado;
import Diagrama_BD.Encargado;
import Diagrama_BD.Pedido;
import Diagrama_BD.Item;
import Diagrama_BD.Pendiente;
import Diagrama_BD.Entregado;
import Diagrama_BD.Enviado;
import Diagrama_BD.Oferta;
import Diagrama_BD.Categoria;

public interface iAdministrador {

	public int altaProducto(Producto aProducto);

	public Empleado[] listempleados();

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