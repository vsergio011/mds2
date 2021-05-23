package tiendaVirtual.interfaz;

public class Producto_Carrito extends Producto_Pedido {
	// private event _quitar_de_Lista;
	// private event _cantidad;
	public Carrito_de_la_compra _productos;

	public void Quitar_de_Lista() {
		throw new UnsupportedOperationException();
	}

	public void Cantidad() {
		throw new UnsupportedOperationException();
	}
	
	public Producto_Carrito(appventawebbd.Producto p) {
		this.getComEntarBtn().setVisible(false);
		// this.getCantidadCombo().setValue("1");
		this.getDescripProducLbl().setText(p.getDescripcion());
		this.getNombreProductoLbl().setText(p.getNombre());
		this.getPrecioUnidadLbl().setText(p.getPrecio() + "");
		this.getImgProducto().setHeight("50px");
		this.getImgProducto().setWidth("50px");
		this.getImgProducto().setSrc(p.getFotos());
		
		// TODO: Ajustar dependiendo de la cantidad que haya seleccionado.
		this.getPrecioEurosLbl().setText("");
	}
}