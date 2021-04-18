package tiendaVirtual.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaProductosmasvendidos;
// import interfaz.Lista_de_Productos;

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
		
		for(int i = 0 ; i<3; i++) {
			Lista_de_Productos ldp = new Lista_de_Productos();
			ldp.getLabel().setText("Category "+(i+1));
			_listaProductos.add(ldp);
		}
	}
}