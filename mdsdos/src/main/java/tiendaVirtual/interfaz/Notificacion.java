package tiendaVirtual.interfaz;

import vistas.VistaNotificacion;

public class Notificacion extends VistaNotificacion {
	private Object _asuntoL;
	private Object _fechaL;
	private Object _remitenteL;
	private Object _cuerpoL;
	private Object _responderB;
	public Notificaciones _notificaciones;
	public Responder _responder;
	
	private appventawebbd.Mensaje msg = null;
	public appventawebbd.Mensaje getMensaje() {
		return msg;
	}
	
	public Notificacion(appventawebbd.Mensaje msg) {
		this.msg = msg;
		
		this.getAsuntoLbl().setText("Asunto: " + msg.getAsunto());
		this.getMsgLbl().setText("Mensaje: " + msg.getCuerpo());
	}	
}