package basededatos;

import appventawebbd.Categoria;
import appventawebbd.Cibernauta;
import appventawebbd.Comentario;
import appventawebbd.Oferta;
import appventawebbd.Producto;
import appventawebbd.Foto;
import appventawebbd.Empleado;
import appventawebbd.Encargado;
// import appventawebbd.Encargado;
import appventawebbd.Pedido;
import appventawebbd.Item;
import appventawebbd.Pendiente;
import appventawebbd.Entregado;
import appventawebbd.Enviado;
import appventawebbd.Mensaje;
// import appventawebbd.Cibernauta;
import appventawebbd.Usuario;

import java.util.List;

import org.orm.PersistentException;

// import interfaz.Cibernauta;
import appventawebbd.Administrador;
import appventawebbd.Transportista;
// import interfaz.Encargado;

public class BDPrincipal implements iCibernauta, iAdministrador, iTransportista, iEncargado, iCibernauta_Registrado, iCibernauta_no_Registrado {
	public BD_Categoria _bd_cat = new BD_Categoria();
	public BD_Producto _bd_prod;
	public BD_Pendiente _bd_pend;
	public BD_Administrador _bd_admin;
	public BD_Comentario _bd_com;
	public BD__Mensaje _bd__mens;
	public BD_Oferta _bd_oferta;
	public BD_Cibernauta _bd_ciber;
	public BD_Encargado _bd_enca;
	public BD_Transportista _bd_trans;
	public BD_Enviado _bd_env;
	public BD_Entregado _bd_entr;
	public BD_Fotos _bd_fotos;
	public BD_Items _bd_items;

	public void cambiar_contrasena(String aEmail, String aNewContrasen) {
		throw new UnsupportedOperationException();
	}

	public List<Categoria> listCategorias() {
		try {
			return _bd_cat.listCategorias();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Comentario[] listComentarios(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public Oferta[] getOfertasPopulares() {
		throw new UnsupportedOperationException();
	}

	public Producto[] getProductosMasVendidos() {
		throw new UnsupportedOperationException();
	}

	public Producto[] listProductos() {
		throw new UnsupportedOperationException();
	}

	public Producto getProducto(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public Foto[] getFotosProducto(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public int altaProducto(Producto aProducto) {
		throw new UnsupportedOperationException();
	}

	public Empleado[] listempleados() {
		throw new UnsupportedOperationException();
	}

	public void modificarEmpleado(appventawebbd.Encargado aEmpleado) {
		throw new UnsupportedOperationException();
	}

	public void cambiar_Imagen_de_Perfil(String aImagen, int aIdEmpleado) {
		throw new UnsupportedOperationException();
	}

	public void transferirAdministrador(int aIdOrigen, int aIdDestino) {
		throw new UnsupportedOperationException();
	}

	public void modificarProducto(Producto aProducto) {
		throw new UnsupportedOperationException();
	}

	public void borrarProducto(int aProducto) {
		throw new UnsupportedOperationException();
	}

	public Empleado[] listEmpleados() {
		throw new UnsupportedOperationException();
	}

	public Pedido getPedido(int aId) {
		throw new UnsupportedOperationException();
	}

	public Item[] getItemsProducto(int aIdPedido) {
		throw new UnsupportedOperationException();
	}

	public Pendiente[] listadoComprasPendientes(int aIdCiber) {
		throw new UnsupportedOperationException();
	}

	public Entregado[] listadoComprasEntregadas(int aIdCiber) {
		throw new UnsupportedOperationException();
	}

	public Enviado[] listadoComprasEnviadas(int aIdCiber) {
		throw new UnsupportedOperationException();
	}

	public void anadirAOferta(int aIdProducto, Oferta aOferta) {
		throw new UnsupportedOperationException();
	}

	public void quitarProductoOferta(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public void addCategoria(Categoria aCategoria) {
		throw new UnsupportedOperationException();
	}

	public void anadirFoto(int aIdProducto, String aImage) {
		throw new UnsupportedOperationException();
	}

	public void RealizarCompra(Producto[] aProductos, int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Mensaje detalleMensaje(int aId) {
		throw new UnsupportedOperationException();
	}

	public void nuevaNotificacion(int aOrigen, int aDestino, Mensaje aMensaje) {
		throw new UnsupportedOperationException();
	}

	public void modificarDatos(appventawebbd.Cibernauta aCiber) {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] getMensajes(int aId) {
		throw new UnsupportedOperationException();
	}

	public appventawebbd.Cibernauta getCibernauta(int aId) {
		throw new UnsupportedOperationException();
	}

	public void borrarCuenta(int aIdCiber) {
		throw new UnsupportedOperationException();
	}

	public void cambiarImagen(int aIdCiber, String aImagen) {
		throw new UnsupportedOperationException();
	}

	public void comentarProducto(int aIdProduct, Comentario aComentario) {
		throw new UnsupportedOperationException();
	}

	public boolean isPedidoEnviado(int aId) {
		throw new UnsupportedOperationException();
	}

	public void cambioDatosCompra(String aDireccion, String aFormapago, int aIdPedido) {
		throw new UnsupportedOperationException();
	}

	public Pendiente getPedidoPendiente(int aId) {
		throw new UnsupportedOperationException();
	}

	public Enviado getPedidoEnviado(int aId) {
		throw new UnsupportedOperationException();
	}

	public void getPedidoEntregado(int aId) {
		throw new UnsupportedOperationException();
	}

	public Item[] getItemsPedido(int aIdPedido) {
		throw new UnsupportedOperationException();
	}

	public Producto[] getProductos(int[] aIdItems) {
		throw new UnsupportedOperationException();
	}

	public void cancelarCompra(int aIdCiber, int aIdCompra) {
		throw new UnsupportedOperationException();
	}

	public boolean Login(String aUsuario, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public void Registrar(String aNombre, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public boolean existeUsuario(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public appventawebbd.Cibernauta getUsuarioLogin(String aUser, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public void registro(Usuario aUser) {
		throw new UnsupportedOperationException();
	}

	public Cibernauta get_Cibernauta() {
		throw new UnsupportedOperationException();
	}

	public Administrador get_Administrador() {
		throw new UnsupportedOperationException();
	}

	public Transportista get_Transportista() {
		throw new UnsupportedOperationException();
	}

	public Encargado get_Encargado() {
		throw new UnsupportedOperationException();
	}

	public Cibernauta get_Cibernauta_Registrado() {
		throw new UnsupportedOperationException();
	}

	public Cibernauta get_Cibernauta_no_Registrado() {
		throw new UnsupportedOperationException();
	}
}