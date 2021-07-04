package tiendaVirtual.interfaz;

public class Producto_Adquirido extends Producto_Pedido {
	private Object _comentarB;
	private Object _unidadesL;
	private Object _valoracionL;
	public Productos_Adquiridos _productosAdquiridos;
	public Comentar_Producto _comentar;
	
	public Producto_Adquirido(appventawebbd.Item item) {
		_comentar = new Comentar_Producto(item.getProducto());
		
		this.getVaadinComboBox().setVisible(false);
		this.getDeleteBtn().setVisible(false);
		this.getComEntarBtn().setVisible(true);
		
		appventawebbd.Producto p = item.getProducto();
		
		this.getDescripProducLbl().setText(p.getDescripcion());
		this.getNombreProductoLbl().setText(p.getNombre());
		this.getPrecioUnidadLbl().setText("Precio unidad: " + p.getPrecio() + " €");
		this.getPrecioEurosLbl().setText(p.getPrecio() * item.getCantidad() + " €");
		this.getImgProducto().setSrc(p.getFotos());
		this.getValoracionLbl().setText("Valoración media: " +p.getValoracionMedia() + "/5");
		this.getPrecioEurosLbl().setText("Precio total: " + p.getPrecio() * item.getCantidad() + " €");
		this.getImgProducto().setHeight("200px");
		this.getUnidadesLbl().setText("Cantidad:" + item.getCantidad());
	}
}