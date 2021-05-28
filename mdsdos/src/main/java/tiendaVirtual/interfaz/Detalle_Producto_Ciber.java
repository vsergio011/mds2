package tiendaVirtual.interfaz;

public class Detalle_Producto_Ciber extends Detalle_Producto {
	private Object _addCarritoB;
	public Producto_Ciber _producto;
	public Anadir_a_Carrito _anadirACarrito;
	public Ver_Comentarios_Ciber _verComentarios;
	
	private appventawebbd.Producto producto = null;
	public Detalle_Producto_Ciber(appventawebbd.Producto p) {
		this.producto = p;
		_verComentarios = new Ver_Comentarios_Ciber(p);
		
		this.getImg().setSrc(p.getFotos());
		this.getRateLabel().setText(String.format("Valoración media: %f/5", p.getValoracionMedia()));
		this.getDescriptionLabel().setText(p.getDescripcion());
		this.getPriceLAbel().setText(String.format("%f €", p.getPrecio()));
		this.getVaadinTextArea().setValue(p.getDetalles() == null ? "" : p.getDetalles());
		
		this.fillImgs(p);
	}
	
	public Producto_Carrito GetProductocarrito() {		
		return new Producto_Carrito(producto);
	}
}