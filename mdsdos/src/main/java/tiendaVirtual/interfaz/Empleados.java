package tiendaVirtual.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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
	
	public Empleados() {
		VerticalLayout vl = this.getEmpleadosLayout().as(VerticalLayout.class);
		for(int i = 0; i < 5; i++) {
		}
		
		
		
	}
}