package tiendaVirtual.interfaz;

import vistas.VistaEmpleado;

public class Perfil_empleado extends Modificar_general  {
	// private event _transferir_administrador;
	private Object _dniL;
	private Object _dniTF;
	private Object _numeroSsL;
	private Object _numeroSsTF;
	public Empleado _empleado;
	public Poner_nueva_contrasena _nuevaContrasena;
		
	public Perfil_empleado(appventawebbd.Usuario ciber) {
		super(ciber);
		_nuevaContrasena = new Poner_nueva_contrasena();
		
		if (ciber == null) {
			return;
		}
		this.fillData(ciber);
	}

	public void Transferir_administrador() {
		throw new UnsupportedOperationException();
	}
}