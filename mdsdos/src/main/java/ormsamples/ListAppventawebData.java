/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListAppventawebData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Usuario...");
		Diagrama_BD.Usuario[] diagrama_BDUsuarios = Diagrama_BD.Usuario.listUsuarioByQuery(null, null);
		int length = Math.min(diagrama_BDUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Pedido...");
		Diagrama_BD.Pedido[] diagrama_BDPedidos = Diagrama_BD.Pedido.listPedidoByQuery(null, null);
		length = Math.min(diagrama_BDPedidos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDPedidos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Comentario...");
		Diagrama_BD.Comentario[] diagrama_BDComentarios = Diagrama_BD.Comentario.listComentarioByQuery(null, null);
		length = Math.min(diagrama_BDComentarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDComentarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Producto...");
		Diagrama_BD.Producto[] diagrama_BDProductos = Diagrama_BD.Producto.listProductoByQuery(null, null);
		length = Math.min(diagrama_BDProductos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDProductos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Categoria...");
		Diagrama_BD.Categoria[] diagrama_BDCategorias = Diagrama_BD.Categoria.listCategoriaByQuery(null, null);
		length = Math.min(diagrama_BDCategorias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDCategorias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Mensaje...");
		Diagrama_BD.Mensaje[] diagrama_BDMensajes = Diagrama_BD.Mensaje.listMensajeByQuery(null, null);
		length = Math.min(diagrama_BDMensajes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDMensajes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Pendiente...");
		Diagrama_BD.Pendiente[] diagrama_BDPendientes = Diagrama_BD.Pendiente.listPendienteByQuery(null, null);
		length = Math.min(diagrama_BDPendientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDPendientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Enviado...");
		Diagrama_BD.Enviado[] diagrama_BDEnviados = Diagrama_BD.Enviado.listEnviadoByQuery(null, null);
		length = Math.min(diagrama_BDEnviados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDEnviados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Entregado...");
		Diagrama_BD.Entregado[] diagrama_BDEntregados = Diagrama_BD.Entregado.listEntregadoByQuery(null, null);
		length = Math.min(diagrama_BDEntregados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDEntregados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Oferta...");
		Diagrama_BD.Oferta[] diagrama_BDOfertas = Diagrama_BD.Oferta.listOfertaByQuery(null, null);
		length = Math.min(diagrama_BDOfertas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDOfertas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cibernauta...");
		Diagrama_BD.Cibernauta[] diagrama_BDCibernautas = Diagrama_BD.Cibernauta.listCibernautaByQuery(null, null);
		length = Math.min(diagrama_BDCibernautas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDCibernautas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Empleado...");
		Diagrama_BD.Empleado[] diagrama_BDEmpleados = Diagrama_BD.Empleado.listEmpleadoByQuery(null, null);
		length = Math.min(diagrama_BDEmpleados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDEmpleados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		Diagrama_BD.Administrador[] diagrama_BDAdministradors = Diagrama_BD.Administrador.listAdministradorByQuery(null, null);
		length = Math.min(diagrama_BDAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Encargado...");
		Diagrama_BD.Encargado[] diagrama_BDEncargados = Diagrama_BD.Encargado.listEncargadoByQuery(null, null);
		length = Math.min(diagrama_BDEncargados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDEncargados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Transportista...");
		Diagrama_BD.Transportista[] diagrama_BDTransportistas = Diagrama_BD.Transportista.listTransportistaByQuery(null, null);
		length = Math.min(diagrama_BDTransportistas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDTransportistas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Item...");
		Diagrama_BD.Item[] diagrama_BDItems = Diagrama_BD.Item.listItemByQuery(null, null);
		length = Math.min(diagrama_BDItems.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDItems[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Foto...");
		Diagrama_BD.Foto[] diagrama_BDFotos = Diagrama_BD.Foto.listFotoByQuery(null, null);
		length = Math.min(diagrama_BDFotos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_BDFotos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Usuario by Criteria...");
		Diagrama_BD.UsuarioCriteria diagrama_BDUsuarioCriteria = new Diagrama_BD.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDUsuarioCriteria.id.eq();
		diagrama_BDUsuarioCriteria.setMaxResults(ROW_COUNT);
		Diagrama_BD.Usuario[] diagrama_BDUsuarios = diagrama_BDUsuarioCriteria.listUsuario();
		int length =diagrama_BDUsuarios== null ? 0 : Math.min(diagrama_BDUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Pedido by Criteria...");
		Diagrama_BD.PedidoCriteria diagrama_BDPedidoCriteria = new Diagrama_BD.PedidoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDPedidoCriteria.id.eq();
		diagrama_BDPedidoCriteria.setMaxResults(ROW_COUNT);
		Diagrama_BD.Pedido[] diagrama_BDPedidos = diagrama_BDPedidoCriteria.listPedido();
		length =diagrama_BDPedidos== null ? 0 : Math.min(diagrama_BDPedidos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDPedidos[i]);
		}
		System.out.println(length + " Pedido record(s) retrieved."); 
		
		System.out.println("Listing Comentario by Criteria...");
		Diagrama_BD.ComentarioCriteria diagrama_BDComentarioCriteria = new Diagrama_BD.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDComentarioCriteria.id.eq();
		diagrama_BDComentarioCriteria.setMaxResults(ROW_COUNT);
		Diagrama_BD.Comentario[] diagrama_BDComentarios = diagrama_BDComentarioCriteria.listComentario();
		length =diagrama_BDComentarios== null ? 0 : Math.min(diagrama_BDComentarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDComentarios[i]);
		}
		System.out.println(length + " Comentario record(s) retrieved."); 
		
		System.out.println("Listing Producto by Criteria...");
		Diagrama_BD.ProductoCriteria diagrama_BDProductoCriteria = new Diagrama_BD.ProductoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDProductoCriteria.id.eq();
		diagrama_BDProductoCriteria.setMaxResults(ROW_COUNT);
		Diagrama_BD.Producto[] diagrama_BDProductos = diagrama_BDProductoCriteria.listProducto();
		length =diagrama_BDProductos== null ? 0 : Math.min(diagrama_BDProductos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDProductos[i]);
		}
		System.out.println(length + " Producto record(s) retrieved."); 
		
		System.out.println("Listing Categoria by Criteria...");
		Diagrama_BD.CategoriaCriteria diagrama_BDCategoriaCriteria = new Diagrama_BD.CategoriaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDCategoriaCriteria.id.eq();
		diagrama_BDCategoriaCriteria.setMaxResults(ROW_COUNT);
		Diagrama_BD.Categoria[] diagrama_BDCategorias = diagrama_BDCategoriaCriteria.listCategoria();
		length =diagrama_BDCategorias== null ? 0 : Math.min(diagrama_BDCategorias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDCategorias[i]);
		}
		System.out.println(length + " Categoria record(s) retrieved."); 
		
		System.out.println("Listing Mensaje by Criteria...");
		Diagrama_BD.MensajeCriteria diagrama_BDMensajeCriteria = new Diagrama_BD.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDMensajeCriteria.id.eq();
		diagrama_BDMensajeCriteria.setMaxResults(ROW_COUNT);
		Diagrama_BD.Mensaje[] diagrama_BDMensajes = diagrama_BDMensajeCriteria.listMensaje();
		length =diagrama_BDMensajes== null ? 0 : Math.min(diagrama_BDMensajes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDMensajes[i]);
		}
		System.out.println(length + " Mensaje record(s) retrieved."); 
		
		System.out.println("Listing Pendiente by Criteria...");
		Diagrama_BD.PendienteCriteria diagrama_BDPendienteCriteria = new Diagrama_BD.PendienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDPendienteCriteria.id.eq();
		diagrama_BDPendienteCriteria.setMaxResults(ROW_COUNT);
		Diagrama_BD.Pendiente[] diagrama_BDPendientes = diagrama_BDPendienteCriteria.listPendiente();
		length =diagrama_BDPendientes== null ? 0 : Math.min(diagrama_BDPendientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDPendientes[i]);
		}
		System.out.println(length + " Pendiente record(s) retrieved."); 
		
		System.out.println("Listing Enviado by Criteria...");
		Diagrama_BD.EnviadoCriteria diagrama_BDEnviadoCriteria = new Diagrama_BD.EnviadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDEnviadoCriteria.id.eq();
		diagrama_BDEnviadoCriteria.setMaxResults(ROW_COUNT);
		Diagrama_BD.Enviado[] diagrama_BDEnviados = diagrama_BDEnviadoCriteria.listEnviado();
		length =diagrama_BDEnviados== null ? 0 : Math.min(diagrama_BDEnviados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDEnviados[i]);
		}
		System.out.println(length + " Enviado record(s) retrieved."); 
		
		System.out.println("Listing Entregado by Criteria...");
		Diagrama_BD.EntregadoCriteria diagrama_BDEntregadoCriteria = new Diagrama_BD.EntregadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDEntregadoCriteria.id.eq();
		diagrama_BDEntregadoCriteria.setMaxResults(ROW_COUNT);
		Diagrama_BD.Entregado[] diagrama_BDEntregados = diagrama_BDEntregadoCriteria.listEntregado();
		length =diagrama_BDEntregados== null ? 0 : Math.min(diagrama_BDEntregados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDEntregados[i]);
		}
		System.out.println(length + " Entregado record(s) retrieved."); 
		
		System.out.println("Listing Oferta by Criteria...");
		Diagrama_BD.OfertaCriteria diagrama_BDOfertaCriteria = new Diagrama_BD.OfertaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDOfertaCriteria.id.eq();
		diagrama_BDOfertaCriteria.setMaxResults(ROW_COUNT);
		Diagrama_BD.Oferta[] diagrama_BDOfertas = diagrama_BDOfertaCriteria.listOferta();
		length =diagrama_BDOfertas== null ? 0 : Math.min(diagrama_BDOfertas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDOfertas[i]);
		}
		System.out.println(length + " Oferta record(s) retrieved."); 
		
		System.out.println("Listing Cibernauta by Criteria...");
		Diagrama_BD.CibernautaCriteria diagrama_BDCibernautaCriteria = new Diagrama_BD.CibernautaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDCibernautaCriteria.id.eq();
		diagrama_BDCibernautaCriteria.setMaxResults(ROW_COUNT);
		Diagrama_BD.Cibernauta[] diagrama_BDCibernautas = diagrama_BDCibernautaCriteria.listCibernauta();
		length =diagrama_BDCibernautas== null ? 0 : Math.min(diagrama_BDCibernautas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDCibernautas[i]);
		}
		System.out.println(length + " Cibernauta record(s) retrieved."); 
		
		System.out.println("Listing Empleado by Criteria...");
		Diagrama_BD.EmpleadoCriteria diagrama_BDEmpleadoCriteria = new Diagrama_BD.EmpleadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDEmpleadoCriteria.id.eq();
		diagrama_BDEmpleadoCriteria.setMaxResults(ROW_COUNT);
		Diagrama_BD.Empleado[] diagrama_BDEmpleados = diagrama_BDEmpleadoCriteria.listEmpleado();
		length =diagrama_BDEmpleados== null ? 0 : Math.min(diagrama_BDEmpleados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDEmpleados[i]);
		}
		System.out.println(length + " Empleado record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		Diagrama_BD.AdministradorCriteria diagrama_BDAdministradorCriteria = new Diagrama_BD.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDAdministradorCriteria.id.eq();
		diagrama_BDAdministradorCriteria.setMaxResults(ROW_COUNT);
		Diagrama_BD.Administrador[] diagrama_BDAdministradors = diagrama_BDAdministradorCriteria.listAdministrador();
		length =diagrama_BDAdministradors== null ? 0 : Math.min(diagrama_BDAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing Encargado by Criteria...");
		Diagrama_BD.EncargadoCriteria diagrama_BDEncargadoCriteria = new Diagrama_BD.EncargadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDEncargadoCriteria.id.eq();
		diagrama_BDEncargadoCriteria.setMaxResults(ROW_COUNT);
		Diagrama_BD.Encargado[] diagrama_BDEncargados = diagrama_BDEncargadoCriteria.listEncargado();
		length =diagrama_BDEncargados== null ? 0 : Math.min(diagrama_BDEncargados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDEncargados[i]);
		}
		System.out.println(length + " Encargado record(s) retrieved."); 
		
		System.out.println("Listing Transportista by Criteria...");
		Diagrama_BD.TransportistaCriteria diagrama_BDTransportistaCriteria = new Diagrama_BD.TransportistaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDTransportistaCriteria.id.eq();
		diagrama_BDTransportistaCriteria.setMaxResults(ROW_COUNT);
		Diagrama_BD.Transportista[] diagrama_BDTransportistas = diagrama_BDTransportistaCriteria.listTransportista();
		length =diagrama_BDTransportistas== null ? 0 : Math.min(diagrama_BDTransportistas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDTransportistas[i]);
		}
		System.out.println(length + " Transportista record(s) retrieved."); 
		
		System.out.println("Listing Item by Criteria...");
		Diagrama_BD.ItemCriteria diagrama_BDItemCriteria = new Diagrama_BD.ItemCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDItemCriteria.ID.eq();
		diagrama_BDItemCriteria.setMaxResults(ROW_COUNT);
		Diagrama_BD.Item[] diagrama_BDItems = diagrama_BDItemCriteria.listItem();
		length =diagrama_BDItems== null ? 0 : Math.min(diagrama_BDItems.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDItems[i]);
		}
		System.out.println(length + " Item record(s) retrieved."); 
		
		System.out.println("Listing Foto by Criteria...");
		Diagrama_BD.FotoCriteria diagrama_BDFotoCriteria = new Diagrama_BD.FotoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_BDFotoCriteria.id.eq();
		diagrama_BDFotoCriteria.setMaxResults(ROW_COUNT);
		Diagrama_BD.Foto[] diagrama_BDFotos = diagrama_BDFotoCriteria.listFoto();
		length =diagrama_BDFotos== null ? 0 : Math.min(diagrama_BDFotos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_BDFotos[i]);
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
				Diagrama_BD.AppventawebPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
