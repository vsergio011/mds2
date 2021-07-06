package tiendaVirtual.interfaz;

import java.awt.List;
import java.util.ArrayList;
import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.HasValue.ValueChangeEvent;
import com.vaadin.flow.component.HasValue.ValueChangeListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.GeneratedVaadinFormItem;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.listbox.ListBox;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;

import Helpers.Notifications.NotificationType;
import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaListadoempleados;
// import interfaz.Titulo_Empleados;
// import interfaz.Buscar_Empleados;
// import interfaz.Empleado;

public class Empleados extends VistaListadoempleados{
	private Object _titutloL;
	private Object _buscarTF;
	public Modificar_Empleado _modificarEmpleado;
	public Vector<Titulo_Empleados> _list_Titulo_Empleados = new Vector<Titulo_Empleados>();
	public Vector<Buscar_Empleados> _list_Buscar_Empleados = new Vector<Buscar_Empleados>();
	public Vector<Empleado> _empleado = new Vector<Empleado>();
		
	private appventawebbd.Usuario selected = null;
	public Empleados() {
		FillEmpleados();
	}
	
	public void BorrarSeleccionado() {
		if (selected == null) {
			return;
		}
		
		BDPrincipal bd = new BDPrincipal();
		bd.borrarCuenta(selected.getId());
		
		Helpers.Notifications.ShowAlert("Usuario borrado con exito", NotificationType.INFORMATION);
	}
	
	public void FillEmpleados() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.removeAll();
		verButtonVisible();
		
		iAdministrador admin = new BDPrincipal();
		
		ArrayList<String> names = new ArrayList<String>();
		java.util.List<appventawebbd.Usuario> empleados = new ArrayList<appventawebbd.Usuario>();
		
		for (appventawebbd.Usuario usuario :  admin.listempleados()) {
			empleados.add(usuario);
		}
		for (appventawebbd.Usuario value : empleados) {
			String tipoUsuario = "Cibernauta";
			switch (value.getTipo()) {
			case 1:
				tipoUsuario = "Administrador";
				break;
			case 2:
				tipoUsuario = "Encargado de compras";
				break;
			case 3:
				tipoUsuario = "Transportista";
				break;
			}
			
			names.add(value.getId() + ". " + tipoUsuario + " | " + value.getNombre() + " " + value.getApellidos());
		}
		
		ListBox<String> lb = new ListBox<String>();
		lb.setItems(names);
		
		lb.addValueChangeListener(new ValueChangeListener() {
			@Override
			public void valueChanged(ValueChangeEvent event) {
				selected = empleados.get(lb.getItemPosition(event.getValue().toString()));
				verButtonVisible();
			}
	    });
		
		lb.setHeight("100%");
		lb.setWidth("100%");
		
		vl.add(lb);
		vl.setAlignItems(Alignment.CENTER);
	}
	
	private void verButtonVisible() {
		this.getVerEmpleadoBtn().setVisible(selected != null);
	}
	
	public appventawebbd.Usuario GetSelectedEmpleado() {
		return this.selected;
	}
	
	public void clearView() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.removeAll();
	}
}