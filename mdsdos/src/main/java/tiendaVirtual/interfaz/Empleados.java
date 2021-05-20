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
		
	private appventawebbd.Empleado selected = null;
	public Empleados() {
		verButtonVisible();
		
		iAdministrador admin = new BDPrincipal();
		
		ArrayList<String> names = new ArrayList<String>();
		java.util.List<appventawebbd.Empleado> empleados = admin.listempleados();
		for (appventawebbd.Empleado value : empleados) {
			names.add(value.getNombre() + " " + value.getApellidos());
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
		
		// TODO: Filtrar.
		this.getVaadinTextField().addValueChangeListener(new ValueChangeListener() {
			@Override
			public void valueChanged(ValueChangeEvent event) {
				System.out.println("CAMBIO   " + event.getValue().toString());
			}
	    });
		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		lb.setHeight("100%");
		lb.setWidth("100%");
		
		vl.add(lb);
		vl.setAlignItems(Alignment.CENTER);
	}
	
	private void verButtonVisible() {
		this.getVerEmpleadoBtn().setVisible(selected != null);
	}
	
	public appventawebbd.Empleado GetSelectedEmpleado() {
		return this.selected;
	}
	
	public void clearView() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.removeAll();
		
	}
}