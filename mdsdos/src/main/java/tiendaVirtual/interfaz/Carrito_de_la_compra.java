package tiendaVirtual.interfaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
//import interfaz.Cabecera_Carrito;
//import interfaz.Producto_Carrito;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;

public class Carrito_de_la_compra {
	private Object _tituloL;
	public Carrito _carrito;
	public Vector<Cabecera_Carrito> _list_Cabecera_Carrito = new Vector<Cabecera_Carrito>();
	public Vector<Producto_Carrito> _producto = new Vector<Producto_Carrito>();
	
	public void AddProductoCarrito(Producto_Carrito...productos)
	{
		for (Producto_Carrito pro : productos) {
			this._producto.add(pro);
		}
	}
	
	public void RemoveProductoCarrito(Producto_Carrito...productos)
	{
		for (Producto_Carrito pro : productos) {
			this._producto.remove(pro);
		}
	}
	
	public List<appventawebbd.Item> GetItems() {
		List<appventawebbd.Item> items = new ArrayList<appventawebbd.Item>();
		for (Producto_Carrito p : _producto) {
			items.add(p.GetItem());
		}
		return items;
	}
}