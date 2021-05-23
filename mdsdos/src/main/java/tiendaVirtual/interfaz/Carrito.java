package tiendaVirtual.interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCarrito;

public class Carrito extends VistaCarrito {
	private Object _precioL;
	public Carrito_de_la_compra _productos;

	public void Actualizar_total() {
		throw new UnsupportedOperationException();
	}
	
	public Carrito(Producto_Carrito...productos) {
		_productos = new Carrito_de_la_compra(productos);
		updateProducts();
	}
	
	public void AddProductoCarrito(Producto_Carrito...productos)
	{
		this._productos.AddProductoCarrito(productos);
		updateProducts();
		for(Producto_Carrito pc : productos) {
			pc.getDeleteBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
				@Override
				public void onComponentEvent(ClickEvent<Button> event) {
					DeleteProductoCarrito(pc);
				}
			});
		}
	}
	
	private void DeleteProductoCarrito(Producto_Carrito...productos) {
		this._productos.RemoveProductoCarrito(productos);
		updateProducts();
	}
	
	private void updateProducts() {
		VerticalLayout vl = this.getProductosLayout().as(VerticalLayout.class);
		vl.removeAll();
		
		for (Producto_Carrito pc : this._productos._producto) {
			vl.add(pc);
		}
	}
}