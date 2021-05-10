package tiendaVirtual.interfaz;

public class Ver_Comentarios_Ciber extends Ver_comentarios {
	private Object _addCarritoB;
	public Detalle_Producto_Ciber _detalleProducto;
	// public A�adir_a_Carrito _a�adirACarrito;
	
	public Ver_Comentarios_Ciber() {
		// TODO: Cambiar por los datos reales.
		this.getTitleLbl().setText("Producto de prueba");
	}
	
	public Ver_Comentarios_Ciber(appventawebbd.Producto p) {
		this.getTitleLbl().setText(p.getNombre());
		this.getValoracionLbl().setText(String.format("Valoración media: %f/5", p.getValoracionMedia()));
		
		// TODO: Deberíamos hacer un bucle.
		for (appventawebbd.Comentario comen : p.comentarios.toArray()) {
			this.getValoracionUsuarioLbl().setText(comen.getCibernauta().getNombre());
			this.getValoracionSpecLbl().setText(String.format("Valoración: %f/5", comen.getValoracion()));
			this.getVaadinTextArea().setValue(comen.getTexto());
		}
	}
}