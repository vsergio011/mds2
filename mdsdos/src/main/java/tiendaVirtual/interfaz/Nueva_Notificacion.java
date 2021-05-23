package tiendaVirtual.interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;

import vistas.VistaDetallemensaje;
import vistas.VistaNuevomensaje;

public class Nueva_Notificacion extends VistaNuevomensaje {
	// private event _enviar_Notificacion;
	private Object _tituloL;
	private Object _asuntoL;
	private Object _asuntoTF;
	private Object _destinatarioL;
	private Object _destinatarioTF;
	private Object _cuerpoL;
	private Object _cuerpoTF;
	private Object _enviarB;
	public Mensajeria _mensajeria;

	public void Enviar_Notificacion(appventawebbd.Cibernauta ciber) {
		throw new UnsupportedOperationException();
	}
	
	public Nueva_Notificacion() {
		clearAll();
		
		this.getEnviarBtn().setVisible(true);
		this.getResponderBtn().setVisible(false);
	}
	
	public void fillNotificacion(appventawebbd.Mensaje msg) {
		if (msg == null) {
			return;
		}
		this.getEnviarBtn().setVisible(false);
		this.getResponderBtn().setVisible(true);
		this.getMensajeInput().setValue(msg.getCuerpo());
		this.getDestinatarioInput().setValue(msg.getDestinatario().getCorreoElectronico());
		this.getAsuntoInput().setValue(msg.getAsunto());
		this.getRemitenteInput().setValue(msg.getRemitente().getCorreoElectronico());
		this.getTitleLbl().setText("Vista mensaje");
		
		this.getResponderBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				changeResponder(msg);
			}
		});
	}
	
	private void changeResponder(appventawebbd.Mensaje msg) {
		this.getEnviarBtn().setVisible(true);
		this.getResponderBtn().setVisible(false);
		this.getMensajeInput().setValue("");
		this.getDestinatarioInput().setValue(msg.getRemitente().getCorreoElectronico());
		this.getAsuntoInput().setValue("Respuesta - " + msg.getAsunto());
		this.getRemitenteInput().setValue(msg.getDestinatario().getCorreoElectronico());
		this.getTitleLbl().setText("Enviar mensaje");
	}
	
	public void clearAll() {
		this.getEnviarBtn().setVisible(true);
		this.getResponderBtn().setVisible(false);
		this.getMensajeInput().setValue("");
		this.getDestinatarioInput().setValue("");
		this.getAsuntoInput().setValue("");
		this.getRemitenteInput().setValue("");
		this.getTitleLbl().setText("Enviar mensaje");
	}
}