package tiendaVirtual.interfaz;

import basededatos.BDPrincipal;

public class Producto_Carrito extends Producto_Pedido {
	// private event _quitar_de_Lista;
	// private event _cantidad;
	public Carrito_de_la_compra _productos;
	
	public double precioOferta = 0;

	appventawebbd.Item item = null;
	
	public Producto_Carrito(appventawebbd.Producto p, double precio) {
		this.precioOferta = precio;
		
		this.getVaadinComboBox().setItems("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
		
		item = new appventawebbd.Item();		
		item.setORM_Producto(p);
		
		int cantidad = this.getVaadinComboBox().getValue() == null ? 1 :Integer.parseInt(this.getVaadinComboBox().getValue());
		item.setCantidad(cantidad);
		
		this.getPrecioUnidadLbl().setText("Precio unidad: " + p.getPrecio() + " €");
		this.getPrecioEurosLbl().setText("Precio total: " + p.getPrecio() * cantidad + " €");
		
		BDPrincipal bd = new BDPrincipal();
		
		appventawebbd.Oferta oferta = bd.estaEnOferta(p.getId());
		if (oferta != null) {
			this.precioOferta = oferta.getPrecio();
		}
		if (this.precioOferta > 0) {
			this.getPrecioUnidadLbl().setText("Precio unidad (antes): " + p.getPrecio() + " €" + " - Ahora: " + this.precioOferta + "€");
			this.getPrecioEurosLbl().setText("Precio total: " + this.precioOferta * cantidad + " €");
		}
		
		this.getComEntarBtn().setVisible(false);
		this.getDescripProducLbl().setText(p.getDescripcion());
		this.getNombreProductoLbl().setText(p.getNombre());
		this.getImgProducto().setSrc(p.getFotos());
		this.getValoracionLbl().setText("Valoración media: " +p.getValoracionMedia() + "/5");
		this.getImgProducto().setHeight("200px");
		
		this.getUnidadesLbl().setText("Cantidad: " + cantidad);
		this.getVaadinComboBox().addValueChangeListener(e -> {
			int cant = Integer.parseInt(this.getVaadinComboBox().getValue());
			item.setCantidad(cant);
			this.getUnidadesLbl().setText("Cantidad: " + cant);
			this.getPrecioEurosLbl().setText("Precio total: " + p.getPrecio() * cant + " €");
		});		
	}
	
	public appventawebbd.Item GetItem() {
		return item;
	}
}