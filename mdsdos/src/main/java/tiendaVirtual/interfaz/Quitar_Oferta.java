package tiendaVirtual.interfaz;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaOfertaspopulares;
import vistas.VistaQuitaroferta;
import vistas.VistaQuitarproductooferta;

public class Quitar_Oferta extends VistaQuitarproductooferta {
	private Object _tituloL;
	private Object _idL;
	private Object _precioOriginalL;
	private Object _precioOriginalTF;
	private Object _precioOfertaL;
	private Object _precioOfertaTF;
	private Object _cancelarB;
	private Object _aceptarB;
	public Producto_Admin _producto;
	public Detalle_Producto_Admin _detalle;
	
	public Quitar_Oferta() {}
	
	private appventawebbd.Oferta oferta = null;
	public Quitar_Oferta(appventawebbd.Oferta oferta) {
		if (oferta == null) {
			return;
		}
		this.oferta = oferta;
		
		this.getIdProductoLbl().setText("ID; " + oferta.getProducto().getId());
		this.getPrecioOriginalInput().setValue(oferta.getProducto().getPrecio() + " €");
		this.getPrecioOriginalInput().setEnabled(false);
		this.getPrecioFinalInput().setValue(oferta.getPrecio() + " €");
		this.getFechaFinLbl().setValue(oferta.getFechaFin());
	}
	
	public void QuitarOferta() {
		iAdministrador admin = new BDPrincipal();
		admin.quitarProductoOferta(oferta.getId());
	}
}