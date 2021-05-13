package tiendaVirtual.interfaz;

import vistas.VistaEmpleado;

public class Empleado extends VistaEmpleado {
	private Object _nombreL;
	public Empleados _empleados;
	public Perfil_empleado _perfilEmpleado;
	public Nombre _nombre;
	
	public Empleado() {
		
	}
	
	public Empleado(String displayName) {
		this.getNombreEmpleadoLbl().setText(displayName);
	}
}