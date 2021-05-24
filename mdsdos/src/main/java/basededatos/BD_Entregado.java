package basededatos;

import basededatos.BDPrincipal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import appventawebbd.AppventawebPersistentManager;
import appventawebbd.Entregado;
import appventawebbd.EntregadoDAO;
import appventawebbd.Enviado;
import appventawebbd.EnviadoDAO;
import appventawebbd.Pedido;
import appventawebbd.Pendiente;
import appventawebbd.Transportista;

public class BD_Entregado {
	public BDPrincipal _bd_prin_entr;
	public Vector<Entregado> _contiene_entregados = new Vector<Entregado>();

	public Pedido getPedido(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Entregado> listadoComprasEntregadas(int aIdCiber) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		List<Entregado> pedidos = null;
		try {
			pedidos = EntregadoDAO.queryEntregado("Cibernauta='"+aIdCiber+"'", "Fecha");
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return pedidos;
	}

	public List<Entregado> listadoComprasEntregadas() throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		List<Entregado> pedidos = null;
		try {
			pedidos = EntregadoDAO.queryEntregado(null, "Fecha");
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return pedidos;
	}

	public Entregado getPedidoEntregado(int aId) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Entregado pedido = null;
		try {
			pedido = EntregadoDAO.loadEntregadoByORMID(aId);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return pedido;
	}
	
	public void AddPedidoEntregado(Pedido pedido) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		try {
			Entregado entregado = EntregadoDAO.createEntregado();
			entregado.setCibernauta(pedido.getCibernauta());
			entregado.setDireccion(pedido.getCibernauta().getDireccionCompleta());
			
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date(System.currentTimeMillis());
			entregado.setFecha(formatter.format(date));
			
			entregado.setFechaPedido(pedido.getFechaPedido());
			entregado.setTotal(pedido.getTotal());
			EntregadoDAO.save(entregado);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}
}