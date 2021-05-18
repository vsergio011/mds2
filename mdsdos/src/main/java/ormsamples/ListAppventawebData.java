/**
 * Licensee: antonioofdzj(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListAppventawebData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Usuario...");
		appventawebbd.Usuario[] appventawebbdUsuarios = appventawebbd.UsuarioDAO.listUsuarioByQuery(null, null);
		int length = Math.min(appventawebbdUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(appventawebbdUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Pedido...");
		appventawebbd.Pedido[] appventawebbdPedidos = appventawebbd.PedidoDAO.listPedidoByQuery(null, null);
		length = Math.min(appventawebbdPedidos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(appventawebbdPedidos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Comentario...");
		appventawebbd.Comentario[] appventawebbdComentarios = appventawebbd.ComentarioDAO.listComentarioByQuery(null, null);
		length = Math.min(appventawebbdComentarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(appventawebbdComentarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Producto...");
		appventawebbd.Producto[] appventawebbdProductos = appventawebbd.ProductoDAO.listProductoByQuery(null, null);
		length = Math.min(appventawebbdProductos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(appventawebbdProductos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Categoria...");
		appventawebbd.Categoria[] appventawebbdCategorias = appventawebbd.CategoriaDAO.listCategoriaByQuery(null, null);
		length = Math.min(appventawebbdCategorias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(appventawebbdCategorias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Mensaje...");
		appventawebbd.Mensaje[] appventawebbdMensajes = appventawebbd.MensajeDAO.listMensajeByQuery(null, null);
		length = Math.min(appventawebbdMensajes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(appventawebbdMensajes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Pendiente...");
		appventawebbd.Pendiente[] appventawebbdPendientes = appventawebbd.PendienteDAO.listPendienteByQuery(null, null);
		length = Math.min(appventawebbdPendientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(appventawebbdPendientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Enviado...");
		appventawebbd.Enviado[] appventawebbdEnviados = appventawebbd.EnviadoDAO.listEnviadoByQuery(null, null);
		length = Math.min(appventawebbdEnviados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(appventawebbdEnviados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Entregado...");
		appventawebbd.Entregado[] appventawebbdEntregados = appventawebbd.EntregadoDAO.listEntregadoByQuery(null, null);
		length = Math.min(appventawebbdEntregados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(appventawebbdEntregados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Oferta...");
		appventawebbd.Oferta[] appventawebbdOfertas = appventawebbd.OfertaDAO.listOfertaByQuery(null, null);
		length = Math.min(appventawebbdOfertas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(appventawebbdOfertas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cibernauta...");
		appventawebbd.Cibernauta[] appventawebbdCibernautas = appventawebbd.CibernautaDAO.listCibernautaByQuery(null, null);
		length = Math.min(appventawebbdCibernautas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(appventawebbdCibernautas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Empleado...");
		appventawebbd.Empleado[] appventawebbdEmpleados = appventawebbd.EmpleadoDAO.listEmpleadoByQuery(null, null);
		length = Math.min(appventawebbdEmpleados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(appventawebbdEmpleados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		appventawebbd.Administrador[] appventawebbdAdministradors = appventawebbd.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(appventawebbdAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(appventawebbdAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Encargado...");
		appventawebbd.Encargado[] appventawebbdEncargados = appventawebbd.EncargadoDAO.listEncargadoByQuery(null, null);
		length = Math.min(appventawebbdEncargados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(appventawebbdEncargados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Transportista...");
		appventawebbd.Transportista[] appventawebbdTransportistas = appventawebbd.TransportistaDAO.listTransportistaByQuery(null, null);
		length = Math.min(appventawebbdTransportistas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(appventawebbdTransportistas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Item...");
		appventawebbd.Item[] appventawebbdItems = appventawebbd.ItemDAO.listItemByQuery(null, null);
		length = Math.min(appventawebbdItems.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(appventawebbdItems[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Foto...");
		appventawebbd.Foto[] appventawebbdFotos = appventawebbd.FotoDAO.listFotoByQuery(null, null);
		length = Math.min(appventawebbdFotos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(appventawebbdFotos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Usuario by Criteria...");
		appventawebbd.UsuarioCriteria lappventawebbdUsuarioCriteria = new appventawebbd.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lappventawebbdUsuarioCriteria.id.eq();
		lappventawebbdUsuarioCriteria.setMaxResults(ROW_COUNT);
		appventawebbd.Usuario[] appventawebbdUsuarios = lappventawebbdUsuarioCriteria.listUsuario();
		int length =appventawebbdUsuarios== null ? 0 : Math.min(appventawebbdUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(appventawebbdUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Pedido by Criteria...");
		appventawebbd.PedidoCriteria lappventawebbdPedidoCriteria = new appventawebbd.PedidoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lappventawebbdPedidoCriteria.id.eq();
		lappventawebbdPedidoCriteria.setMaxResults(ROW_COUNT);
		appventawebbd.Pedido[] appventawebbdPedidos = lappventawebbdPedidoCriteria.listPedido();
		length =appventawebbdPedidos== null ? 0 : Math.min(appventawebbdPedidos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(appventawebbdPedidos[i]);
		}
		System.out.println(length + " Pedido record(s) retrieved."); 
		
		System.out.println("Listing Comentario by Criteria...");
		appventawebbd.ComentarioCriteria lappventawebbdComentarioCriteria = new appventawebbd.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lappventawebbdComentarioCriteria.id.eq();
		lappventawebbdComentarioCriteria.setMaxResults(ROW_COUNT);
		appventawebbd.Comentario[] appventawebbdComentarios = lappventawebbdComentarioCriteria.listComentario();
		length =appventawebbdComentarios== null ? 0 : Math.min(appventawebbdComentarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(appventawebbdComentarios[i]);
		}
		System.out.println(length + " Comentario record(s) retrieved."); 
		
		System.out.println("Listing Producto by Criteria...");
		appventawebbd.ProductoCriteria lappventawebbdProductoCriteria = new appventawebbd.ProductoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lappventawebbdProductoCriteria.id.eq();
		lappventawebbdProductoCriteria.setMaxResults(ROW_COUNT);
		appventawebbd.Producto[] appventawebbdProductos = lappventawebbdProductoCriteria.listProducto();
		length =appventawebbdProductos== null ? 0 : Math.min(appventawebbdProductos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(appventawebbdProductos[i]);
		}
		System.out.println(length + " Producto record(s) retrieved."); 
		
		System.out.println("Listing Categoria by Criteria...");
		appventawebbd.CategoriaCriteria lappventawebbdCategoriaCriteria = new appventawebbd.CategoriaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lappventawebbdCategoriaCriteria.id.eq();
		lappventawebbdCategoriaCriteria.setMaxResults(ROW_COUNT);
		appventawebbd.Categoria[] appventawebbdCategorias = lappventawebbdCategoriaCriteria.listCategoria();
		length =appventawebbdCategorias== null ? 0 : Math.min(appventawebbdCategorias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(appventawebbdCategorias[i]);
		}
		System.out.println(length + " Categoria record(s) retrieved."); 
		
		System.out.println("Listing Mensaje by Criteria...");
		appventawebbd.MensajeCriteria lappventawebbdMensajeCriteria = new appventawebbd.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lappventawebbdMensajeCriteria.id.eq();
		lappventawebbdMensajeCriteria.setMaxResults(ROW_COUNT);
		appventawebbd.Mensaje[] appventawebbdMensajes = lappventawebbdMensajeCriteria.listMensaje();
		length =appventawebbdMensajes== null ? 0 : Math.min(appventawebbdMensajes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(appventawebbdMensajes[i]);
		}
		System.out.println(length + " Mensaje record(s) retrieved."); 
		
		System.out.println("Listing Pendiente by Criteria...");
		appventawebbd.PendienteCriteria lappventawebbdPendienteCriteria = new appventawebbd.PendienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lappventawebbdPendienteCriteria.id.eq();
		lappventawebbdPendienteCriteria.setMaxResults(ROW_COUNT);
		appventawebbd.Pendiente[] appventawebbdPendientes = lappventawebbdPendienteCriteria.listPendiente();
		length =appventawebbdPendientes== null ? 0 : Math.min(appventawebbdPendientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(appventawebbdPendientes[i]);
		}
		System.out.println(length + " Pendiente record(s) retrieved."); 
		
		System.out.println("Listing Enviado by Criteria...");
		appventawebbd.EnviadoCriteria lappventawebbdEnviadoCriteria = new appventawebbd.EnviadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lappventawebbdEnviadoCriteria.id.eq();
		lappventawebbdEnviadoCriteria.setMaxResults(ROW_COUNT);
		appventawebbd.Enviado[] appventawebbdEnviados = lappventawebbdEnviadoCriteria.listEnviado();
		length =appventawebbdEnviados== null ? 0 : Math.min(appventawebbdEnviados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(appventawebbdEnviados[i]);
		}
		System.out.println(length + " Enviado record(s) retrieved."); 
		
		System.out.println("Listing Entregado by Criteria...");
		appventawebbd.EntregadoCriteria lappventawebbdEntregadoCriteria = new appventawebbd.EntregadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lappventawebbdEntregadoCriteria.id.eq();
		lappventawebbdEntregadoCriteria.setMaxResults(ROW_COUNT);
		appventawebbd.Entregado[] appventawebbdEntregados = lappventawebbdEntregadoCriteria.listEntregado();
		length =appventawebbdEntregados== null ? 0 : Math.min(appventawebbdEntregados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(appventawebbdEntregados[i]);
		}
		System.out.println(length + " Entregado record(s) retrieved."); 
		
		System.out.println("Listing Oferta by Criteria...");
		appventawebbd.OfertaCriteria lappventawebbdOfertaCriteria = new appventawebbd.OfertaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lappventawebbdOfertaCriteria.id.eq();
		lappventawebbdOfertaCriteria.setMaxResults(ROW_COUNT);
		appventawebbd.Oferta[] appventawebbdOfertas = lappventawebbdOfertaCriteria.listOferta();
		length =appventawebbdOfertas== null ? 0 : Math.min(appventawebbdOfertas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(appventawebbdOfertas[i]);
		}
		System.out.println(length + " Oferta record(s) retrieved."); 
		
		System.out.println("Listing Cibernauta by Criteria...");
		appventawebbd.CibernautaCriteria lappventawebbdCibernautaCriteria = new appventawebbd.CibernautaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lappventawebbdCibernautaCriteria.id.eq();
		lappventawebbdCibernautaCriteria.setMaxResults(ROW_COUNT);
		appventawebbd.Cibernauta[] appventawebbdCibernautas = lappventawebbdCibernautaCriteria.listCibernauta();
		length =appventawebbdCibernautas== null ? 0 : Math.min(appventawebbdCibernautas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(appventawebbdCibernautas[i]);
		}
		System.out.println(length + " Cibernauta record(s) retrieved."); 
		
		System.out.println("Listing Empleado by Criteria...");
		appventawebbd.EmpleadoCriteria lappventawebbdEmpleadoCriteria = new appventawebbd.EmpleadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lappventawebbdEmpleadoCriteria.id.eq();
		lappventawebbdEmpleadoCriteria.setMaxResults(ROW_COUNT);
		appventawebbd.Empleado[] appventawebbdEmpleados = lappventawebbdEmpleadoCriteria.listEmpleado();
		length =appventawebbdEmpleados== null ? 0 : Math.min(appventawebbdEmpleados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(appventawebbdEmpleados[i]);
		}
		System.out.println(length + " Empleado record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		appventawebbd.AdministradorCriteria lappventawebbdAdministradorCriteria = new appventawebbd.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lappventawebbdAdministradorCriteria.id.eq();
		lappventawebbdAdministradorCriteria.setMaxResults(ROW_COUNT);
		appventawebbd.Administrador[] appventawebbdAdministradors = lappventawebbdAdministradorCriteria.listAdministrador();
		length =appventawebbdAdministradors== null ? 0 : Math.min(appventawebbdAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(appventawebbdAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing Encargado by Criteria...");
		appventawebbd.EncargadoCriteria lappventawebbdEncargadoCriteria = new appventawebbd.EncargadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lappventawebbdEncargadoCriteria.id.eq();
		lappventawebbdEncargadoCriteria.setMaxResults(ROW_COUNT);
		appventawebbd.Encargado[] appventawebbdEncargados = lappventawebbdEncargadoCriteria.listEncargado();
		length =appventawebbdEncargados== null ? 0 : Math.min(appventawebbdEncargados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(appventawebbdEncargados[i]);
		}
		System.out.println(length + " Encargado record(s) retrieved."); 
		
		System.out.println("Listing Transportista by Criteria...");
		appventawebbd.TransportistaCriteria lappventawebbdTransportistaCriteria = new appventawebbd.TransportistaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lappventawebbdTransportistaCriteria.id.eq();
		lappventawebbdTransportistaCriteria.setMaxResults(ROW_COUNT);
		appventawebbd.Transportista[] appventawebbdTransportistas = lappventawebbdTransportistaCriteria.listTransportista();
		length =appventawebbdTransportistas== null ? 0 : Math.min(appventawebbdTransportistas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(appventawebbdTransportistas[i]);
		}
		System.out.println(length + " Transportista record(s) retrieved."); 
		
		System.out.println("Listing Item by Criteria...");
		appventawebbd.ItemCriteria lappventawebbdItemCriteria = new appventawebbd.ItemCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lappventawebbdItemCriteria.ID.eq();
		lappventawebbdItemCriteria.setMaxResults(ROW_COUNT);
		appventawebbd.Item[] appventawebbdItems = lappventawebbdItemCriteria.listItem();
		length =appventawebbdItems== null ? 0 : Math.min(appventawebbdItems.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(appventawebbdItems[i]);
		}
		System.out.println(length + " Item record(s) retrieved."); 
		
		System.out.println("Listing Foto by Criteria...");
		appventawebbd.FotoCriteria lappventawebbdFotoCriteria = new appventawebbd.FotoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lappventawebbdFotoCriteria.id.eq();
		lappventawebbdFotoCriteria.setMaxResults(ROW_COUNT);
		appventawebbd.Foto[] appventawebbdFotos = lappventawebbdFotoCriteria.listFoto();
		length =appventawebbdFotos== null ? 0 : Math.min(appventawebbdFotos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(appventawebbdFotos[i]);
		}
		System.out.println(length + " Foto record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListAppventawebData listAppventawebData = new ListAppventawebData();
			try {
				listAppventawebData.listTestData();
				//listAppventawebData.listByCriteria();
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
