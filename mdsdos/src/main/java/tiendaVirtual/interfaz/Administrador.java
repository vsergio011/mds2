package tiendaVirtual.interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCibernauta;
import vistas.VistaPerfil;

//import basededatos.iAdministrador;

public class Administrador extends VistaCibernauta {
	// public iAdministrador _iAdministrador;
	public Lista_Ofertas _ofertas;
	public Lista_de_PmV _listaPmV;
	public Cabecera_Administrador _cabecera;
	VerticalLayout layout;
	
	public Administrador(appventawebbd.Administrador admin) {
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		_ofertas = new Lista_Ofertas();
		_listaPmV = new Lista_de_PmV();
		_cabecera = new Cabecera_Administrador();
		
		layout.add(_cabecera);
		layout.add(_ofertas);
		layout.add(_listaPmV);
		
		// Vista de admin
		_cabecera.getAdminBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(_cabecera._funcionesAdmin);
			}
		});
		_cabecera.getOfferBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(_ofertas);
				layout.add(_listaPmV);
			}
		});
		
		_cabecera.getPerfilBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(new Perfil(admin));
			}
		});
		
		// Botones dentro de la vista de admin.
		_cabecera._funcionesAdmin.getAddCategoriaBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(_cabecera._funcionesAdmin._altaCategoria);
				
				_cabecera._funcionesAdmin._altaCategoria.SaveCategoria();
			}
		});
		_cabecera._funcionesAdmin.getAddProductoBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(_cabecera._funcionesAdmin._altaProducto);
			}
		});
		_cabecera._funcionesAdmin._altaProducto.getAddBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(_cabecera._funcionesAdmin);
				
				_cabecera._funcionesAdmin._altaProducto.SaveProducto();
			}
		});
		_cabecera._funcionesAdmin._altaProducto.getCancelBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(_cabecera._funcionesAdmin);
			}
		});
		_cabecera._funcionesAdmin.getModificarEmpleadoBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(_cabecera._funcionesAdmin._modificarEmpleado._empleados);
			}
		});
		_cabecera._funcionesAdmin._modificarEmpleado._empleados.getVerEmpleadoBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				appventawebbd.Empleado selected = _cabecera._funcionesAdmin._modificarEmpleado._empleados.GetSelectedEmpleado();
				_cabecera._funcionesAdmin._modificarEmpleado._empleados.clearView();
				Perfil_empleado _perfilEmpleado = new Perfil_empleado(selected);
				
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(_perfilEmpleado);				
			}
		});
		
		// Botones dentro del listado de empleados.	
	}
	
	private void fillCategories() {
		for (Lista_de_Productos ldp: _listaPmV._listaProductos)
		{
			VerticalLayout vl = _listaPmV.getVaadinVerticalLayout().as(VerticalLayout.class);
			vl.add(ldp);
			for (Producto_Ciber pc: ldp._producto)
			{
				pc.getMoreInfoBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						layout.removeAll();
						layout.add(_cabecera);
						
						layout.add(pc._detalleProducto);
						
						pc._detalleProducto.getDeleteBtn().setVisible(false);
						pc._detalleProducto.getAddOfferBtn().setVisible(false);
						pc._detalleProducto.getUpdateBtn().setVisible(false);
						
						pc._detalleProducto.getViewComentsBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
							@Override
							public void onComponentEvent(ClickEvent<Button> event) {
								layout.removeAll();
								layout.add(_cabecera);
								
								// TODO: Hacer mejor lo de los comentarios.
								layout.add(pc._detalleProducto._verComentarios);
								
								// TODO: Funcionalidad de añadir a carrito.
								pc._detalleProducto._verComentarios.getAddCarritoBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
									@Override
									public void onComponentEvent(ClickEvent<Button> event) {
										
									}
								});
								
								pc._detalleProducto._verComentarios.getBackProductBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
									@Override
									public void onComponentEvent(ClickEvent<Button> event) {
										layout.removeAll();
										layout.add(_cabecera);
										layout.add(pc._detalleProducto);
									}
								});
							}
						});
					}
				});
				
				HorizontalLayout hl = ldp.getVaadinHorizontalLayout();
				hl.add(pc);
			}
		}
	}
}