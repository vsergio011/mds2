package basededatos;

import basededatos.BDPrincipal;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import appventawebbd.AppventawebPersistentManager;
import appventawebbd.Item;
import appventawebbd.ItemCriteria;
import appventawebbd.ItemDAO;
import appventawebbd.Producto;
import appventawebbd.ProductoDAO;

public class BD_Items {
	public BDPrincipal _bd_prin_items;
	public Vector<Item> _contiene_items = new Vector<Item>();

	public Item[] getItemsPedido(int aIdPedido) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Item[] items = {};
		try {
			ItemCriteria criteria = new ItemCriteria();
			criteria.pedidoId.eq(aIdPedido);
			
			items = ItemDAO.listItemByCriteria(criteria);

			t.commit();
		} catch (Exception e) {
			System.out.println(">>>>>>>>ERROR EN BD: " + e.getMessage());
			t.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
		
		return items;
	}
}