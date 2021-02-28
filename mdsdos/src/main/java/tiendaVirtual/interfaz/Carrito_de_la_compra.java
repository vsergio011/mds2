package tiendaVirtual.interfaz;

import java.util.Vector;
import interfaz.Cabecera_Carrito;
import interfaz.Producto_Carrito;

public class Carrito_de_la_compra {
	private Object _tituloL;
	public Carrito _carrito;
	public Vector<Cabecera_Carrito> _list_Cabecera_Carrito = new Vector<Cabecera_Carrito>();
	public Vector<Producto_Carrito> _producto = new Vector<Producto_Carrito>();
}