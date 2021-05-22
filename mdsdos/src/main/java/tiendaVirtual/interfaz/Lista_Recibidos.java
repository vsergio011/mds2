package tiendaVirtual.interfaz;

import com.vaadin.flow.component.checkbox.Checkbox;

import basededatos.BDPrincipal;
import basededatos.iCibernauta;
import basededatos.iCibernauta_Registrado;

public class Lista_Recibidos extends Notificaciones {
	public Mensajeria _mensajeria;
	
	public Lista_Recibidos(appventawebbd.Cibernauta ciber) {
		super(ciber.mensajesRecibidos.toArray());
	}
}