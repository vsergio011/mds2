package basededatos;

import basededatos.BDPrincipal;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import appventawebbd.AppventawebPersistentManager;
import appventawebbd.Cibernauta;
import appventawebbd.CibernautaDAO;
import appventawebbd.Entregado;
import appventawebbd.EntregadoDAO;
import appventawebbd.Item;
import appventawebbd.ItemDAO;
import appventawebbd.Oferta;
import appventawebbd.Pedido;
import appventawebbd.PedidoDAO;
import appventawebbd.Pendiente;
import appventawebbd.PendienteDAO;

public class BD_Pendiente {
	public BDPrincipal _bd_prin_pend;
	public Vector<Pendiente> _contiene_pedidos = new Vector<Pendiente>();

	public Pendiente RealizaCompra(List<Item> aItems, Cibernauta aCiber, double precio) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Pendiente pedido = PendienteDAO.createPendiente();
			pedido.setCibernauta(aCiber);
			pedido.setDireccion(aCiber.getDireccionCompleta());
			
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date(System.currentTimeMillis());
			pedido.setFechaPedido(formatter.format(date));
			pedido.setFecha(formatter.format(date));
			pedido.setFormaPago(aCiber.getFormaPago());
			
			double total = 0;
			for (Item item : aItems) {
				item.setPedido(pedido);
				pedido.items.add(item);
				
				total += item.getCantidad() * item.getProducto().getPrecio();
			}
			if (precio != 0) {
				total = precio;
			}
			pedido.setTotal(total);
			PendienteDAO.save(pedido);
			
			t.commit();
			
			return pedido;
		} catch (Exception e) {
			System.out.println("EXCETION::::");
			t.rollback();
		}
		return null;
	}

	public Pedido getPedido(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Pendiente> listadoComprasPendientes(int aIdCiber) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		List<Pendiente> pedidos = new ArrayList<Pendiente>();
		try {
			pedidos = PendienteDAO.queryPendiente("Cibernauta='"+aIdCiber+"'", "Fecha");
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return pedidos;
	}
	
	public List<Pendiente> listadoComprasPendientes() throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		List<Pendiente> pedidos =new ArrayList<Pendiente>();
		try {
			pedidos = PendienteDAO.queryPendiente(null, "Fecha");
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return pedidos;
	}

	public void operation(int aIdCiber) {
		throw new UnsupportedOperationException();
	}

	public void cambioDatosCompra(String aDireccion, String aFormapago, int aIdPedido) {
		throw new UnsupportedOperationException();
	}

	public Pendiente getPedidoPendiente(int aId) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Pendiente pedido = null;
		try {
			pedido = PendienteDAO.loadPendienteByQuery("PedidoId='"+aId+"'", null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return pedido;
	}

	public void cancelarCompra(Pendiente pedido) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		try {
			for(Item item : pedido.items.toArray()) {
				ItemDAO.delete(item);
			}
			PendienteDAO.delete(pedido);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}
}