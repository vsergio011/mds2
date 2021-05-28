package tiendaVirtual.interfaz;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;

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
	}
	
	public void GuardarProducto(appventawebbd.Producto producto) {		
		producto.setCategoria(this.selected);
		producto.setDescripcion(this.getDescripcionInput().getValue());
		producto.setNombre(this.getInputTitulo().getValue());
		producto.setPrecio(Double.parseDouble(this.getProductoPrecio().getValue()));
		producto.setDetalles(this.getVaadinTextArea().getValue());
		producto.setFotos(this.getImg().getSrc());
		
		iAdministrador admin = new BDPrincipal();
		admin.modificarProducto(producto.getId(),producto, imagenesUrl);
	}
	
	public Modificar_Producto(appventawebbd.Producto producto) {
		this.getInputTitulo().setValue(producto.getNombre());
		this.getImg().setSrc(producto.getFotos());
		this.getDescripcionInput().setValue(producto.getDescripcion());
		this.getVaadinTextArea().setValue(producto.getDetalles());
		this.getProductoPrecio().setValue(producto.getPrecio() + "");
		this.getCancelBtn().setVisible(false);
		this.getAddBtn().setText("Guardar");
		
		for (appventawebbd.Foto img : producto.fotosProducto.toArray()) {
			imagenesUrl.add(img.getRuta());
		}
		this.fillImgs();
		
		this.getProductoCategorias().setValue(producto.getCategoria().getNombre());
	}
}