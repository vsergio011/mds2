package tiendaVirtual.interfaz;

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

	public void Borrar_Producto() {
		throw new UnsupportedOperationException();
	}
	
	public void GuardarProducto(appventawebbd.Producto producto) {
		appventawebbd.Producto pro = new appventawebbd.Producto();
		pro.setCategoria(this.selected);
		
		producto.setDescripcion(this.getDescripcionInput().getValue());
		producto.setNombre(this.getInputTitulo().getValue());
		producto.setPrecio(Integer.parseInt(this.getProductoPrecio().getValue()));
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
		
		this.getAddBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				GuardarProducto(producto);
			}
		});
	}
}