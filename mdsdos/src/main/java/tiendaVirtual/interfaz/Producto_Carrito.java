package tiendaVirtual.interfaz;

public class Producto_Carrito extends Producto_Pedido {
	// private event _quitar_de_Lista;
	// private event _cantidad;
	public Carrito_de_la_compra _productos;

	appventawebbd.Item item = null;
	
	public void Quitar_de_Lista() {
		throw new UnsupportedOperationException();
	}

	public void Cantidad() {
		throw new UnsupportedOperationException();
	}
	
	public Producto_Carrito(appventawebbd.Producto p) {
		this.getVaadinComboBox().setItems("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
		
		item = new appventawebbd.Item();
		item.setProducto(p);
		
		int cantidad = this.getVaadinComboBox().getValue() == null ? 1 :Integer.parseInt(this.getVaadinComboBox().getValue());
		item.setCantidad(cantidad);
		
		this.getComEntarBtn().setVisible(false);
		this.getDescripProducLbl().setText(p.getDescripcion());
		this.getNombreProductoLbl().setText(p.getNombre());
		this.getPrecioUnidadLbl().setText("Precio unidad: " + p.getPrecio() + " €");
		this.getImgProducto().setSrc(p.getFotos());
		this.getValoracionLbl().setText("Valoración media: " +p.getValoracionMedia() + "/5");
		this.getPrecioEurosLbl().setText((p.getPrecio()  * cantidad) + " €");
		this.getImgProducto().setHeight("200px");
		
		this.getUnidadesLbl().setText("Cantidad: " + cantidad);
		this.getVaadinComboBox().addValueChangeListener(e -> {
			int cant = Integer.parseInt(this.getVaadinComboBox().getValue());
			item.setCantidad(cant);
			this.getUnidadesLbl().setText("Cantidad: " + cant);
		});
		
		// TODO: Ajustar dependiendo de la cantidad que haya seleccionado.
		this.getPrecioEurosLbl().setText("");
	}
	
	public appventawebbd.Item GetItem() {
		return item;
	}
}