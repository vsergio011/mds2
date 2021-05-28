package tiendaVirtual.interfaz;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import basededatos.iCibernauta;
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
		
	private appventawebbd.Oferta oferta = null;
	public Quitar_Oferta(appventawebbd.Producto producto) {
		
		if (producto.ofertas.size() == 0) {
			return;
		}
		appventawebbd.Oferta oferta = producto.ofertas.toArray()[0];
		this.oferta = oferta;	
		
		this.getIdProductoLbl().setText("ID; " + oferta.getProducto().getId());
		this.getPrecioOriginalInput().setValue(oferta.getProducto().getPrecio() + "");
		this.getPrecioOriginalInput().setEnabled(false);
		this.getPrecioFinalInput().setValue(oferta.getPrecio() + "");
	}
	
	public void QuitarOferta() {
		iAdministrador admin = new BDPrincipal();
		admin.quitarProductoOferta(oferta.getProducto().getId());
	}
}