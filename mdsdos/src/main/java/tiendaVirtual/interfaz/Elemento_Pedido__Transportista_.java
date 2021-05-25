package tiendaVirtual.interfaz;

public class Elemento_Pedido__Transportista_ extends Elemento_Pedido {
	private Object _logo;
	private Object _exitB;
	public Listado_de_Compras__Transportista_ _compras;
	public Detalles_Pedido__Transportista_ _detalles;
	
	public Elemento_Pedido__Transportista_(appventawebbd.Enviado pedido) {
		_detalles = new Detalles_Pedido__Transportista_(pedido);
		
		this.getPedidoBtnn().setText("ID: " + pedido.getId());
	}
}