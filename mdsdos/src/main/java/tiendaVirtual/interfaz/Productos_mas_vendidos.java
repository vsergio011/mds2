package tiendaVirtual.interfaz;

import java.util.List;
import java.util.Vector;

import org.orm.*;


import appventawebbd.AppventawebPersistentManager;
import appventawebbd.Categoria;
import appventawebbd.CategoriaDAO;
import basededatos.BDPrincipal;
import basededatos.iCibernauta;
import vistas.VistaProductosmasvendidos;

public class Productos_mas_vendidos extends VistaProductosmasvendidos {
	public Cibernauta _cibernauta;
	public Vector<Lista_de_Productos> _listaProductos = new Vector<Lista_de_Productos>();
	
	public Productos_mas_vendidos() {
		fillCategorias(-1);
	}
	
	public Productos_mas_vendidos(appventawebbd.Categoria cat) {
		fillCategorias(cat.getId());
	}
	
	private void fillCategorias(int id) {
		_listaProductos = new Vector<Lista_de_Productos>();
		iCibernauta ciber = new BDPrincipal();
		for(Categoria cat : ciber.listCategorias()) {
			if (id != -1 && cat.getId() != id) {
				System.out.println("SAME ID : " + id);
				continue;
			}
			Lista_de_Productos ldp = new Lista_de_Productos(cat);
			ldp.getTitle().setText(cat.getNombre());
			_listaProductos.add(ldp);
		}
	}
}