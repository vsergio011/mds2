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
	VerticalLayout layout;
	
	public Cibernauta_Registrado(int idCiber) {
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		_ofertasPopulares = new Ofertas_Populares();
		_productosMasVendidos = new Productos_mas_vendidos();
		_cabecera = new Cabecera_Registrado(idCiber);
		
		layout.add(_cabecera);
		layout.add(_ofertasPopulares);
		layout.add(_productosMasVendidos);
		
		// TODO: Mirar qué clases son las que deberíamos tener aquí.		
		_cabecera.getPerfilBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(_cabecera._perfil);
			}
		});		
		_cabecera._perfil.getCambiarPasswordBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(_cabecera._perfil._cambiarContrasena);
			}
		});
		_cabecera._perfil._cambiarContrasena.getSendBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(_cabecera._perfil._cambiarContrasena._nuevaContrasena);
			}
		});
		_cabecera._perfil.getContactoBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(_cabecera._perfil._mensajeria);
			}
		});
		_cabecera._perfil._cambiarContrasena._nuevaContrasena.getContinueBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(_cabecera._perfil);
			}
		});
		_cabecera._perfil._cambiarContrasena._nuevaContrasena.getCancelBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(_cabecera._perfil);
			}
		});
		_cabecera._perfil.getCambiarImgBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO: Implementar selector de imagen de alguna manera. Con url string.
			}
		});
		_cabecera._perfil.getModificarDatosBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				_cabecera._perfil._modificar.showLess();
				layout.add(_cabecera._perfil._modificar);
			}
		});
		_cabecera._perfil._modificar.getAceptarCambiosBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				layout.add(_cabecera._perfil);
				
				// TODO: llamar para actualizar los datos del usuario.
			}
		});
		_cabecera._perfil._mensajeria.getVerMensajeBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				appventawebbd.Mensaje msg = _cabecera._perfil._mensajeria.GetSelected();
				System.out.println("MSNAEJ NUILL? " + msg);
				_cabecera._perfil._mensajeria._nueva_Notificacion.fillNotificacion(msg);
				layout.add(_cabecera._perfil._mensajeria._nueva_Notificacion);
			}
		});
		_cabecera.getOfferBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				
				appventawebbd.Categoria c = _cabecera.GetSelectedCategory();
				if (c != null) {
					_productosMasVendidos = new Productos_mas_vendidos(c);
				}else {
					_productosMasVendidos = new Productos_mas_vendidos();
				}
				layout.add(_cabecera);
				layout.add(_ofertasPopulares);
				layout.add(_productosMasVendidos);
				fillCategories();
			}
		});
		_cabecera.getLimpiarBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				_productosMasVendidos = new Productos_mas_vendidos();
				layout.add(_cabecera);
				layout.add(_ofertasPopulares);
				layout.add(_productosMasVendidos);
				fillCategories();
			}
		});
		
		/**************************************************************************/
		/********* Datos y botones de la vista productos mas vendidos *************/
		/**************************************************************************/
		fillCategories();
	}
	
	private void fillCategories() {
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