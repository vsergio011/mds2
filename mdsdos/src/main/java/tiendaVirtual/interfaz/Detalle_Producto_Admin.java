package tiendaVirtual.interfaz;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;

public class Detalle_Producto_Admin extends Detalle_Producto {
	private Object _modificarB;
	private Object _deleteOfertasB;
	private Object _addOfertasB;
	public Modificar_Producto _modificar;
	public Agregar_Oferta _agregarOferta;
	public Quitar_Oferta _quitarOferta;
	
	public Detalle_Producto_Admin(appventawebbd.Producto producto) {
		_modificar = new Modificar_Producto(producto);
		_agregarOferta = new Agregar_Oferta(producto);
		_quitarOferta = new Quitar_Oferta();
		_comentarios = new Ver_comentarios(producto);
		
		this.fillImgs(producto);
	}
	
	public Detalle_Producto_Admin(appventawebbd.Oferta producto) {
		_modificar = new Modificar_Producto(producto.getProducto());
		this.getAddOfferBtn().setVisible(false);
		_quitarOferta = new Quitar_Oferta(producto);
		_comentarios = new Ver_comentarios(producto.getProducto());
		
		
		appventawebbd.Producto pro = producto.getProducto();
		this.getImg().setSrc(pro.getFotos());
		this.getRateLabel().setText(String.format("Valoración media: %f/5", pro.getValoracionMedia()));
		this.getDescriptionLabel().setText(pro.getDescripcion());
		
		this.getPriceLAbel().setText(String.format("%f € (OFERTA)", producto.getPrecio()));
		
		this.getVaadinTextArea().setValue(pro.getDetalles() == null ? "" : pro.getDetalles());
		
		this.fillImgs(producto.getProducto());
	}
	
	public void BorrarProducto(appventawebbd.Producto producto) {
		iAdministrador bd = new BDPrincipal();
		bd.borrarProducto(producto);
	}
}