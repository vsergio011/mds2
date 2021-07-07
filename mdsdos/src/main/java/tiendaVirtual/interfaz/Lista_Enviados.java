package tiendaVirtual.interfaz;

import com.vaadin.flow.component.checkbox.Checkbox;

import basededatos.BDPrincipal;

public class Lista_Enviados extends Notificaciones {
	public Mensajeria _mensajeria;
	static BDPrincipal bd = new BDPrincipal();
	
	public Lista_Enviados(appventawebbd.Usuario ciber) {
		super();
		super.FillEnviados(ciber.getId());
	}
}