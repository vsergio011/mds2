package tiendaVirtual.interfaz;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;

import appventawebbd.Usuario;
import basededatos.BDPrincipal;
import basededatos.iCibernauta;
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

	private appventawebbd.Usuario ciber = null;
	public void Enviar_Notificacion() {
		iCibernauta c = new BDPrincipal();
		appventawebbd.Usuario destinatario = c.getUsuarioEmail(this.getDestinatarioInput().getValue());
		c.nuevaNotificacion(ciber, destinatario, this.getAsuntoInput().getValue(), this.getMensajeInput().getValue());
		clearAll();
	}
	
	private Usuario selected = null;
	public Nueva_Notificacion(appventawebbd.Usuario ciber) {
		clearAll();
		this.getRemitenteInput().setEnabled(false);
		this.getDestinatarioInput().setEnabled(true);
		this.getAsuntoInput().setEnabled(true);
		this.getRemitenteInput().setValue(ciber.getCorreoElectronico());
		this.ciber = ciber;
		this.getEnviarBtn().setVisible(true);
		this.getResponderBtn().setVisible(false);
		
		BDPrincipal bd = new BDPrincipal();
		List<Usuario> usuariosBD = bd.getUsuarios();
		List<String> usuarios = new ArrayList<String>();
		for (Usuario usu : usuariosBD) {
			usuarios.add(usu.getNombre() + " - " + usu.getCorreoElectronico());
		}
		this.getUsuariosCombo().setItems(usuarios);
		
		this.getUsuariosCombo().addValueChangeListener(event -> {
			int index = usuarios.indexOf(event.getValue());
			if (index != -1) {
				selected = usuariosBD.get(index);
				this.getDestinatarioInput().setValue(selected.getCorreoElectronico());
			}			
		});
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
		this.getDestinatarioInput().setEnabled(false);
		this.getAsuntoInput().setEnabled(false);
		this.getUsuariosCombo().setVisible(false);
	}
	
	public void clearAll() {
		this.getEnviarBtn().setVisible(true);
		this.getResponderBtn().setVisible(false);
		this.getMensajeInput().setValue("");
		this.getMensajeInput().setEnabled(true);
		this.getDestinatarioInput().setValue("");
		this.getDestinatarioInput().setEnabled(true);
		this.getAsuntoInput().setValue("");
		this.getAsuntoInput().setEnabled(true);
		this.getRemitenteInput().setValue("");
		this.getTitleLbl().setText("Enviar mensaje");
		this.getUsuariosCombo().setVisible(true);
		this.getUsuariosCombo().clear();
	}
}