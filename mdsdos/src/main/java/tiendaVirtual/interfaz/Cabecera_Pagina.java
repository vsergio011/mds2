package tiendaVirtual.interfaz;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;

import basededatos.BDPrincipal;
import basededatos.iCibernauta;
import vistas.VistaCabecerapagina;

public class Cabecera_Pagina extends VistaCabecerapagina {
	private Object _logo;
	private Object _ofertasL;
	private Object _ofertasB;
	private Object _buscarTF;
	private Object _categoriasCB;
	public Buscar _buscar;
	public Categorias _categorias;
	public Ofertas _ofertas;
	
	private appventawebbd.Categoria selected = null;
	public Cabecera_Pagina() {
		iCibernauta ciber = new BDPrincipal();
		
		List<appventawebbd.Categoria> categorias = ciber.listCategorias();
		List<String> cats = new ArrayList<String>();
		for (appventawebbd.Categoria cat : categorias) {
			cats.add(cat.getNombre());
		}
		this.getCategoriesCombo().setItems(cats);
		
		this.getCategoriesCombo().addValueChangeListener(event -> {
			int index = cats.indexOf(event.getValue());
			if (index != -1) {
				selected = categorias.get(index);
			}			
		});
	}
	
	public appventawebbd.Categoria GetSelectedCategory() {
		return selected;
	}
}