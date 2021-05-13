package basededatos;

import basededatos.BDPrincipal;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import appventawebbd.AppventawebPersistentManager;
import appventawebbd.Categoria;
import appventawebbd.CategoriaDAO;

public class BD_Categoria {
	public BDPrincipal _bd_prin_cat;
	public Vector<Categoria> _contiene_categorias = new Vector<Categoria>();

	public List<Categoria> listCategorias() throws PersistentException {
		PersistentTransaction t2 = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		List<Categoria> categorias = null;
		try {
			categorias = CategoriaDAO.queryCategoria(null, null);
			t2.commit();
		} catch (Exception e) {
			t2.rollback();
		}
		
		return categorias;
	}

	public void addCategoria(Categoria aCategoria) {
		throw new UnsupportedOperationException();
	}
}