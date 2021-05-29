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
import appventawebbd.Entregado;
import appventawebbd.Enviado;
import appventawebbd.EnviadoDAO;
import appventawebbd.Pedido;
import appventawebbd.Pendiente;
import appventawebbd.PendienteDAO;
import appventawebbd.Transportista;
import appventawebbd.TransportistaDAO;

public class BD_Enviado {
	public BDPrincipal _bd_prin_env;
	public Vector<Enviado> _contiene_enviados = new Vector<Enviado>();

	public Pedido getPedido(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Enviado> listadoComprasEnviadas(int aIdCiber) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		List<Enviado> pedidos =  new ArrayList<Enviado>();
		try {
			pedidos = EnviadoDAO.queryEnviado("Cibernauta='"+aIdCiber+"'", "Fecha");
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return pedidos;
	}
	
	public List<Enviado> listadoComprasEnviadas() throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		List<Enviado> pedidos = new ArrayList<Enviado>();
		try {
			pedidos = EnviadoDAO.queryEnviado(null, "Fecha");
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return pedidos;
	}

	public boolean isPedidoEnviado(int aId) throws PersistentException {
		return this.getPedidoEnviado(aId) != null;
	}

	public Enviado getPedidoEnviado(int aId) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		Enviado pedido = null;
		try {
			pedido = EnviadoDAO.loadEnviadoByORMID(aId);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return pedido;
	}
	
	public void AddPedidoEnviado(Pedido pedido, Transportista transportista) throws PersistentException {
		PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		try {			
			Transportista trans = TransportistaDAO.loadTransportistaByORMID(2);
			Enviado enviado = EnviadoDAO.createEnviado();
			enviado.setCibernauta(pedido.getCibernauta());
			enviado.setDireccion(pedido.getCibernauta().getDireccionCompleta());
			
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date(System.currentTimeMillis());
			enviado.setFecha(formatter.format(date));
			
			enviado.setFechaPedido(pedido.getFechaPedido());
			enviado.setTotal(pedido.getTotal());
			enviado.setTransportistaEnvio(trans);
			EnviadoDAO.save(enviado);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}
}