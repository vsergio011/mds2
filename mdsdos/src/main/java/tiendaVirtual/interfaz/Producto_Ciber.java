package tiendaVirtual.interfaz;

public class Producto_Ciber extends Producto {
	private Object _addCarritoB;
	public Lista_de_Productos _listaProductos;
	public Ofertas_Populares _ofertasPopulares;
	public Listado_de_Productos _listadoProductos;
	public Anadir_a_Carrito _anadirACarrito;
	public Detalle_Producto_Ciber _detalleProducto;
	
	private appventawebbd.Producto p = null;
	public Producto_Ciber(appventawebbd.Producto p) {
		this.p = p;
		
		this.getProductLbl().setText(p.getNombre());
		_detalleProducto = new Detalle_Producto_Ciber(p);
	}
	
	public appventawebbd.Producto GetProducto() {
		return this.p;
	}
}