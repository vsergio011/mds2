package tiendaVirtual.interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import Helpers.Cookies;
import vistas.VistaCibernauta;
import vistas.VistaPerfil;

//import basededatos.iAdministrador;

public class Administrador extends VistaCibernauta {
	// public iAdministrador _iAdministrador;
	public Lista_Ofertas _ofertas;
	public Lista_de_PmV _listaPmV;
	public Cabecera_Administrador _cabecera;
	VerticalLayout layout;
	
	public Administrador(appventawebbd.Administrador admin) {
		layout = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		_ofertas = new Lista_Ofertas();
		_listaPmV = new Lista_de_PmV();
		_cabecera = new Cabecera_Administrador(admin);
		
		layout.add(_cabecera, _ofertas, _listaPmV);
		
		_cabecera.getOffertasButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {				
				layout.removeAll();
				_ofertas.fillOfertasPopulares();
				layout.add(_cabecera, _ofertas);
				
				for (Producto_Admin pc : _ofertas._producto) {
					addFuncionalidadProductoAdmin(pc);				
				}
			}
		});
		_cabecera.getAdminBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, _cabecera._funcionesAdmin);
			}
		});
		_cabecera.getOfferBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				appventawebbd.Categoria c = _cabecera.GetSelectedCategory();
				if (c == null) {
					return;
				}
				_listaPmV = new Lista_de_PmV(c);
				layout.removeAll();
				layout.add(_cabecera, _ofertas, _listaPmV);
				fillCategories();
			}
		});
		_cabecera.getLimpiarBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				_listaPmV = new Lista_de_PmV();
				layout.add(_cabecera, _ofertas, _listaPmV);
				_cabecera.getCategoriesCombo().clear();
				_cabecera.LoadCategories();
				fillCategories();
			}
		});
		_cabecera.getPerfilBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, _cabecera._perfil);
			}
		});
		_cabecera._perfil.getModificarDatosBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, _cabecera._perfil._modificar);
			}
		});
		_cabecera._perfil._modificar.getCambiarPasswordBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, _cabecera._perfil._cambiarContrasena);
			}
		});
		_cabecera._perfil.getDesconectarBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Cookies.ClearCookies();
				UI.getCurrent().getPage().reload();
			}
		});
		_cabecera._perfil._cambiarContrasena.getSendBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, _cabecera._perfil._cambiarContrasena._nuevaContrasena);
			}
		});
		_cabecera._perfil._cambiarContrasena._nuevaContrasena.getContinueBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, _cabecera._perfil._modificar);
			}
		});
		_cabecera._perfil._cambiarContrasena._nuevaContrasena.getCancelBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, _cabecera._perfil._modificar);
			}
		});
		_cabecera._perfil._modificar.getAceptarCambiosBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, _cabecera._perfil);
				
				_cabecera._perfil._modificar.UpdateUsuario(admin.getId(), admin.getTipo());
			}
		});
		
		// Botones dentro de la vista de admin.
		_cabecera._funcionesAdmin.getAddCategoriaBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, _cabecera._funcionesAdmin._altaCategoria);
				
				_cabecera._funcionesAdmin._altaCategoria.SaveCategoria();
			}
		});
		_cabecera._funcionesAdmin._altaCategoria.getAceptarBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();				
				_cabecera._funcionesAdmin._altaCategoria.SaveCategoria();				
				layout.add(_cabecera, _cabecera._funcionesAdmin);
			}
		});
		_cabecera._funcionesAdmin._altaCategoria.getCancelarBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();				
				layout.add(_cabecera, _cabecera._funcionesAdmin);
			}
		});
		_cabecera._funcionesAdmin.getAddProductoBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, _cabecera._funcionesAdmin._altaProducto);
			}
		});
		_cabecera._funcionesAdmin._altaProducto.getAddBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, _cabecera._funcionesAdmin);
				
				_cabecera._funcionesAdmin._altaProducto.SaveProducto();
			}
		});
		_cabecera._funcionesAdmin._altaProducto.getCancelBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, _cabecera._funcionesAdmin);
			}
		});
		_cabecera._funcionesAdmin.getModificarEmpleadoBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				_cabecera._funcionesAdmin._modificarEmpleado._empleados.FillEmpleados();
				layout.add(_cabecera, _cabecera._funcionesAdmin._modificarEmpleado._empleados);
			}
		});
		_cabecera._funcionesAdmin.getContactoBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, _cabecera._funcionesAdmin._mensajeria);
			}
		});		 
		_cabecera._funcionesAdmin._mensajeria.getVerMensajeBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				appventawebbd.Mensaje msg = _cabecera._funcionesAdmin._mensajeria.GetSelected();
				_cabecera._funcionesAdmin._mensajeria._nueva_Notificacion.fillNotificacion(msg);
				layout.add(_cabecera, _cabecera._funcionesAdmin._mensajeria._nueva_Notificacion);
			}
		});
		_cabecera._funcionesAdmin._mensajeria.getNuevoMensajeBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				_cabecera._funcionesAdmin._mensajeria._nueva_Notificacion.clearAll();
				layout.add(_cabecera, _cabecera._funcionesAdmin._mensajeria._nueva_Notificacion);
			}
		});
		_cabecera._funcionesAdmin._mensajeria._nueva_Notificacion.getEnviarBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, _cabecera._funcionesAdmin._mensajeria);
				
				_cabecera._funcionesAdmin._mensajeria._nueva_Notificacion.Enviar_Notificacion();
			}
		});
		
		_cabecera._funcionesAdmin._modificarEmpleado._empleados.getVerEmpleadoBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				appventawebbd.Empleado selected = _cabecera._funcionesAdmin._modificarEmpleado._empleados.GetSelectedEmpleado();
				_cabecera._funcionesAdmin._modificarEmpleado._empleados.clearView();
				Perfil_empleado _perfilEmpleado = new Perfil_empleado(selected);
				
				_perfilEmpleado.getCambiarPasswordBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						layout.removeAll();
						layout.add(_cabecera, _perfilEmpleado._nuevaContrasena);
					}
				});
				_perfilEmpleado._nuevaContrasena.getCancelBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						layout.removeAll();
						layout.add(_cabecera, _perfilEmpleado);
					}
				});
				_perfilEmpleado.getBorrarCuentaBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						layout.removeAll();
						_cabecera._funcionesAdmin._modificarEmpleado._empleados.FillEmpleados();
						layout.add(_cabecera, _cabecera._funcionesAdmin._modificarEmpleado._empleados);
					}
				});
				_perfilEmpleado.getAceptarCambiosBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						layout.removeAll();
						_cabecera._funcionesAdmin._modificarEmpleado._empleados.FillEmpleados();
						layout.add(_cabecera, _cabecera._funcionesAdmin._modificarEmpleado._empleados);
						_perfilEmpleado.UpdateUsuario(selected.getId(), selected.getTipo());
					}
				});
				
				layout.removeAll();
				layout.add(_cabecera, _perfilEmpleado);		
			}
		});
			
		fillCategories();
	}
	
	private void addFuncionalidadProductoAdmin(Producto_Admin pc) {
		pc.getAddOffertaBtn().setVisible(false);
		
		Detalle_Producto_Admin detalle = new Detalle_Producto_Admin(pc.GetOferta());
		detalle.getUpdateBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();				
				layout.add(_cabecera, detalle._modificar);						
			}
		});
		detalle._modificar.getAddBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();				
				layout.add(_cabecera, detalle);	
				detalle._modificar.GuardarProducto(pc.GetOferta().getProducto());
			}
		});
		detalle._quitarOferta.getCancelarBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, detalle);
			}
		});
		detalle._quitarOferta.getAceptarBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, detalle);
										
				detalle._quitarOferta.QuitarOferta();
			}
		});
		pc.getQuitarOfertaBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, detalle._quitarOferta);	
			}
		});
		detalle.getDeleteBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, detalle._quitarOferta);						
			}
		});
		detalle.getBtnBorradoProducto().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
										
				detalle.BorrarProducto(pc.GetOferta().getProducto());
			}
		});
		pc.getMoreInfoBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, detalle);
				
				detalle.getDeleteBtn().setVisible(true);
				detalle.getAddOfferBtn().setVisible(false);
				detalle.getUpdateBtn().setVisible(true);
				detalle.getAnadirACarritoBtn().setVisible(false);
				
				detalle.getViewComentsBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						layout.removeAll();
						layout.add(_cabecera, detalle._comentarios);
						
						detalle._comentarios.getBackProductBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
							@Override
							public void onComponentEvent(ClickEvent<Button> event) {
								layout.removeAll();
								layout.add(_cabecera, detalle);
							}
						});
					}
				});
			}
		});
	}
	
	private void fillCategories() {
		for (Lista_de_Productos ldp: _listaPmV._listaProductos)
		{
			VerticalLayout vl = _listaPmV.getVaadinVerticalLayout().as(VerticalLayout.class);
			vl.add(ldp);
			for (Producto_Ciber pc: ldp._producto)
			{
				addFuncionalidadProductoCiber(pc);
				
				HorizontalLayout hl = ldp.getVaadinHorizontalLayout();
				hl.add(pc);
			}
		}
	}
	
	private void addFuncionalidadProductoCiber(Producto_Ciber pc) {
		pc.getAddOffertaBtn().setVisible(false);
		pc.getQuitarOfertaBtn().setVisible(false);
		pc.getAddCarritoBtn().setVisible(false);
		
		Detalle_Producto_Admin detalle = new Detalle_Producto_Admin(pc.GetProducto());
		pc._detalleProducto.getUpdateBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, detalle._modificar);						
			}
		});
		detalle.getBtnBorradoProducto().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera);
				detalle.BorrarProducto(pc.GetProducto());
			}
		});
		detalle._modificar.getAddBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, pc._detalleProducto);	
				detalle._modificar.GuardarProducto(pc.GetProducto());
			}
		});
		pc._detalleProducto.getAddOfferBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, detalle._agregarOferta);
			}
		});
		detalle._agregarOferta.getAceptarBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, pc._detalleProducto);
				
				detalle._agregarOferta.AgregarOferta(pc.GetProducto());
			}
		});
		detalle._agregarOferta.getCancelarBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, pc._detalleProducto);
			}
		});
		detalle._quitarOferta.getCancelarBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, pc._detalleProducto);
			}
		});
		detalle._quitarOferta.getAceptarBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, pc._detalleProducto);
										
				detalle._quitarOferta.QuitarOferta();
			}
		});
		pc.getQuitarOfertaBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, detalle._quitarOferta);	
			}
		});
		pc.getAddOffertaBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, detalle._agregarOferta);		
			}
		});
		pc._detalleProducto.getDeleteBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, detalle._quitarOferta);						
			}
		});
		pc.getMoreInfoBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layout.removeAll();
				layout.add(_cabecera, pc._detalleProducto);
				
				pc._detalleProducto.getDeleteBtn().setVisible(false);
				pc._detalleProducto.getAddOfferBtn().setVisible(true);
				pc._detalleProducto.getUpdateBtn().setVisible(true);
				pc._detalleProducto.getAnadirACarritoBtn().setVisible(false);
				
				pc._detalleProducto.getViewComentsBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						layout.removeAll();
						layout.add(_cabecera, pc._detalleProducto._verComentarios);
						
						pc._detalleProducto._verComentarios.getBackProductBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
							@Override
							public void onComponentEvent(ClickEvent<Button> event) {
								layout.removeAll();
								layout.add(_cabecera, pc._detalleProducto);
							}
						});
					}
				});
			}
		});
	}
}