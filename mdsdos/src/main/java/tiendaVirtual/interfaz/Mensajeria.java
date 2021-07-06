package tiendaVirtual.interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaMensajeria;

public class Mensajeria extends VistaMensajeria {
	private Object _tituloL;
	private Object _recibidosL;
	private Object _recibidosB;
	private Object _enviadosL;
	private Object _enviadosB;
	private Object _nuevoMensajeL;
	private Object _nuevoMensajeB;
	public Cabecera_Encargado _cabecera;
	public Funciones_Admin _funcionesAdmin;
	public Perfil_Cibernauta _perfil;
	public Nueva_Notificacion _nueva_Notificacion;
	public Lista_Enviados _enviados;
	public Lista_Recibidos _recibidos;
	
	private boolean enviados = false;
	public Mensajeria(appventawebbd.Usuario ciber) {
		this.getResponderBtn().setVisible(false);
		this.getNombreBtn().setText("Mensajes de " + ciber.getNombre());
		
		_nueva_Notificacion = new Nueva_Notificacion(ciber);
		load(ciber);
		
		this.getEnviadosBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				showEnviados();
			}
		});
		this.getRecibidosBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				showRecibidos();
			}
		});
		this.getReloadBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				load(ciber);
			}
		});
	}
	
	private void load(appventawebbd.Usuario ciber) {
		_recibidos = new Lista_Recibidos(ciber);
		_enviados = new Lista_Enviados(ciber);
		
		if (enviados) {
			showEnviados();
		}else {
			showRecibidos();
		}
		
	}
	
	public appventawebbd.Mensaje GetSelected() {
		if (enviados) {
			return _enviados.getSelected();
		} else {
			return _recibidos.getSelected();
		}
	}
	
	private void showRecibidos() {
		enviados = false;
		this.getTituloLbl().setText("Mensajes Recibidos");
		this.getEnviadosBtn().setVisible(true);
		this.getRecibidosBtn().setVisible(false);
		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.removeAll();
		for (Notificacion n : _recibidos._notificacion) {
			vl.add(n);
		}
	}
	
	private void showEnviados() {
		enviados = true;
		this.getTituloLbl().setText("Mensajes Enviados");
		this.getEnviadosBtn().setVisible(false);
		this.getRecibidosBtn().setVisible(true);
		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.removeAll();
		for (Notificacion n : _enviados._notificacion) {
			vl.add(n);
		}
	}
}