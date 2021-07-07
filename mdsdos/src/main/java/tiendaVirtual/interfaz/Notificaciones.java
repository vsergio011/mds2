package tiendaVirtual.interfaz;

import java.util.Vector;

import com.vaadin.flow.component.checkbox.Checkbox;

import basededatos.BDPrincipal;
import vistas.VistaNotificaciones;
// import interfaz.Notificacion;
// import interfaz.Titulo_Mensajes;

public class Notificaciones extends VistaNotificaciones{
	private Object _tituloL;
	public Vector<Notificacion> _notificacion = new Vector<Notificacion>();
	public Vector<Titulo_Mensajes> _list_Titulo_Mensajes = new Vector<Titulo_Mensajes>();
	
	public Notificaciones() {}
	
	public void FillRecibidos(int idCibernauta) {
		BDPrincipal bd = new BDPrincipal();
		for (appventawebbd.Mensaje m : bd.getMensajesRecibidos(idCibernauta)) {
			this._notificacion.add(new Notificacion(m));
		}
	}
	
	public void FillEnviados(int idCibernauta) {
		BDPrincipal bd = new BDPrincipal();
		for (appventawebbd.Mensaje m : bd.getMensajesEnviados(idCibernauta)) {
			this._notificacion.add(new Notificacion(m));
		}
	}
	
	public appventawebbd.Mensaje getSelected() {
		for (Notificacion n : this._notificacion) {
			Checkbox cb = n.getVaadinCheckbox();
			if (cb.getValue()) {
				return n.getMensaje();
			}
		}
		return null;
	}
}