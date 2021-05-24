package tiendaVirtual.interfaz;

import java.util.Vector;
// import interfaz.Elemento_Pedido__Encargado_;

import vistas.VistaEncargadolistadodecompras;

public class Listado_de_Compras__Encargado_ extends VistaEncargadolistadodecompras {
	public Encargado _encargado;
	public Nuevos _nuevos;
	public Enviados _enviados;
	public Recibidos _recibidos;
	public Fecha _fecha;
	public Vector<Elemento_Pedido__Encargado_> _elementoPedido = new Vector<Elemento_Pedido__Encargado_>();

	public Listado_de_Compras__Encargado_() {
		
	}
}