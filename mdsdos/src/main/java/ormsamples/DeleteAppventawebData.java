/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteAppventawebData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = Diagrama_BD.AppventawebPersistentManager.instance().getSession().beginTransaction();
		try {
			Diagrama_BD.Usuario diagrama_BDUsuario = Diagrama_BD.Usuario.loadUsuarioByQuery(null, null);
			diagrama_BDUsuario.delete();
			Diagrama_BD.Pedido diagrama_BDPedido = Diagrama_BD.Pedido.loadPedidoByQuery(null, null);
			diagrama_BDPedido.delete();
			Diagrama_BD.Comentario diagrama_BDComentario = Diagrama_BD.Comentario.loadComentarioByQuery(null, null);
			diagrama_BDComentario.delete();
			Diagrama_BD.Producto diagrama_BDProducto = Diagrama_BD.Producto.loadProductoByQuery(null, null);
			diagrama_BDProducto.delete();
			Diagrama_BD.Categoria diagrama_BDCategoria = Diagrama_BD.Categoria.loadCategoriaByQuery(null, null);
			diagrama_BDCategoria.delete();
			Diagrama_BD.Mensaje diagrama_BDMensaje = Diagrama_BD.Mensaje.loadMensajeByQuery(null, null);
			diagrama_BDMensaje.delete();
			Diagrama_BD.Pendiente diagrama_BDPendiente = Diagrama_BD.Pendiente.loadPendienteByQuery(null, null);
			diagrama_BDPendiente.delete();
			Diagrama_BD.Enviado diagrama_BDEnviado = Diagrama_BD.Enviado.loadEnviadoByQuery(null, null);
			diagrama_BDEnviado.delete();
			Diagrama_BD.Entregado diagrama_BDEntregado = Diagrama_BD.Entregado.loadEntregadoByQuery(null, null);
			diagrama_BDEntregado.delete();
			Diagrama_BD.Oferta diagrama_BDOferta = Diagrama_BD.Oferta.loadOfertaByQuery(null, null);
			diagrama_BDOferta.delete();
			Diagrama_BD.Cibernauta diagrama_BDCibernauta = Diagrama_BD.Cibernauta.loadCibernautaByQuery(null, null);
			diagrama_BDCibernauta.delete();
			Diagrama_BD.Empleado diagrama_BDEmpleado = Diagrama_BD.Empleado.loadEmpleadoByQuery(null, null);
			diagrama_BDEmpleado.delete();
			Diagrama_BD.Administrador diagrama_BDAdministrador = Diagrama_BD.Administrador.loadAdministradorByQuery(null, null);
			diagrama_BDAdministrador.delete();
			Diagrama_BD.Encargado diagrama_BDEncargado = Diagrama_BD.Encargado.loadEncargadoByQuery(null, null);
			diagrama_BDEncargado.delete();
			Diagrama_BD.Transportista diagrama_BDTransportista = Diagrama_BD.Transportista.loadTransportistaByQuery(null, null);
			diagrama_BDTransportista.delete();
			Diagrama_BD.Item diagrama_BDItem = Diagrama_BD.Item.loadItemByQuery(null, null);
			diagrama_BDItem.delete();
			Diagrama_BD.Foto diagrama_BDFoto = Diagrama_BD.Foto.loadFotoByQuery(null, null);
			diagrama_BDFoto.delete();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteAppventawebData deleteAppventawebData = new DeleteAppventawebData();
			try {
				deleteAppventawebData.deleteTestData();
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
