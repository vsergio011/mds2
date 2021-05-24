package tiendaVirtual.interfaz;

public class Elemento_Pedido__Encargado_ extends Elemento_Pedido {
	public Listado_de_Compras__Encargado_ _listadoCompras;
	public Detalles_Pedido__Encargado_ _detalles;
	
	public Elemento_Pedido__Encargado_(appventawebbd.Pendiente pedido) {
		_detalles = new Detalles_Pedido__Encargado_(pedido);
	}
	
	public Elemento_Pedido__Encargado_(appventawebbd.Enviado pedido) {
		_detalles = new Detalles_Pedido__Encargado_(pedido);
	}
	
	public Elemento_Pedido__Encargado_(appventawebbd.Entregado pedido) {
		_detalles = new Detalles_Pedido__Encargado_(pedido);
	}
}