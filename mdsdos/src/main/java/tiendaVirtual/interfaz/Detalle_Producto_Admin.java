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

	public void Esta_en_oferta() {
		throw new UnsupportedOperationException();
	}
	
	public Detalle_Producto_Admin(appventawebbd.Producto producto) {
		_modificar = new Modificar_Producto(producto);
		
		iAdministrador admin = new BDPrincipal();
		appventawebbd.Oferta oferta = admin.estaEnOferta(producto.getId());
		this.getDeleteBtn().setVisible(oferta != null);
		
		if (oferta != null) {
			_quitarOferta = new Quitar_Oferta(oferta);
		} else {
			_quitarOferta = new Quitar_Oferta();
		}
	}
	
}