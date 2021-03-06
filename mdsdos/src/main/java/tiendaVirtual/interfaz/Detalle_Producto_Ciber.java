package tiendaVirtual.interfaz;

import basededatos.BDPrincipal;

public class Detalle_Producto_Ciber extends Detalle_Producto {
	private Object _addCarritoB;
	public Producto_Ciber _producto;
	public Anadir_a_Carrito _anadirACarrito;
	public Ver_Comentarios_Ciber _verComentarios;
	
	private appventawebbd.Producto producto = null;
	public Detalle_Producto_Ciber(appventawebbd.Producto p) {
		this.producto = p;
		_verComentarios = new Ver_Comentarios_Ciber(p);
		
		this.getTituloProductoLbl().setText(producto.getNombre());
		this.getImg().setSrc(p.getFotos());
		this.getRateLabel().setText(String.format("Valoración media: %f/5", p.getValoracionMedia()));
		this.getDescriptionLabel().setText(p.getDescripcion());
		
		super.FillPrecioProducto(p);
		
		this.getVaadinTextArea().setValue(p.getDetalles() == null ? "" : p.getDetalles());
		
		this.fillImgs(p);
	}
	
	public Producto_Carrito GetProductocarrito() {		
		return new Producto_Carrito(producto, 0);
	}
	
	private appventawebbd.Oferta oferta = null;
	public Detalle_Producto_Ciber(appventawebbd.Oferta oferta) {
		this.oferta = oferta;
		_verComentarios = new Ver_Comentarios_Ciber(oferta.getProducto());
		
		appventawebbd.Producto pro = oferta.getProducto();
		this.getTituloProductoLbl().setText(producto.getNombre());
		this.getImg().setSrc(pro.getFotos());
		this.getRateLabel().setText(String.format("Valoración media: %f/5", pro.getValoracionMedia()));
		this.getDescriptionLabel().setText(pro.getDescripcion());
		this.getPriceLAbel().setText(String.format("%f €", oferta.getPrecio()));
		this.getVaadinTextArea().setValue(pro.getDetalles() == null ? "" : pro.getDetalles());
		
		this.fillImgs(pro);
	}
	
	public Producto_Carrito GetProductocarritoOferta() {		
		return new Producto_Carrito(oferta.getProducto(), oferta.getPrecio());
	}
}