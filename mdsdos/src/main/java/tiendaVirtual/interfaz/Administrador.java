package tiendaVirtual.interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCibernauta;

//import basededatos.iAdministrador;

public class Administrador extends VistaCibernauta {
	// public iAdministrador _iAdministrador;
	public Lista_Ofertas _ofertas;
	public Lista_de_PmV _listaPmV;
	public Cabecera_Administrador _cabecera;
	
	public Administrador() {
		VerticalLayout layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
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
		
		// Botones dentro de la vista de admin.
		_cabecera._funcionesAdmin.getAddCategoriaBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(_cabecera._funcionesAdmin._altaCategoria);
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
				System.out.println("EMPLEADO: " + selected.getNombre() + " " + selected.getApellidos() );
				Perfil_empleado _perfilEmpleado = new Perfil_empleado(selected);
				
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(_perfilEmpleado);				
			}
		});
		
		// Botones dentro del listado de empleados.	
	}
}