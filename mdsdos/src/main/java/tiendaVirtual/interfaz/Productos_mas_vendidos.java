package tiendaVirtual.interfaz;

import java.util.List;
import java.util.Vector;

import org.orm.*;


import appventawebbd.AppventawebPersistentManager;
import appventawebbd.Categoria;
import appventawebbd.CategoriaDAO;
import vistas.VistaProductosmasvendidos;

public class Productos_mas_vendidos extends VistaProductosmasvendidos {
	public Cibernauta _cibernauta;
	public Vector<Lista_de_Productos> _listaProductos = new Vector<Lista_de_Productos>();
	
	public Productos_mas_vendidos() {
		// VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		// TODO: Creo que esto hay que hacerlo de otra forma.
		// TODO: Rellenar con datos de verdad.
		/* for(int i = 0 ; i<3; i++) {
			Lista_de_Productos ldp = new Lista_de_Productos();
			ldp.getLabel().setText("Category "+(i+1));
			vl.add(ldp);
			
			HorizontalLayout hl = ldp.getVaadinHorizontalLayout();
			for(int j = 0; j<3; j++) {
				Producto p= new Producto();
				hl.add(p);
			}
		}*/
		
		System.out.println("LLOLL");
		/*iCibernauta ciber = new BDPrincipal();
		List<Categoria> cat = null;
		try {
			cat = ciber.listCategorias();
		} catch (Exception e) {
			System.out.println("Err : " + e.toString());
		}
		for (Categoria categoria : cat) {
			System.out.println("cat : " + categoria.toString());
		}*/
		PersistentTransaction t2;
		try {
			t2 = AppventawebPersistentManager.instance().getSession().beginTransaction();
			List<Categoria> categorias = null;
			try {
				System.out.println("OLE TU11222221: ");
				categorias = CategoriaDAO.queryCategoria(null, null);
			} catch (Exception e) {
				t2.rollback();
			}
			System.out.println("OLE TU111: ");
			t2.commit();
			
			System.out.println("OLE TU: " + categorias.size());
			for (Categoria c1 :categorias) {
				System.out.println(c1.getNombre());
			}
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		for(int i = 0 ; i<3; i++) {
			Lista_de_Productos ldp = new Lista_de_Productos();
			ldp.getLabel().setText("Category "+(i+1));
			_listaProductos.add(ldp);
		}
	}
}