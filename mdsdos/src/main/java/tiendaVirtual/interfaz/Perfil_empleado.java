package tiendaVirtual.interfaz;

import vistas.VistaEmpleado;

public class Perfil_empleado extends VistaEmpleado {
	// private event _transferir_administrador;
	private Object _dniL;
	private Object _dniTF;
	private Object _numeroSsL;
	private Object _numeroSsTF;
	public Empleado _empleado;
	public Poner_nueva_contrasena _nuevaContrasena;
	
	public Perfil_empleado() {}
	
	public Perfil_empleado(appventawebbd.Usuario ciber) {
		this.getMainViewEmp();
		if (ciber == null) {
			return;
		}
		Modificar_Datos _modificarDatos = new Modificar_Datos(ciber);
		this.getMainViewEmp().add(_modificarDatos);
		//this.fillData(ciber);
	}

	public void Transferir_administrador() {
		throw new UnsupportedOperationException();
	}
}