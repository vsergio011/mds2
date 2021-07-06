package tiendaVirtual.interfaz;

import java.util.Vector;
// import interfaz.Producto_Admin;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import appventawebbd.Oferta;
import basededatos.BDPrincipal;
import basededatos.iCibernauta;

public class Lista_Ofertas extends Ofertas_Populares {
	public Administrador _administrador;
	public Vector<Producto_Admin> _producto = new Vector<Producto_Admin>();
	
	public Lista_Ofertas() {
		super(-1);
		
		fillOfertasPopulares();
	}
	
	public void fillOfertasPopulares() {
		hl = this.getVaadinHorizontalLayout().as(HorizontalLayout.class);
		hl.removeAll();
		_producto.clear();
		
		iCibernauta ciber = new BDPrincipal();
		for(Oferta offer : ciber.getOfertasPopulares()) {
			Producto_Admin p= new Producto_Admin(offer);

			p.getImgProducto().setSrc(offer.getProducto().getFotos());
			p.getImgProducto().setHeight("150px");
			p.getImgProducto().setWidth("150px");

			p.getMoreInfoBtn().setVisible(true);
			p.getProductLbl().setVisible(true);
			p.getAddCarritoBtn().setVisible(false);
			p.getAddOffertaBtn().setVisible(false);
			p.getQuitarOfertaBtn().setVisible(true);
			p.getLabel().setVisible(true);
			p.getLabel().setText(offer.getPrecio() + "€");
			
			hl.add(p);
			
			_producto.add(p);
		}
	}
	
	public void ShowLess() {
		for (Producto_Admin p : _producto) {
			p.getMoreInfoBtn().setVisible(false);
			p.getQuitarOfertaBtn().setVisible(false);
		}
	}
}