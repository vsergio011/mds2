package tiendaVirtual.interfaz;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;

import Helpers.Notifications.NotificationType;
import appventawebbd.Producto;
import basededatos.BDPrincipal;
import basededatos.iAdministrador;

public class Modificar_Producto extends Alta_Producto {
	//private event _borrar_Producto;
	private Object _idProductoL;
	public Detalle_Producto_Admin _detalle;

	public void Borrar_Producto(appventawebbd.Producto producto) {
		iAdministrador admin = new BDPrincipal();
		admin.borrarProducto(producto);
		
		Helpers.Notifications.ShowAlert("Producto borrado con éxito.", NotificationType.INFORMATION);
	}
	
	public void GuardarProducto(appventawebbd.Producto producto) {
		producto.setDescripcion(this.getDescripcionInput().getValue());
		producto.setNombre(this.getInputTitulo().getValue());
		producto.setPrecio(Double.parseDouble(this.getProductoPrecio().getValue()));
		producto.setDetalles(this.getVaadinTextArea().getValue());
		producto.setFotos(this.getImg().getSrc());
		
		iAdministrador admin = new BDPrincipal();
		admin.modificarProducto(producto.getId(),producto, imagenesUrl, this.selected.getId());
		
		fillProducto(producto);
		Helpers.Notifications.ShowAlert("Producto modificado con éxito.", NotificationType.INFORMATION);
	}
	
	public Modificar_Producto(appventawebbd.Producto producto) {
		fillProducto(producto);
	}
	
	public void fillProducto(appventawebbd.Producto producto) {
		this.getInputTitulo().setValue(producto.getNombre());
		this.getImg().setSrc(producto.getFotos());
		this.getDescripcionInput().setValue(producto.getDescripcion());
		this.getVaadinTextArea().setValue(producto.getDetalles());
		this.getProductoPrecio().setValue(producto.getPrecio() + "");
		this.getCancelBtn().setVisible(false);
		this.getAddBtn().setText("Guardar");
		
		BDPrincipal bd = new BDPrincipal();
		for (appventawebbd.Foto img : bd.getFotosProducto(producto.getId())) {
			imagenesUrl.add(img.getRuta());
		}
		this.fillImgs();
		
		this.getProductoCategorias().setValue(producto.getCategoria().getNombre());
	}
}