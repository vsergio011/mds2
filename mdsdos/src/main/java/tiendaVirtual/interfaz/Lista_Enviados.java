package tiendaVirtual.interfaz;

import com.vaadin.flow.component.checkbox.Checkbox;

public class Lista_Enviados extends Notificaciones {
	public Mensajeria _mensajeria;
	
	public Lista_Enviados(appventawebbd.Usuario ciber) {
		super(ciber.mensajesEnviados.toArray());
	}
}