package basededatos;

import basededatos.BDPrincipal;
import java.util.Vector;

import appventawebbd.Empleado;
import appventawebbd.Encargado;

public class BD_Encargado {
	public BDPrincipal _bd_prin_enca;
	public Vector<Encargado> _contiene_encargados = new Vector<Encargado>();

	public Empleado[] listEmpleados() {
		throw new UnsupportedOperationException();
	}
}