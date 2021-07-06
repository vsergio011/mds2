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
import appventawebbd.UsuarioCriteria;
import appventawebbd.UsuarioDAO;

public class BD_Administrador {
	public BDPrincipal _bd_prin_admin;
	public Vector<Administrador> _contiene_administradores = new Vector<Administrador>();

	public Usuario[] listEmpleados() throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Usuario[] empleados = {};
		try {
			UsuarioCriteria criteria = new UsuarioCriteria();
			criteria.operativo.eq(true);
			
			empleados = UsuarioDAO.listUsuarioByCriteria(criteria);
			t.commit();
		} catch (Exception e) {
			Helpers.Errors.LogBDError(e);
			t.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
		
		return empleados;
	}
}