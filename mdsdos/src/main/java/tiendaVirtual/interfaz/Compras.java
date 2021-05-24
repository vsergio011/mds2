package tiendaVirtual.interfaz;

import java.util.Vector;
// import interfaz.Cabecera_Lista_Compras;
// import interfaz.Compra;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaDetallecompra;
import vistas.VistaListacomprasanteriores;

public class Compras extends VistaListacomprasanteriores {
	private Object _tituloL;
	public Perfil_Cibernauta _perfil;
	public Vector<Cabecera_Lista_Compras> _list_Cabecera_Lista_Compras = new Vector<Cabecera_Lista_Compras>();
	public Vector<Compra> _compra = new Vector<Compra>();
	
	public Compras(appventawebbd.Cibernauta ciber) {
		VerticalLayout vl = this.getlPedidos().as(VerticalLayout.class);
		for (appventawebbd.Pedido pedido : ciber.pedidos.toArray()) {
			vl.add(new Compra(pedido));
		}
	}
}