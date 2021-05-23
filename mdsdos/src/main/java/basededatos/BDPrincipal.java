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
	public BD_Producto _bd_prod = new BD_Producto();
	public BD_Pendiente _bd_pend = new BD_Pendiente();
	public BD_Administrador _bd_admin = new BD_Administrador();
	public BD_Comentario _bd_com = new BD_Comentario();
	public BD__Mensaje _bd__mens = new BD__Mensaje();
	public BD_Oferta _bd_oferta = new BD_Oferta();
	public BD_Cibernauta _bd_ciber = new BD_Cibernauta();
	public BD_Encargado _bd_enca = new BD_Encargado();
	public BD_Transportista _bd_trans = new BD_Transportista();
	public BD_Enviado _bd_env = new BD_Enviado();
	public BD_Entregado _bd_entr = new BD_Entregado();
	public BD_Fotos _bd_fotos = new BD_Fotos();
	public BD_Items _bd_items = new BD_Items();

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

	public List<Oferta> getOfertasPopulares() {
		try {
			return _bd_oferta.listOfertas();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<Producto> getProductosMasVendidos() {
		try {
			return _bd_prod.listProductos();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<Producto> listProductos() {
		try {
			return _bd_prod.listProductos();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Producto getProducto(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public Foto[] getFotosProducto(int aIdProducto) {
		throw new UnsupportedOperationException();
	}

	public appventawebbd.Producto altaProducto(Producto aProducto) {
		try {
			return _bd_prod.altaProducto(aProducto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<Empleado> listempleados() {
		try {
			return _bd_admin.listEmpleados();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
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

	public appventawebbd.Producto modificarProducto(Producto aProducto) {
		try {
			return _bd_prod.modificarProducto(aProducto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void borrarProducto(appventawebbd.Producto aProducto) {
		try {
			_bd_prod.borrarProducto(aProducto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	public appventawebbd.Categoria addCategoria(Categoria aCategoria) {
		try {
			return _bd_cat.addCategoria(aCategoria);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void anadirFoto(int aIdProducto, String aImage) {
		try {
			_bd_prod.anadirFoto(aIdProducto, aImage);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		try {
			return _bd_ciber.getCibernauta(aId);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
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

	public Cibernauta Registrar(
			String aNombre,
			String apellidos,
			String email,
			String foto,
			String direccion,
			String formaPago,
			String usuario, 
			String aPassword) {
		try {
			return _bd_ciber.Registrar(
					aNombre,
					apellidos,
					email,
					foto,
					direccion,
					formaPago,
					usuario, 
					aPassword);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public boolean existeUsuario(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public appventawebbd.Cibernauta getUsuarioLogin(String aUser, String aPassword) {
		try {
			return _bd_ciber.Login(aUser, aPassword);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
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

	public Usuario getUsuarioEmail(String email) {
		try {
			return _bd_ciber.getUsuarioEmail(email);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void nuevaNotificacion(Usuario remitente, Usuario destinatario, String asunto, String cuerpo) {
		try {
			_bd__mens.nuevaNotificacion(remitente, destinatario, asunto, cuerpo);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}