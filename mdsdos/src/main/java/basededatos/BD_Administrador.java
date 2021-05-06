package basededatos;

import basededatos.BDPrincipal;
import java.util.Vector;
import appventawebbd.Administrador;
import appventawebbd.Empleado;

public class BD_Administrador {
	public BDPrincipal _bd_prin_admin;
	public Vector<Administrador> _contiene_administradores = new Vector<Administrador>();

	public Empleado[] listEmpleados() {
		throw new UnsupportedOperationException();
	}
}