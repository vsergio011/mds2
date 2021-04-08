package tiendaVirtual.interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

// import basededatos.iCibernauta_no_Registrado;

public class Cibernauta_no_Registrado extends Cibernauta {
	// public iCibernauta_no_Registrado _iCibernauta_no_Registrado;
	public Cabecera_Cibernauta _cabecera;
	
	public Cibernauta_no_Registrado() {
		VerticalLayout layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		_ofertasPopulares = new Ofertas_Populares();
		_productosMasVendidos = new Productos_mas_vendidos();
		_cabecera = new Cabecera_Cibernauta();
		
		layout.add(_cabecera);
		layout.add(_ofertasPopulares);
		layout.add(_productosMasVendidos);
		
		// TODO: Que pasa si añadimos productos al carrito siendo usuario no registrado???
		// TODO: Como guardamos esos productos en la BD??????
		
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
					}
				});
				
				HorizontalLayout hl = ldp.getVaadinHorizontalLayout();
				hl.add(pc);
			}
		}
		
		/**************************************************************************/
		/************************ Botones de la cabecera **************************/
		/**************************************************************************/
		_cabecera.getBtnLogin().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(_cabecera._login);
			}
		});
		_cabecera.getBtnCarrito().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(_cabecera._carrito);
			}
		});
		
		/**************************************************************************/
		/********************* Botones de la vista de login ***********************/
		/**************************************************************************/
		_cabecera._login.getResetPasswordBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.remove(_cabecera._login);
				layout.add(_cabecera._login._recuperarContrasena);
			}
		});
		_cabecera._login.getRegisterBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.remove(_cabecera._login);
				layout.add(_cabecera._login._registro);
			}
		});
		_cabecera._login.getLoginBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO: ¿A donde debería llevar este botón?
			}
		});
		
		/**************************************************************************/
		/******************* Botones de la vista de registro **********************/
		/**************************************************************************/
		_cabecera._login._registro.getCancelBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(_cabecera._login);
			}
		});
		_cabecera._login._registro.getCreateAccountBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(_cabecera._login);
				
				// TODO: Descomentar cuando teng funcionalidad el método.
				// _cabecera._login._registro.Validar_contrasena();
			}
		});
		
		/**************************************************************************/
		/************** Botones de la vista de recuperar password *****************/
		/**************************************************************************/
		_cabecera._login._recuperarContrasena.getSendBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(_cabecera._login._recuperarContrasena._nuevaContrasena);
				
				// TODO: Descomentar cuando teng funcionalidad el método.
				// _cabecera._login._recuperarContrasena.Enviar_Link();
			}
		});
		_cabecera._login._recuperarContrasena._nuevaContrasena.getContinueBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(_cabecera._login);
				
				// TODO: Descomentar cuando teng funcionalidad el método.
				//_cabecera._login._recuperarContrasena._nuevaContrasena.Validar_contrasena();
			}
		});
		_cabecera._login._recuperarContrasena._nuevaContrasena.getCancelBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(_cabecera._login);
			}
		});
		
		/**************************************************************************/
		/********************* Botones de la vista carrito ************************/
		/**************************************************************************/
		_cabecera._carrito.getRegisterBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(_cabecera._login._registro);
				
				// TODO: La vista de carrito falta añadirle la lista de productos.
			}
		});
	}
}