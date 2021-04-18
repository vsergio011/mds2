package tiendaVirtual.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCarrito;

public class Carrito extends VistaCarrito {
	private Object _precioL;
	public Carrito_de_la_compra _productos;

	public void Actualizar_total() {
		throw new UnsupportedOperationException();
	}
	
	public Carrito() {
		_productos = new Carrito_de_la_compra();
	}
	
	public Carrito(Producto_Carrito...productos) {
		_productos = new Carrito_de_la_compra(productos);
		updateProducts();
	}
	
	public void AddProductoCarrito(Producto_Carrito...productos)
	{
		this._productos.AddProductoCarrito(productos);
		updateProducts();
	}
	
	private void updateProducts() {
		VerticalLayout vl = this.getProductosLayout().as(VerticalLayout.class);
		
		for (Producto_Carrito pc : this._productos._producto) {
			vl.add(pc);
		}
	}
	
}