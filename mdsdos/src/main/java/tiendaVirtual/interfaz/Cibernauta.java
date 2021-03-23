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
	private Login_Cibernauta login;
	
	public Cibernauta() {
		VerticalLayout layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		_ofertasPopulares = new Ofertas_Populares();
		cabecera = new Cabecera_Pagina();
		
		layout.add(cabecera);
		layout.add(_ofertasPopulares);
		
		// TODO: Creo que este login no deberia ir aqui porque si no perdemos la funcionalidad del botón login.
		login = new Login_Cibernauta();
		cabecera.getBtnLogin().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(login._cabecera);
				layout.add(login);
			}
		});
	}
}