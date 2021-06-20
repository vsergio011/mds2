package tiendaVirtual.interfaz;

import com.vaadin.flow.component.checkbox.Checkbox;

import basededatos.BDPrincipal;
import basededatos.iCibernauta;
import basededatos.iCibernauta_Registrado;

public class Lista_Recibidos extends Notificaciones {
	public Mensajeria _mensajeria;
	static BDPrincipal bd = new BDPrincipal();
	
	public Lista_Recibidos(appventawebbd.Usuario ciber) {
		super(bd.getMensajesRecibidos(ciber.getId()));		
	}
}