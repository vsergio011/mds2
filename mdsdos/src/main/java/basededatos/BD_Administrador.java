package basededatos;

import basededatos.BDPrincipal;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import appventawebbd.Administrador;
import appventawebbd.AdministradorDAO;
import appventawebbd.AppventawebPersistentManager;
import appventawebbd.Empleado;
import appventawebbd.EmpleadoDAO;
import appventawebbd.Producto;
import appventawebbd.ProductoDAO;
import appventawebbd.Usuario;

public class BD_Administrador {
	public BDPrincipal _bd_prin_admin;
	public Vector<Administrador> _contiene_administradores = new Vector<Administrador>();

	public List<Empleado> listEmpleados() throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		List<Empleado> empleados = null;
		try {
			empleados = EmpleadoDAO.queryEmpleado(null, null);
			t.commit();
		} catch (Exception e) {
			System.out.println(">>>>>>>>ERROR EN BD: " + e.getMessage());
			t.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
		
		return empleados;
	}
}