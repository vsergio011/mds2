package bds;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import Diagrama_BD.AppventawebPersistentManager;
import Diagrama_BD.Categoria;

public class BD_Categoria {
	public BDPrincipal _bd_prin_cat;
	public Vector<Categoria> _contiene_categorias = new Vector<Categoria>();

	public Categoria[] listCategorias() throws PersistentException {
		Diagrama_BD.Categoria cat = new Diagrama_BD.Categoria();
		Categoria lCategorias[] = null;
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		try {
			lCategorias = cat.listCategoriaByQuery(null, null);
			t.commit();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			t.rollback();
			
		}
		return lCategorias;
	}

	public void addCategoria(Categoria aCategoria) {
		throw new UnsupportedOperationException();
	}
}