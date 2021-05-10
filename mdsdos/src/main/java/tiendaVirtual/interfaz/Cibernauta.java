package tiendaVirtual.interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCibernauta;

// import basededatos.iCibernauta;

public class Cibernauta extends VistaCibernauta{
	// public iCibernauta _iCibernauta;
	public Productos_mas_vendidos _productosMasVendidos;
	public Ofertas_Populares _ofertasPopulares;
	public Cabecera_Pagina cabecera;	
	
	public Cibernauta() {
		
	}
}