package tiendaVirtual.interfaz;

import java.text.DecimalFormat;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import Helpers.Notifications.NotificationType;
import vistas.VistaCarrito;

public class Carrito extends VistaCarrito {
	private Object _precioL;
	public Carrito_de_la_compra _productos;

	public double precio = 0;
	public void Actualizar_total() {
		double precio = 0;		
		/*for (appventawebbd.Item item : _productos.GetItems()) {
			precio += item.getProducto().getPrecio() * item.getCantidad();
		}*/
		for (Producto_Carrito pc : _productos._producto) {
			double price = pc.precioOferta != 0 ? pc.precioOferta : pc.GetItem().getProducto().getPrecio();
			precio += price * pc.GetItem().getCantidad();
		}
		this.precio = precio;
		this.getPriceLbl().setText(new DecimalFormat("#.##").format(precio) + " €");
	}
	
	public Carrito() {
		_productos = new Carrito_de_la_compra();
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
			pc.getVaadinComboBox().addValueChangeListener(e -> {
				appventawebbd.Item item = pc.GetItem();
				
				int cant = Integer.parseInt(pc.getVaadinComboBox().getValue());
				item.setCantidad(cant);
				pc.getUnidadesLbl().setText("Cantidad: " + cant);
				pc.getPrecioEurosLbl().setText("Precio total: " + item.getProducto().getPrecio() * cant + " €");
				
				Actualizar_total();
			});	
		}
		
		Helpers.Notifications.ShowAlert("Producto añadido al carrito con exito.", NotificationType.INFORMATION);
	}
	
	public void ClearCarrito() {
		this._productos._producto.clear();
		this.updateProducts();
	} 
	
	private void DeleteProductoCarrito(Producto_Carrito...productos) {
		this._productos.RemoveProductoCarrito(productos);
		updateProducts();
	}
	
	private void updateProducts() {
		VerticalLayout vl = this.getProductosLayout().as(VerticalLayout.class);
		vl.removeAll();
		
		this.getComprarBtn().setVisible(this._productos._producto.size() != 0);
		for (Producto_Carrito pc : this._productos._producto) {
			vl.add(pc);
		}
		Actualizar_total();
	}
}