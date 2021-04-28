/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateAppventawebData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = Diagrama_BD.AppventawebPersistentManager.instance().getSession().beginTransaction();
		try {
			Diagrama_BD.Usuario diagrama_BDUsuario = Diagrama_BD.Usuario.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : mensajesRecibidos, mensajesEnviados, operativo
			diagrama_BDUsuario.save();
			Diagrama_BD.Pedido diagrama_BDPedido = Diagrama_BD.Pedido.createPedido();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : items, total, cibernauta
			diagrama_BDPedido.save();
			Diagrama_BD.Comentario diagrama_BDComentario = Diagrama_BD.Comentario.createComentario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : valoracion, producto, cibernauta
			diagrama_BDComentario.save();
			Diagrama_BD.Producto diagrama_BDProducto = Diagrama_BD.Producto.createProducto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : fotosProducto, items, ofertas, comentarios, valoracionMedia, precio, categoria
			diagrama_BDProducto.save();
			Diagrama_BD.Categoria diagrama_BDCategoria = Diagrama_BD.Categoria.createCategoria();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : productos
			diagrama_BDCategoria.save();
			Diagrama_BD.Mensaje diagrama_BDMensaje = Diagrama_BD.Mensaje.createMensaje();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : remitente, destinatario
			diagrama_BDMensaje.save();
			Diagrama_BD.Pendiente diagrama_BDPendiente = Diagrama_BD.Pendiente.createPendiente();
			// Initialize the properties of the persistent object here
			diagrama_BDPendiente.save();
			Diagrama_BD.Enviado diagrama_BDEnviado = Diagrama_BD.Enviado.createEnviado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : transportista
			diagrama_BDEnviado.save();
			Diagrama_BD.Entregado diagrama_BDEntregado = Diagrama_BD.Entregado.createEntregado();
			// Initialize the properties of the persistent object here
			diagrama_BDEntregado.save();
			Diagrama_BD.Oferta diagrama_BDOferta = Diagrama_BD.Oferta.createOferta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : precio, producto
			diagrama_BDOferta.save();
			Diagrama_BD.Cibernauta diagrama_BDCibernauta = Diagrama_BD.Cibernauta.createCibernauta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : comentario, pedidos
			diagrama_BDCibernauta.save();
			Diagrama_BD.Empleado diagrama_BDEmpleado = Diagrama_BD.Empleado.createEmpleado();
			// Initialize the properties of the persistent object here
			diagrama_BDEmpleado.save();
			Diagrama_BD.Administrador diagrama_BDAdministrador = Diagrama_BD.Administrador.createAdministrador();
			// Initialize the properties of the persistent object here
			diagrama_BDAdministrador.save();
			Diagrama_BD.Encargado diagrama_BDEncargado = Diagrama_BD.Encargado.createEncargado();
			// Initialize the properties of the persistent object here
			diagrama_BDEncargado.save();
			Diagrama_BD.Transportista diagrama_BDTransportista = Diagrama_BD.Transportista.createTransportista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : enviados
			diagrama_BDTransportista.save();
			Diagrama_BD.Item diagrama_BDItem = Diagrama_BD.Item.createItem();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cantidad, idPedido, idProducto, producto, pedido
			diagrama_BDItem.save();
			Diagrama_BD.Foto diagrama_BDFoto = Diagrama_BD.Foto.createFoto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : productoFoto
			diagrama_BDFoto.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateAppventawebData createAppventawebData = new CreateAppventawebData();
			try {
				createAppventawebData.createTestData();
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
