package basededatos;

import basededatos.BDPrincipal;
import java.util.Vector;

import appventawebbd.Empleado;
import appventawebbd.Transportista;

public class BD_Transportista {
	public BDPrincipal _bd_prin_trans;
	public Vector<Transportista> _contiene_transportistas = new Vector<Transportista>();

	public Empleado[] listEmpleados() {
		throw new UnsupportedOperationException();
	}
}