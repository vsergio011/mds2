package tiendaVirtual.interfaz;

public class Info_Producto {
	public Producto _producto;
	public Detalle_Producto _detalle;
	
	public Info_Producto()
	{
		_detalle = new Detalle_Producto();
	}
}