package tiendaVirtual.interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

// import basededatos.iCibernauta_Registrado;

public class Cibernauta_Registrado extends Cibernauta {
	// public iCibernauta_Registrado _iCibernauta_Registrado;
	public Cabecera_Registrado _cabecera;
	
	public Cibernauta_Registrado() {
		VerticalLayout layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		_ofertasPopulares = new Ofertas_Populares();
		_productosMasVendidos = new Productos_mas_vendidos();
		_cabecera = new Cabecera_Registrado();
		
		layout.add(_cabecera);
		layout.add(_ofertasPopulares);
		layout.add(_productosMasVendidos);
		
		// TODO: Mirar qué clases son las que deberíamos tener aquí.
		
		/**************************************************************************/
		/********* Datos y botones de la vista productos mas vendidos *************/
		/**************************************************************************/
		for (Lista_de_Productos ldp: _productosMasVendidos._listaProductos)
		{
			VerticalLayout vl = _productosMasVendidos.getVaadinVerticalLayout().as(VerticalLayout.class);
			vl.add(ldp);
			for (Producto_Ciber pc: ldp._producto)
			{
				pc.getMoreInfoBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						layout.removeAll();
						layout.add(_cabecera);
						
						layout.add(pc._detalleProducto);
						
						pc._detalleProducto.getDeleteBtn().setVisible(false);
						pc._detalleProducto.getAddOfferBtn().setVisible(false);
						pc._detalleProducto.getUpdateBtn().setVisible(false);
						
						// TODO: Falta el boton de añadir a carrito.
						
						pc._detalleProducto.getViewComentsBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
							@Override
							public void onComponentEvent(ClickEvent<Button> event) {
								layout.removeAll();
								layout.add(_cabecera);
								
								// TODO: Hacer mejor lo de los comentarios.
								layout.add(pc._detalleProducto._verComentarios);
								
								// TODO: Funcionalidad de añadir a carrito.
								pc._detalleProducto._verComentarios.getAddCarritoBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
									@Override
									public void onComponentEvent(ClickEvent<Button> event) {
										
									}
								});
								
								pc._detalleProducto._verComentarios.getBackProductBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
									@Override
									public void onComponentEvent(ClickEvent<Button> event) {
										layout.removeAll();
										layout.add(_cabecera);
										layout.add(pc._detalleProducto);
									}
								});
							}
						});
						
						// Añadir a carrito.
						pc._detalleProducto.getAnadirACarritoBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
							@Override
							public void onComponentEvent(ClickEvent<Button> event) {
								System.out.println("ENTRO ");
								_cabecera._carrito.AddProductoCarrito(pc._detalleProducto.GetProductocarrito());
							}
						});
					}
				});
				
				HorizontalLayout hl = ldp.getVaadinHorizontalLayout();
				hl.add(pc);
			}
		}
	}
}