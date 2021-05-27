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

	public void cambiar_contrasena(int idCiber, String aNewContrasen) {
		try {
			_bd_ciber.cambiar_contrasena(idCiber, aNewContrasen);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	public appventawebbd.Producto modificarProducto(Producto aProducto, List<String> fotos) {
		try {
			return _bd_prod.modificarProducto(aProducto, fotos);
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

	public List<Pendiente> listadoComprasPendientes(int aIdCiber) {
		try {
			return _bd_pend.listadoComprasPendientes(aIdCiber);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<Entregado> listadoComprasEntregadas(int aIdCiber) {
		try {
			return _bd_entr.listadoComprasEntregadas(aIdCiber);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<appventawebbd.Enviado> listadoComprasEnviadas(int aIdCiber) {
		try {
			return _bd_env.listadoComprasEnviadas(aIdCiber);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void anadirAOferta(int aIdProducto, Oferta aOferta) {
		try {
			_bd_oferta.anadirAOferta(aIdProducto, aOferta);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void quitarProductoOferta(int aIdProducto) {
		try {
			_bd_oferta.quitarProductoOferta(aIdProducto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	public Mensaje detalleMensaje(int aId) {
		throw new UnsupportedOperationException();
	}

	public void nuevaNotificacion(int aOrigen, int aDestino, Mensaje aMensaje) {
		throw new UnsupportedOperationException();
	}

	public void modificarDatos(int idCiber, appventawebbd.Cibernauta aCiber) {
		try {
			_bd_ciber.modificarDatos(idCiber, aCiber);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		try {
			_bd_ciber.borrarCuenta(aIdCiber);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void cambiarImagen(int aIdCiber, String aImagen) {
		throw new UnsupportedOperationException();
	}

	public void comentarProducto(Producto aIdProduct, Comentario aComentario) {
		try {
			_bd_com.comentarProducto(aIdProduct, aComentario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean isPedidoEnviado(int aId) {
		try {
			return _bd_env.isPedidoEnviado(aId);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public void cambioDatosCompra(String aDireccion, String aFormapago, int aIdPedido) {
		throw new UnsupportedOperationException();
	}

	public Pendiente getPedidoPendiente(int aId) {
		try {
			return _bd_pend.getPedidoPendiente(aId);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Enviado getPedidoEnviado(int aId) {
		try {
			return _bd_env.getPedidoEnviado(aId);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Entregado getPedidoEntregado(int aId) {
		try {
			return _bd_entr.getPedidoEntregado(aId);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Item[] getItemsPedido(int aIdPedido) {
		throw new UnsupportedOperationException();
	}

	public Producto[] getProductos(int[] aIdItems) {
		throw new UnsupportedOperationException();
	}

	public void cancelarCompra(Pendiente pedido) {
		try {
			_bd_pend.cancelarCompra(pedido);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	public appventawebbd.Usuario getUsuarioLogin(String aUser) {
		try {
			return _bd_ciber.Login(aUser);
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

	public Pendiente RealizaCompra(List<Item> aItems, Cibernauta aCiber) {
		try {
			return _bd_pend.RealizaCompra(aItems, aCiber);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void AddPedidoEnviado(Pedido pedido, Transportista transportista) {
		try {
			_bd_env.AddPedidoEnviado(pedido, transportista);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void AddPedidoEntregado(Pedido pedido) {
		try {
			_bd_entr.AddPedidoEntregado(pedido);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Pendiente> listadoComprasPendientes() {
		try {
			return _bd_pend.listadoComprasPendientes();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<Entregado> listadoComprasEntregadas() {
		try {
			return _bd_entr.listadoComprasEntregadas();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<Enviado> listadoComprasEnviadas() {
		try {
			return _bd_env.listadoComprasEnviadas();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Oferta estaEnOferta(int idProducto) {
		try {
			return _bd_oferta.estaEnOferta(idProducto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}