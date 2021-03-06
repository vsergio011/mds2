package tiendaVirtual.interfaz;

import java.util.List;
import java.util.Vector;
// import interfaz.Cabecera_Lista_Compras;
// import interfaz.Compra;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iCibernauta_Registrado;
import vistas.VistaDetallecompra;
import vistas.VistaListacomprasanteriores;

public class Compras extends VistaListacomprasanteriores {
	private Object _tituloL;
	public Perfil_Cibernauta _perfil;
	public Vector<Cabecera_Lista_Compras> _list_Cabecera_Lista_Compras = new Vector<Cabecera_Lista_Compras>();
	public Vector<Compra> _compra = new Vector<Compra>();
	
	public Compras(appventawebbd.Cibernauta ciber) {
		UpdateCompras(ciber);
	}
	
	public void UpdateCompras(appventawebbd.Cibernauta ciber) {
		VerticalLayout vl = this.getlPedidos().as(VerticalLayout.class);
		vl.removeAll();
		_compra.clear();
		
		iCibernauta_Registrado bd = new BDPrincipal();
		
		for (appventawebbd.Pedido pedido : bd.listadoComprasPendientes(ciber.getId())) {
			Compra c = new Compra(pedido);
			c.getEstadoLbl().setText("Pendiente");
			c.getCancelarPedidoBtn().setVisible(true);
			c._productosAdquiridos.getCancelarCompraBtn().setVisible(true);
			for (Producto_Adquirido pa : c._productosAdquiridos._productoAdquirido) {
				pa.getComEntarBtn().setVisible(false);
			}
			
			_compra.add(c);
			vl.add(c);
		}
		
		for (appventawebbd.Pedido pedido :  bd.listadoComprasEntregadas(ciber.getId())) {
			Compra c = new Compra(pedido);
			c.getEstadoLbl().setText("Entregado");
			c.getCancelarPedidoBtn().setVisible(false);
			c._productosAdquiridos.getCancelarCompraBtn().setVisible(false);
			_compra.add(c);
			vl.add(c);
		}
		
		for (appventawebbd.Pedido pedido : bd.listadoComprasEnviadas(ciber.getId())) {
			Compra c = new Compra(pedido);
			c.getEstadoLbl().setText("Enviado");
			c.getCancelarPedidoBtn().setVisible(false);
			c._productosAdquiridos.getCancelarCompraBtn().setVisible(true);
			
			for (Producto_Adquirido pa : c._productosAdquiridos._productoAdquirido) {
				pa.getComEntarBtn().setVisible(false);
			}
			
			_compra.add(c);
			vl.add(c);
		}	
	}
}