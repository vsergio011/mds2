package tiendaVirtual.interfaz;

import java.util.Vector;
// import interfaz.Producto_Ciber;
// import interfaz.Cabecera_Ofertas;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaOfertaspopulares;

public class Ofertas_Populares extends VistaOfertaspopulares{
	private Object _tituloL;
	public Cibernauta _cibernauta;
	public Vector<Producto_Ciber> _producto = new Vector<Producto_Ciber>();
	public Vector<Cabecera_Ofertas> _list_Cabecera_Ofertas = new Vector<Cabecera_Ofertas>();
	public Ofertas _ofertas;
	
	public Ofertas_Populares() {
		HorizontalLayout hl = this.getVaadinHorizontalLayout().as(HorizontalLayout.class);
		
		for(int i =0 ; i<5; i++) {
			Producto p= new Producto();
			hl.add(p);
			
		}
		
	}
}