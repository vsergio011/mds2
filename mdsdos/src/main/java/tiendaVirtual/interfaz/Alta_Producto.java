package tiendaVirtual.interfaz;

import java.util.ArrayList;
import java.util.List;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import basededatos.iCibernauta;
import vistas.VistaAltaproducto;

public class Alta_Producto extends VistaAltaproducto{
/*	private event _agregar_Imagen;
	private event _cambiar_Imagen;
	private event _borrar_Imagen;*/
	private Object _cancelarB;
	private Object _aceptarB;
	private Object _altaProductoB;
	private Object _tituloL;
	private Object _tituloTF;
	private Object _descripcionL;
	private Object _descripcionTF;
	private Object _caracteristicasL;
	private Object _caracteristicasTF;
	private Object _categoriasCB;
	private Object _precioTF;
	private Object _imagen;
	private java.util.Vector<Object> _miniaturas;
	public Funciones_Admin _funcionesAdmin;
	
	appventawebbd.Categoria selected = null;
	public Alta_Producto() {
		iCibernauta ciber = new BDPrincipal();
		
		List<appventawebbd.Categoria> categorias = ciber.listCategorias();
		List<String> cats = new ArrayList<String>();
		for (appventawebbd.Categoria cat : categorias) {
			cats.add(cat.getNombre());
		}
		this.getProductoCategorias().setItems(cats);
		
		this.getProductoCategorias().addValueChangeListener(event -> {
			int index = cats.indexOf(event.getValue());
			selected = categorias.get(index);
		});
	}

	public void Agregar_Imagen() {
		throw new UnsupportedOperationException();
	}

	public void Cambiar_Imagen() {
		throw new UnsupportedOperationException();
	}

	public void Borrar_Imagen() {
		throw new UnsupportedOperationException();
	}
	
	public void SaveProducto() {
		appventawebbd.Producto pro = new appventawebbd.Producto();
		pro.setCategoria(this.selected);
		
		pro.setDescripcion(this.getDescripcionInput().getValue());
		pro.setNombre(this.getInputTitulo().getValue());
		pro.setPrecio(Integer.parseInt(this.getProductoPrecio().getValue()));
		pro.setDetalles(this.getVaadinTextArea().getValue());
		pro.setFotos(this.getImg().getSrc());
		
		iAdministrador admin = new BDPrincipal();
		admin.altaProducto(pro);		
	}
}