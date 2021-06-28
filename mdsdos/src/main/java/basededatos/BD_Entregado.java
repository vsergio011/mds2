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
import appventawebbd.Entregado;
import appventawebbd.EntregadoCriteria;
import appventawebbd.EntregadoDAO;
import appventawebbd.Enviado;
import appventawebbd.EnviadoDAO;
import appventawebbd.Item;
import appventawebbd.Pedido;
import appventawebbd.Pendiente;
import appventawebbd.PendienteCriteria;
import appventawebbd.PendienteDAO;
import appventawebbd.Transportista;

public class BD_Entregado {
	public BDPrincipal _bd_prin_entr;
	public Vector<Entregado> _contiene_entregados = new Vector<Entregado>();

	public Pedido getPedido(int aId) {
		throw new UnsupportedOperationException();
	}

	public Entregado[] listadoComprasEntregadas(int aIdCiber) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Entregado[] pedidos = {};
		try {
			pedidos = EntregadoDAO.listEntregadoByQuery("CibernautaUsuarioId='"+aIdCiber+"'", "FechaPedido");
			t.commit();
		} catch (Exception e) {
			System.out.println(">>>>>>>>ERROR EN BD: " + e.getMessage());
			t.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
		
		return pedidos;
	}

	public Entregado[] listadoComprasEntregadas() throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Entregado[] pedidos = {};
		try {
			pedidos = EntregadoDAO.listEntregadoByQuery(null, "FechaPedido");
			t.commit();
		} catch (Exception e) {
			System.out.println(">>>>>>>>ERROR EN BD: " + e.getMessage());
			t.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
		
		return pedidos;
	}

	public Entregado getPedidoEntregado(int aId) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Entregado pedido = null;
		try {
			pedido = EntregadoDAO.loadEntregadoByORMID(aId);
			t.commit();
		} catch (Exception e) {
			System.out.println(">>>>>>>>ERROR EN BD: " + e.getMessage());
			t.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
		
		return pedido;
	}
	
	public void AddPedidoEntregado(int pedidoId) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Enviado pedido = EnviadoDAO.getEnviadoByORMID(pedidoId);
			
			Entregado entregado = EntregadoDAO.createEntregado();
			entregado.setCibernauta(pedido.getCibernauta());
			entregado.setDireccion(pedido.getCibernauta().getDireccionCompleta());
			
			for (Item item : pedido.items.toArray()) {
				entregado.items.add(item);
			}
			
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date(System.currentTimeMillis());
			entregado.setFecha(formatter.format(date));
			
			entregado.setFechaPedido(pedido.getFechaPedido());
			entregado.setTotal(pedido.getTotal());
			EntregadoDAO.save(entregado);
			
			pedido.items.clear();;
			pedido.setCibernauta(null);
			EnviadoDAO.delete(pedido);
			
			t.commit();
		} catch (Exception e) {
			System.out.println(">>>>>>>>ERROR EN BD: " + e.getMessage());
			t.rollback();
		}
		AppventawebPersistentManager.instance().disposePersistentManager();
	}
}