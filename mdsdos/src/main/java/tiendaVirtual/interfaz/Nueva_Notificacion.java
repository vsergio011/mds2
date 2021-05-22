package tiendaVirtual.interfaz;

import vistas.VistaDetallemensaje;

public class Nueva_Notificacion extends VistaDetallemensaje {
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

	public void Enviar_Notificacion() {
		throw new UnsupportedOperationException();
	}
	
	public Nueva_Notificacion() {
		
	}
	
	public void fillNotificacion(appventawebbd.Mensaje msg) {
		if (msg == null) {
			return;
		}
		this.getMensajeLbl().setText(msg.getCuerpo());
		this.getRemitentelvl().setText(msg.getRemitente().getNombre());
	}
}