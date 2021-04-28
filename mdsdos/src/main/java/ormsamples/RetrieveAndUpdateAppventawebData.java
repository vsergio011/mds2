/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateAppventawebData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = Diagrama_BD.AppventawebPersistentManager.instance().getSession().beginTransaction();
		try {
			Diagrama_BD.Usuario diagrama_BDUsuario = Diagrama_BD.Usuario.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_BDUsuario.save();
			Diagrama_BD.Pedido diagrama_BDPedido = Diagrama_BD.Pedido.loadPedidoByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_BDPedido.save();
			Diagrama_BD.Comentario diagrama_BDComentario = Diagrama_BD.Comentario.loadComentarioByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_BDComentario.save();
			Diagrama_BD.Producto diagrama_BDProducto = Diagrama_BD.Producto.loadProductoByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_BDProducto.save();
			Diagrama_BD.Categoria diagrama_BDCategoria = Diagrama_BD.Categoria.loadCategoriaByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_BDCategoria.save();
			Diagrama_BD.Mensaje diagrama_BDMensaje = Diagrama_BD.Mensaje.loadMensajeByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_BDMensaje.save();
			Diagrama_BD.Pendiente diagrama_BDPendiente = Diagrama_BD.Pendiente.loadPendienteByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_BDPendiente.save();
			Diagrama_BD.Enviado diagrama_BDEnviado = Diagrama_BD.Enviado.loadEnviadoByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_BDEnviado.save();
			Diagrama_BD.Entregado diagrama_BDEntregado = Diagrama_BD.Entregado.loadEntregadoByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_BDEntregado.save();
			Diagrama_BD.Oferta diagrama_BDOferta = Diagrama_BD.Oferta.loadOfertaByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_BDOferta.save();
			Diagrama_BD.Cibernauta diagrama_BDCibernauta = Diagrama_BD.Cibernauta.loadCibernautaByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_BDCibernauta.save();
			Diagrama_BD.Empleado diagrama_BDEmpleado = Diagrama_BD.Empleado.loadEmpleadoByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_BDEmpleado.save();
			Diagrama_BD.Administrador diagrama_BDAdministrador = Diagrama_BD.Administrador.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_BDAdministrador.save();
			Diagrama_BD.Encargado diagrama_BDEncargado = Diagrama_BD.Encargado.loadEncargadoByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_BDEncargado.save();
			Diagrama_BD.Transportista diagrama_BDTransportista = Diagrama_BD.Transportista.loadTransportistaByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_BDTransportista.save();
			Diagrama_BD.Item diagrama_BDItem = Diagrama_BD.Item.loadItemByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_BDItem.save();
			Diagrama_BD.Foto diagrama_BDFoto = Diagrama_BD.Foto.loadFotoByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_BDFoto.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		Diagrama_BD.UsuarioCriteria diagrama_BDUsuarioCriteria = new Diagrama_BD.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDUsuarioCriteria.id.eq();
		System.out.println(diagrama_BDUsuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Pedido by PedidoCriteria");
		Diagrama_BD.PedidoCriteria diagrama_BDPedidoCriteria = new Diagrama_BD.PedidoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDPedidoCriteria.id.eq();
		System.out.println(diagrama_BDPedidoCriteria.uniquePedido());
		
		System.out.println("Retrieving Comentario by ComentarioCriteria");
		Diagrama_BD.ComentarioCriteria diagrama_BDComentarioCriteria = new Diagrama_BD.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDComentarioCriteria.id.eq();
		System.out.println(diagrama_BDComentarioCriteria.uniqueComentario());
		
		System.out.println("Retrieving Producto by ProductoCriteria");
		Diagrama_BD.ProductoCriteria diagrama_BDProductoCriteria = new Diagrama_BD.ProductoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDProductoCriteria.id.eq();
		System.out.println(diagrama_BDProductoCriteria.uniqueProducto());
		
		System.out.println("Retrieving Categoria by CategoriaCriteria");
		Diagrama_BD.CategoriaCriteria diagrama_BDCategoriaCriteria = new Diagrama_BD.CategoriaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDCategoriaCriteria.id.eq();
		System.out.println(diagrama_BDCategoriaCriteria.uniqueCategoria());
		
		System.out.println("Retrieving Mensaje by MensajeCriteria");
		Diagrama_BD.MensajeCriteria diagrama_BDMensajeCriteria = new Diagrama_BD.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDMensajeCriteria.id.eq();
		System.out.println(diagrama_BDMensajeCriteria.uniqueMensaje());
		
		System.out.println("Retrieving Pendiente by PendienteCriteria");
		Diagrama_BD.PendienteCriteria diagrama_BDPendienteCriteria = new Diagrama_BD.PendienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDPendienteCriteria.id.eq();
		System.out.println(diagrama_BDPendienteCriteria.uniquePendiente());
		
		System.out.println("Retrieving Enviado by EnviadoCriteria");
		Diagrama_BD.EnviadoCriteria diagrama_BDEnviadoCriteria = new Diagrama_BD.EnviadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDEnviadoCriteria.id.eq();
		System.out.println(diagrama_BDEnviadoCriteria.uniqueEnviado());
		
		System.out.println("Retrieving Entregado by EntregadoCriteria");
		Diagrama_BD.EntregadoCriteria diagrama_BDEntregadoCriteria = new Diagrama_BD.EntregadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDEntregadoCriteria.id.eq();
		System.out.println(diagrama_BDEntregadoCriteria.uniqueEntregado());
		
		System.out.println("Retrieving Oferta by OfertaCriteria");
		Diagrama_BD.OfertaCriteria diagrama_BDOfertaCriteria = new Diagrama_BD.OfertaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDOfertaCriteria.id.eq();
		System.out.println(diagrama_BDOfertaCriteria.uniqueOferta());
		
		System.out.println("Retrieving Cibernauta by CibernautaCriteria");
		Diagrama_BD.CibernautaCriteria diagrama_BDCibernautaCriteria = new Diagrama_BD.CibernautaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDCibernautaCriteria.id.eq();
		System.out.println(diagrama_BDCibernautaCriteria.uniqueCibernauta());
		
		System.out.println("Retrieving Empleado by EmpleadoCriteria");
		Diagrama_BD.EmpleadoCriteria diagrama_BDEmpleadoCriteria = new Diagrama_BD.EmpleadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDEmpleadoCriteria.id.eq();
		System.out.println(diagrama_BDEmpleadoCriteria.uniqueEmpleado());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		Diagrama_BD.AdministradorCriteria diagrama_BDAdministradorCriteria = new Diagrama_BD.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDAdministradorCriteria.id.eq();
		System.out.println(diagrama_BDAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Encargado by EncargadoCriteria");
		Diagrama_BD.EncargadoCriteria diagrama_BDEncargadoCriteria = new Diagrama_BD.EncargadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDEncargadoCriteria.id.eq();
		System.out.println(diagrama_BDEncargadoCriteria.uniqueEncargado());
		
		System.out.println("Retrieving Transportista by TransportistaCriteria");
		Diagrama_BD.TransportistaCriteria diagrama_BDTransportistaCriteria = new Diagrama_BD.TransportistaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDTransportistaCriteria.id.eq();
		System.out.println(diagrama_BDTransportistaCriteria.uniqueTransportista());
		
		System.out.println("Retrieving Item by ItemCriteria");
		Diagrama_BD.ItemCriteria diagrama_BDItemCriteria = new Diagrama_BD.ItemCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDItemCriteria.ID.eq();
		System.out.println(diagrama_BDItemCriteria.uniqueItem());
		
		System.out.println("Retrieving Foto by FotoCriteria");
		Diagrama_BD.FotoCriteria diagrama_BDFotoCriteria = new Diagrama_BD.FotoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_BDFotoCriteria.id.eq();
		System.out.println(diagrama_BDFotoCriteria.uniqueFoto());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateAppventawebData retrieveAndUpdateAppventawebData = new RetrieveAndUpdateAppventawebData();
			try {
				retrieveAndUpdateAppventawebData.retrieveAndUpdateTestData();
				//retrieveAndUpdateAppventawebData.retrieveByCriteria();
			}
			finally {
				Diagrama_BD.AppventawebPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
