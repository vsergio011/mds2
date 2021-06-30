package basededatos;

import basededatos.BDPrincipal;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import appventawebbd.Administrador;
import appventawebbd.AdministradorDAO;
import appventawebbd.AppventawebPersistentManager;
import appventawebbd.Empleado;
import appventawebbd.Encargado;
import appventawebbd.EncargadoDAO;
import appventawebbd.Usuario;

public class BD_Encargado {
	public BDPrincipal _bd_prin_enca;
	public Vector<Encargado> _contiene_encargados = new Vector<Encargado>();
}