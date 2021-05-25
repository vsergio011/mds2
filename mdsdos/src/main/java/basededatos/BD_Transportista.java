package basededatos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import appventawebbd.AppventawebPersistentManager;
import appventawebbd.Empleado;
import appventawebbd.Encargado;
import appventawebbd.EncargadoDAO;
import appventawebbd.Transportista;
import appventawebbd.TransportistaDAO;
import appventawebbd.Usuario;

public class BD_Transportista {
	public BDPrincipal _bd_prin_trans;
	public Vector<Transportista> _contiene_transportistas = new Vector<Transportista>();

	public Empleado[] listEmpleados() {
		throw new UnsupportedOperationException();
	}
}