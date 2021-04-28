package bds;

import Diagrama_BD.Categoria;
import Diagrama_BD.Comentario;
import Diagrama_BD.Oferta;
import Diagrama_BD.Producto;
import Diagrama_BD.Foto;
import Diagrama_BD.Empleado;
// import Diagrama_BD.Encargado;
import Diagrama_BD.Pedido;
import Diagrama_BD.Item;
import Diagrama_BD.Pendiente;
import Diagrama_BD.Entregado;
import Diagrama_BD.Enviado;
import Diagrama_BD.Mensaje;
// import Diagrama_BD.Cibernauta;
import Diagrama_BD.Usuario;
// import interfaz.Cibernauta;
import Diagrama_BD.Administrador;
import Diagrama_BD.Transportista;
// import interfaz.Encargado;
/*import interfaz.Cibernauta_Registrado;
import interfaz.Cibernauta_no_Registrado;*/

public class BDPrincipal implements iCibernauta, iAdministrador, iTransportista, iEncargado, iCibernauta_Registrado, iCibernauta_no_Registrado {
	public BD_Categoria _bd_cat;
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

	public Categoria[] listCategorias() {
		throw new UnsupportedOperationException();
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

	public void modificarEmpleado(Diagrama_BD.Encargado aEmpleado) {
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

	public void modificarDatos(Diagrama_BD.Cibernauta aCiber) {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] getMensajes(int aId) {
		throw new UnsupportedOperationException();
	}

	public Diagrama_BD.Cibernauta getCibernauta(int aId) {
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

	public Diagrama_BD.Cibernauta getUsuarioLogin(String aUser, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public void registro(Usuario aUser) {
		throw new UnsupportedOperationException();
	}

	/*public interfaz.Cibernauta get_Cibernauta() {
		throw new UnsupportedOperationException();
	}*/

	public Administrador get_Administrador() {
		throw new UnsupportedOperationException();
	}

	public Transportista get_Transportista() {
		throw new UnsupportedOperationException();
	}

	/*public interfaz.Encargado get_Encargado() {
		throw new UnsupportedOperationException();
	}

	public Cibernauta_Registrado get_Cibernauta_Registrado() {
		throw new UnsupportedOperationException();
	}

	public Cibernauta_no_Registrado get_Cibernauta_no_Registrado() {
		throw new UnsupportedOperationException();
	}*/
}