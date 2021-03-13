package tiendaVirtual.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCibernauta;

// import basededatos.iCibernauta;

public class Cibernauta extends VistaCibernauta{
	// public iCibernauta _iCibernauta;
	public Productos_mas_vendidos _productosMasVendidos;
	public Ofertas_Populares _ofertasPopulares;
	public Cabecera_Pagina cabecera = new Cabecera_Pagina();
	
	public Cibernauta() {
		Ofertas_Populares ofp = new Ofertas_Populares();
		Cabecera_Pagina vao = new Cabecera_Pagina();
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.add(vao);
		vl.add(ofp);
		
		
	}
}