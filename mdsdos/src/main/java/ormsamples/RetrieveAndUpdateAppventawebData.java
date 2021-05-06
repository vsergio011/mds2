/**
 * Licensee: antonioofdzj(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateAppventawebData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = appventawebbd.AppventawebPersistentManager.instance().getSession().beginTransaction();
		try {
			appventawebbd.Usuario lappventawebbdUsuario = appventawebbd.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			appventawebbd.UsuarioDAO.save(lappventawebbdUsuario);
			appventawebbd.Pedido lappventawebbdPedido = appventawebbd.PedidoDAO.loadPedidoByQuery(null, null);
			// Update the properties of the persistent object
			appventawebbd.PedidoDAO.save(lappventawebbdPedido);
			appventawebbd.Comentario lappventawebbdComentario = appventawebbd.ComentarioDAO.loadComentarioByQuery(null, null);
			// Update the properties of the persistent object
			appventawebbd.ComentarioDAO.save(lappventawebbdComentario);
			appventawebbd.Producto lappventawebbdProducto = appventawebbd.ProductoDAO.loadProductoByQuery(null, null);
			// Update the properties of the persistent object
			appventawebbd.ProductoDAO.save(lappventawebbdProducto);
			appventawebbd.Categoria lappventawebbdCategoria = appventawebbd.CategoriaDAO.loadCategoriaByQuery(null, null);
			// Update the properties of the persistent object
			appventawebbd.CategoriaDAO.save(lappventawebbdCategoria);
			appventawebbd.Mensaje lappventawebbdMensaje = appventawebbd.MensajeDAO.loadMensajeByQuery(null, null);
			// Update the properties of the persistent object
			appventawebbd.MensajeDAO.save(lappventawebbdMensaje);
			appventawebbd.Pendiente lappventawebbdPendiente = appventawebbd.PendienteDAO.loadPendienteByQuery(null, null);
			// Update the properties of the persistent object
			appventawebbd.PendienteDAO.save(lappventawebbdPendiente);
			appventawebbd.Enviado lappventawebbdEnviado = appventawebbd.EnviadoDAO.loadEnviadoByQuery(null, null);
			// Update the properties of the persistent object
			appventawebbd.EnviadoDAO.save(lappventawebbdEnviado);
			appventawebbd.Entregado lappventawebbdEntregado = appventawebbd.EntregadoDAO.loadEntregadoByQuery(null, null);
			// Update the properties of the persistent object
			appventawebbd.EntregadoDAO.save(lappventawebbdEntregado);
			appventawebbd.Oferta lappventawebbdOferta = appventawebbd.OfertaDAO.loadOfertaByQuery(null, null);
			// Update the properties of the persistent object
			appventawebbd.OfertaDAO.save(lappventawebbdOferta);
			appventawebbd.Cibernauta lappventawebbdCibernauta = appventawebbd.CibernautaDAO.loadCibernautaByQuery(null, null);
			// Update the properties of the persistent object
			appventawebbd.CibernautaDAO.save(lappventawebbdCibernauta);
			appventawebbd.Empleado lappventawebbdEmpleado = appventawebbd.EmpleadoDAO.loadEmpleadoByQuery(null, null);
			// Update the properties of the persistent object
			appventawebbd.EmpleadoDAO.save(lappventawebbdEmpleado);
			appventawebbd.Administrador lappventawebbdAdministrador = appventawebbd.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			appventawebbd.AdministradorDAO.save(lappventawebbdAdministrador);
			appventawebbd.Encargado lappventawebbdEncargado = appventawebbd.EncargadoDAO.loadEncargadoByQuery(null, null);
			// Update the properties of the persistent object
			appventawebbd.EncargadoDAO.save(lappventawebbdEncargado);
			appventawebbd.Transportista lappventawebbdTransportista = appventawebbd.TransportistaDAO.loadTransportistaByQuery(null, null);
			// Update the properties of the persistent object
			appventawebbd.TransportistaDAO.save(lappventawebbdTransportista);
			appventawebbd.Item lappventawebbdItem = appventawebbd.ItemDAO.loadItemByQuery(null, null);
			// Update the properties of the persistent object
			appventawebbd.ItemDAO.save(lappventawebbdItem);
			appventawebbd.Foto lappventawebbdFoto = appventawebbd.FotoDAO.loadFotoByQuery(null, null);
			// Update the properties of the persistent object
			appventawebbd.FotoDAO.save(lappventawebbdFoto);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		appventawebbd.UsuarioCriteria lappventawebbdUsuarioCriteria = new appventawebbd.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lappventawebbdUsuarioCriteria.id.eq();
		System.out.println(lappventawebbdUsuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Pedido by PedidoCriteria");
		appventawebbd.PedidoCriteria lappventawebbdPedidoCriteria = new appventawebbd.PedidoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lappventawebbdPedidoCriteria.id.eq();
		System.out.println(lappventawebbdPedidoCriteria.uniquePedido());
		
		System.out.println("Retrieving Comentario by ComentarioCriteria");
		appventawebbd.ComentarioCriteria lappventawebbdComentarioCriteria = new appventawebbd.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lappventawebbdComentarioCriteria.id.eq();
		System.out.println(lappventawebbdComentarioCriteria.uniqueComentario());
		
		System.out.println("Retrieving Producto by ProductoCriteria");
		appventawebbd.ProductoCriteria lappventawebbdProductoCriteria = new appventawebbd.ProductoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lappventawebbdProductoCriteria.id.eq();
		System.out.println(lappventawebbdProductoCriteria.uniqueProducto());
		
		System.out.println("Retrieving Categoria by CategoriaCriteria");
		appventawebbd.CategoriaCriteria lappventawebbdCategoriaCriteria = new appventawebbd.CategoriaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lappventawebbdCategoriaCriteria.id.eq();
		System.out.println(lappventawebbdCategoriaCriteria.uniqueCategoria());
		
		System.out.println("Retrieving Mensaje by MensajeCriteria");
		appventawebbd.MensajeCriteria lappventawebbdMensajeCriteria = new appventawebbd.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lappventawebbdMensajeCriteria.id.eq();
		System.out.println(lappventawebbdMensajeCriteria.uniqueMensaje());
		
		System.out.println("Retrieving Pendiente by PendienteCriteria");
		appventawebbd.PendienteCriteria lappventawebbdPendienteCriteria = new appventawebbd.PendienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lappventawebbdPendienteCriteria.id.eq();
		System.out.println(lappventawebbdPendienteCriteria.uniquePendiente());
		
		System.out.println("Retrieving Enviado by EnviadoCriteria");
		appventawebbd.EnviadoCriteria lappventawebbdEnviadoCriteria = new appventawebbd.EnviadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lappventawebbdEnviadoCriteria.id.eq();
		System.out.println(lappventawebbdEnviadoCriteria.uniqueEnviado());
		
		System.out.println("Retrieving Entregado by EntregadoCriteria");
		appventawebbd.EntregadoCriteria lappventawebbdEntregadoCriteria = new appventawebbd.EntregadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lappventawebbdEntregadoCriteria.id.eq();
		System.out.println(lappventawebbdEntregadoCriteria.uniqueEntregado());
		
		System.out.println("Retrieving Oferta by OfertaCriteria");
		appventawebbd.OfertaCriteria lappventawebbdOfertaCriteria = new appventawebbd.OfertaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lappventawebbdOfertaCriteria.id.eq();
		System.out.println(lappventawebbdOfertaCriteria.uniqueOferta());
		
		System.out.println("Retrieving Cibernauta by CibernautaCriteria");
		appventawebbd.CibernautaCriteria lappventawebbdCibernautaCriteria = new appventawebbd.CibernautaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lappventawebbdCibernautaCriteria.id.eq();
		System.out.println(lappventawebbdCibernautaCriteria.uniqueCibernauta());
		
		System.out.println("Retrieving Empleado by EmpleadoCriteria");
		appventawebbd.EmpleadoCriteria lappventawebbdEmpleadoCriteria = new appventawebbd.EmpleadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lappventawebbdEmpleadoCriteria.id.eq();
		System.out.println(lappventawebbdEmpleadoCriteria.uniqueEmpleado());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		appventawebbd.AdministradorCriteria lappventawebbdAdministradorCriteria = new appventawebbd.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lappventawebbdAdministradorCriteria.id.eq();
		System.out.println(lappventawebbdAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Encargado by EncargadoCriteria");
		appventawebbd.EncargadoCriteria lappventawebbdEncargadoCriteria = new appventawebbd.EncargadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lappventawebbdEncargadoCriteria.id.eq();
		System.out.println(lappventawebbdEncargadoCriteria.uniqueEncargado());
		
		System.out.println("Retrieving Transportista by TransportistaCriteria");
		appventawebbd.TransportistaCriteria lappventawebbdTransportistaCriteria = new appventawebbd.TransportistaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lappventawebbdTransportistaCriteria.id.eq();
		System.out.println(lappventawebbdTransportistaCriteria.uniqueTransportista());
		
		System.out.println("Retrieving Item by ItemCriteria");
		appventawebbd.ItemCriteria lappventawebbdItemCriteria = new appventawebbd.ItemCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lappventawebbdItemCriteria.ID.eq();
		System.out.println(lappventawebbdItemCriteria.uniqueItem());
		
		System.out.println("Retrieving Foto by FotoCriteria");
		appventawebbd.FotoCriteria lappventawebbdFotoCriteria = new appventawebbd.FotoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lappventawebbdFotoCriteria.id.eq();
		System.out.println(lappventawebbdFotoCriteria.uniqueFoto());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateAppventawebData retrieveAndUpdateAppventawebData = new RetrieveAndUpdateAppventawebData();
			try {
				retrieveAndUpdateAppventawebData.retrieveAndUpdateTestData();
				//retrieveAndUpdateAppventawebData.retrieveByCriteria();
			}
			finally {
				appventawebbd.AppventawebPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
