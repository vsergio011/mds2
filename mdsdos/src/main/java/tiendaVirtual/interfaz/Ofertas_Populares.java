package tiendaVirtual.interfaz;

import java.util.Vector;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import appventawebbd.Oferta;
import basededatos.*;
import vistas.VistaOfertaspopulares;

public class Ofertas_Populares extends VistaOfertaspopulares {
	private Object _tituloL;
	public Cibernauta _cibernauta;
	public Vector<Producto_Ciber> _producto = new Vector<Producto_Ciber>();
	public Vector<Cabecera_Ofertas> _list_Cabecera_Ofertas = new Vector<Cabecera_Ofertas>();
	public Ofertas _ofertas;
	public HorizontalLayout hl;
	
	public Ofertas_Populares() {
		// TODO: Creo que hay que tener aquí una vista de listado de productos.
		fillOfertasPopulares();
	}
	
	private void fillOfertasPopulares() {
		hl = this.getVaadinHorizontalLayout().as(HorizontalLayout.class);
		
		iCibernauta ciber = new BDPrincipal();
		System.out.println("FillOfertasPopulares.");
		for(Oferta offer : ciber.getOfertasPopulares()) {
			Producto p= new Producto();

			p.getImgProducto().setSrc(offer.getProducto().getFotos());
			p.getImgProducto().setHeight("150px");
			p.getImgProducto().setWidth("150px");

			p.getMoreInfoBtn().setVisible(false);
			p.getProductLbl().setVisible(false);
			
			hl.add(p);
		}
	}
}