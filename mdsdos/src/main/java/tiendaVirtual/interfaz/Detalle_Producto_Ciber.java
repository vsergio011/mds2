package tiendaVirtual.interfaz;

public class Detalle_Producto_Ciber extends Detalle_Producto {
	private Object _addCarritoB;
	public Producto_Ciber _producto;
	public Anadir_a_Carrito _anadirACarrito;
	public Ver_Comentarios_Ciber _verComentarios;
	
	public Detalle_Producto_Ciber() {
		_verComentarios = new Ver_Comentarios_Ciber();
	}
	
	public Detalle_Producto_Ciber(appventawebbd.Producto p) {
		_verComentarios = new Ver_Comentarios_Ciber(p);
		
		this.getImg().setSrc(p.getFotos());
		this.getRateLabel().setText(String.format("Valoración media: %f/5", p.getValoracionMedia()));
		this.getDescriptionLabel().setText(p.getDescripcion());
		this.getPriceLAbel().setText(String.format("%f €", p.getPrecio()));
		this.getVaadinTextArea().setValue(p.getDetalles() == null ? "" : p.getDetalles());
	}
	
	public Producto_Carrito GetProductocarrito() {
		Producto_Carrito pc = new Producto_Carrito();
		
		pc.getImgProducto().setSrc(this.getImg().getSrc());
		pc.getDescripProducLbl().setText(this.getDescriptionLabel().getText());
		
		// TODO: Añadir los valores que faltan.
		
		return pc;
	}
}