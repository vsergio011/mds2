/**
 * Licensee: antonioofdzj(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteAppventawebData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = appventawebbd.AppventawebPersistentManager.instance().getSession().beginTransaction();
		try {
			appventawebbd.Usuario lappventawebbdUsuario = appventawebbd.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			appventawebbd.UsuarioDAO.delete(lappventawebbdUsuario);
			appventawebbd.Pedido lappventawebbdPedido = appventawebbd.PedidoDAO.loadPedidoByQuery(null, null);
			// Delete the persistent object
			appventawebbd.PedidoDAO.delete(lappventawebbdPedido);
			appventawebbd.Comentario lappventawebbdComentario = appventawebbd.ComentarioDAO.loadComentarioByQuery(null, null);
			// Delete the persistent object
			appventawebbd.ComentarioDAO.delete(lappventawebbdComentario);
			appventawebbd.Producto lappventawebbdProducto = appventawebbd.ProductoDAO.loadProductoByQuery(null, null);
			// Delete the persistent object
			appventawebbd.ProductoDAO.delete(lappventawebbdProducto);
			appventawebbd.Categoria lappventawebbdCategoria = appventawebbd.CategoriaDAO.loadCategoriaByQuery(null, null);
			// Delete the persistent object
			appventawebbd.CategoriaDAO.delete(lappventawebbdCategoria);
			appventawebbd.Mensaje lappventawebbdMensaje = appventawebbd.MensajeDAO.loadMensajeByQuery(null, null);
			// Delete the persistent object
			appventawebbd.MensajeDAO.delete(lappventawebbdMensaje);
			appventawebbd.Pendiente lappventawebbdPendiente = appventawebbd.PendienteDAO.loadPendienteByQuery(null, null);
			// Delete the persistent object
			appventawebbd.PendienteDAO.delete(lappventawebbdPendiente);
			appventawebbd.Enviado lappventawebbdEnviado = appventawebbd.EnviadoDAO.loadEnviadoByQuery(null, null);
			// Delete the persistent object
			appventawebbd.EnviadoDAO.delete(lappventawebbdEnviado);
			appventawebbd.Entregado lappventawebbdEntregado = appventawebbd.EntregadoDAO.loadEntregadoByQuery(null, null);
			// Delete the persistent object
			appventawebbd.EntregadoDAO.delete(lappventawebbdEntregado);
			appventawebbd.Oferta lappventawebbdOferta = appventawebbd.OfertaDAO.loadOfertaByQuery(null, null);
			// Delete the persistent object
			appventawebbd.OfertaDAO.delete(lappventawebbdOferta);
			appventawebbd.Cibernauta lappventawebbdCibernauta = appventawebbd.CibernautaDAO.loadCibernautaByQuery(null, null);
			// Delete the persistent object
			appventawebbd.CibernautaDAO.delete(lappventawebbdCibernauta);
			appventawebbd.Empleado lappventawebbdEmpleado = appventawebbd.EmpleadoDAO.loadEmpleadoByQuery(null, null);
			// Delete the persistent object
			appventawebbd.EmpleadoDAO.delete(lappventawebbdEmpleado);
			appventawebbd.Administrador lappventawebbdAdministrador = appventawebbd.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			appventawebbd.AdministradorDAO.delete(lappventawebbdAdministrador);
			appventawebbd.Encargado lappventawebbdEncargado = appventawebbd.EncargadoDAO.loadEncargadoByQuery(null, null);
			// Delete the persistent object
			appventawebbd.EncargadoDAO.delete(lappventawebbdEncargado);
			appventawebbd.Transportista lappventawebbdTransportista = appventawebbd.TransportistaDAO.loadTransportistaByQuery(null, null);
			// Delete the persistent object
			appventawebbd.TransportistaDAO.delete(lappventawebbdTransportista);
			appventawebbd.Item lappventawebbdItem = appventawebbd.ItemDAO.loadItemByQuery(null, null);
			// Delete the persistent object
			appventawebbd.ItemDAO.delete(lappventawebbdItem);
			appventawebbd.Foto lappventawebbdFoto = appventawebbd.FotoDAO.loadFotoByQuery(null, null);
			// Delete the persistent object
			appventawebbd.FotoDAO.delete(lappventawebbdFoto);
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
				appventawebbd.AppventawebPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
