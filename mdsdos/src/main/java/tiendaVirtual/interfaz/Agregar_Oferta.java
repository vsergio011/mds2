package tiendaVirtual.interfaz;

import com.vaadin.flow.component.UI;

import Helpers.Notifications;
import Helpers.Notifications.NotificationType;
import appventawebbd.Oferta;
import basededatos.BDPrincipal;
import basededatos.iAdministrador;

public class Agregar_Oferta extends Quitar_Oferta {
	private Object _fechaFinL;
	private Object _fechaFinTF;
	public Producto_Admin _producto;
	public Detalle_Producto_Admin _detalle;
	
	public Agregar_Oferta(appventawebbd.Producto producto) {
		this.getIdProductoLbl().setText("ID: " + producto.getId());
		this.getPrecioOriginalInput().setValue(producto.getPrecio() + "");
		this.getPrecioOriginalInput().setEnabled(false);
	}
	
	public void AgregarOferta(appventawebbd.Producto producto) {
		BDPrincipal admin = new BDPrincipal();
		
		if (admin.estaEnOferta(producto.getId()) != null) {
			Notifications.ShowAlert("Este producto pertenece ya a una oferta.", NotificationType.ERROR);
			return;
		}
		
		appventawebbd.Oferta off = new Oferta();
		off.setFechaFin(this.getFechaFinLbl().getValue());
		off.setPrecio(Double.parseDouble(this.getPrecioFinalInput().getValue()));
		
		admin.anadirAOferta(producto.getId(), off);
		
		Notifications.ShowAlert("Producto agregado a ofertas correctamente.", NotificationType.INFORMATION);
	}
}