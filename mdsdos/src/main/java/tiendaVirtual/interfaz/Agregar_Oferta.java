package tiendaVirtual.interfaz;

import appventawebbd.Oferta;
import basededatos.BDPrincipal;
import basededatos.iAdministrador;

public class Agregar_Oferta extends Quitar_Oferta {
	private Object _fechaFinL;
	private Object _fechaFinTF;
	public Producto_Admin _producto;
	public Detalle_Producto_Admin _detalle;
	
	public Agregar_Oferta(appventawebbd.Producto producto) {
		super(producto);
		
		this.getIdProductoLbl().setText("ID: " + producto.getId());
		this.getPrecioOriginalInput().setValue(producto.getPrecio() + "");
		this.getPrecioOriginalInput().setEnabled(false);
	}
	
	public void AgregarOferta(appventawebbd.Producto producto) {
		iAdministrador admin = new BDPrincipal();
		appventawebbd.Oferta off = new Oferta();
		off.setFechaFin(this.getFechaFinLbl().getValue());
		off.setPrecio(Double.parseDouble(this.getPrecioFinalInput().getValue()));
		
		admin.anadirAOferta(producto.getId(), off);
	}
}