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

import java.util.ArrayList;
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
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
	}

	public List<Categoria> listCategorias() {
		try {
			return _bd_cat.listCategorias();
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return new ArrayList<Categoria>();
	}

	public Comentario[] listComentarios(int aIdProducto) {
		Comentario[] coment = {};
		try {
			coment = _bd_com.listComentarios(aIdProducto);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return coment;
	}

	public List<Oferta> getOfertasPopulares() {
		try {
			return _bd_oferta.listOfertas();
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return new ArrayList<Oferta>();
	}

	public List<Producto> getProductosMasVendidos() {
		try {
			return _bd_prod.listProductos();
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return new ArrayList<Producto>();
	}

	public List<Producto> listProductos() {
		try {
			return _bd_prod.listProductos();
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return new ArrayList<Producto>();
	}

	public Foto[] getFotosProducto(int aIdProducto) {
		Foto[] fotos = {};
		try {
			fotos = _bd_fotos.getFotosProducto(aIdProducto);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return fotos;
	}

	public appventawebbd.Producto altaProducto(Producto aProducto, List<String> images, int cat) {
		try {
			return _bd_prod.altaProducto(aProducto, images, cat);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return null;
	}

	public Usuario[] listempleados() {
		Usuario[] usuarios = {};
		try {
			usuarios = _bd_admin.listEmpleados();
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return usuarios;
	}

	public appventawebbd.Producto modificarProducto(int idProducto, Producto aProducto, List<String> fotos, int cat) {
		try {
			return _bd_prod.modificarProducto(idProducto, aProducto, fotos, cat);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return null;
	}

	public void borrarProducto(appventawebbd.Producto aProducto) {
		try {
			_bd_prod.borrarProducto(aProducto);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
	}

	public Pendiente[] listadoComprasPendientes(int aIdCiber) {
		Pendiente[] pedidos = {};
		try {
			pedidos =  _bd_pend.listadoComprasPendientes(aIdCiber);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return pedidos;
	}

	public Entregado[] listadoComprasEntregadas(int aIdCiber) {
		Entregado[] pedidos = {};
		try {
			pedidos = _bd_entr.listadoComprasEntregadas(aIdCiber);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return pedidos;
	}

	public Enviado[] listadoComprasEnviadas(int aIdCiber) {
		Enviado[] pedidos = {};
		try {
			pedidos = _bd_env.listadoComprasEnviadas(aIdCiber);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return pedidos;
	}

	public void anadirAOferta(int aIdProducto, Oferta aOferta) {
		try {
			_bd_oferta.anadirAOferta(aIdProducto, aOferta);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
	}

	public void quitarProductoOferta(int aIdProducto) {
		try {
			_bd_oferta.quitarProductoOferta(aIdProducto);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
	}

	public appventawebbd.Categoria addCategoria(Categoria aCategoria) {
		try {
			return _bd_cat.addCategoria(aCategoria);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return null;
	}

	public void anadirFoto(int aIdProducto, String aImage) {
		try {
			_bd_prod.anadirFoto(aIdProducto, aImage);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
	}

	public void modificarDatos(int idCiber, appventawebbd.Usuario aCiber) {
		try {
			_bd_ciber.modificarDatos(idCiber, aCiber);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
	}

	public Mensaje[] getMensajesEnviados(int idUsuario) {
		Mensaje[] mensajes = {};
		try {
			mensajes =  _bd__mens.getMensajesEnviados(idUsuario);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return mensajes;
	}
	
	public Mensaje[] getMensajesRecibidos(int idUsuario) {
		Mensaje[] mensajes = {};
		try {
			mensajes =  _bd__mens.getMensajesRecibidos(idUsuario);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return mensajes;
	}

	public appventawebbd.Cibernauta getCibernauta(int aId) {
		try {
			return _bd_ciber.getCibernauta(aId);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return null;
	}

	public void borrarCuenta(int aIdCiber) {
		try {
			_bd_ciber.borrarCuenta(aIdCiber);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
	}

	public void comentarProducto(int aIdProduct, Comentario aComentario, int idCiber) {
		try {
			_bd_com.comentarProducto(aIdProduct, aComentario, idCiber);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
	}

	public boolean isPedidoEnviado(int aId) {
		try {
			return _bd_env.isPedidoEnviado(aId);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return false;
	}

	public Pendiente getPedidoPendiente(int aId) {
		try {
			return _bd_pend.getPedidoPendiente(aId);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return null;
	}

	public Enviado getPedidoEnviado(int aId) {
		try {
			return _bd_env.getPedidoEnviado(aId);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return null;
	}

	public Entregado getPedidoEntregado(int aId) {
		try {
			return _bd_entr.getPedidoEntregado(aId);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return null;
	}

	public Item[] getItemsPedido(int aIdPedido) {
		Item[] items = {};
		try {
			items = _bd_items.getItemsPedido(aIdPedido);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return items;
	}

	public Producto[] getProductos(int idCategoria) {
		Producto[] productos = {};
		try {
			productos = _bd_prod.getProductos(idCategoria);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return productos;
	}

	public void cancelarCompra(Pendiente pedido) {
		try {
			_bd_pend.cancelarCompra(pedido);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
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
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return null;
	}

	public appventawebbd.Usuario getUsuarioLogin(String aUser) {
		try {
			return _bd_ciber.Login(aUser);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return null;
	}
	
	public appventawebbd.Usuario getUsuario(int aUser) {
		try {
			return _bd_ciber.getUsuario(aUser);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return null;
	}

	public Usuario getUsuarioEmail(String email) {
		try {
			return _bd_ciber.getUsuarioEmail(email);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return null;
	}

	public void nuevaNotificacion(Usuario remitente, Usuario destinatario, String asunto, String cuerpo) {
		try {
			_bd__mens.nuevaNotificacion(remitente, destinatario, asunto, cuerpo);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
	}

	public Pendiente RealizaCompra(List<Item> aItems, Cibernauta aCiber, double precio) {
		try {
			return _bd_pend.RealizaCompra(aItems, aCiber, precio);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return null;
	}

	public void AddPedidoEnviado(int idPedido) {
		try {
			_bd_env.AddPedidoEnviado(idPedido);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
	}

	public void AddPedidoEntregado(int pedido) {
		try {
			_bd_entr.AddPedidoEntregado(pedido);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
	}

	public Pendiente[] listadoComprasPendientes() {
		Pendiente[] pedidos = {};
		try {
			pedidos = _bd_pend.listadoComprasPendientes();
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return pedidos;
	}

	public Entregado[] listadoComprasEntregadas() {
		Entregado[] pedidos = {};
		try {
			pedidos = _bd_entr.listadoComprasEntregadas();
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return pedidos;
	}

	public Enviado[] listadoComprasEnviadas() {
		Enviado[] pedidos = {};
		try {
			pedidos = _bd_env.listadoComprasEnviadas();
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return pedidos;
	}

	public Oferta estaEnOferta(int idProducto) {
		try {
			return _bd_oferta.estaEnOferta(idProducto);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return null;
	}

	public void ActualizarValoracionMedia(int idProducto) {
		try {
			_bd_prod.ActualizarValoracionMedia(idProducto);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
	}

	@Override
	public Item[] getItemsProducto(int aIdPedido) {
		Item[] items = {};
		try {
			items = _bd_items.getItemsPedido(aIdPedido);
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return items;
	}
	
	public List<Usuario> getUsuarios() {
		List<Usuario> items = new ArrayList<Usuario>();
		try {
			items = _bd_ciber.getUsuarios();
		} catch (PersistentException e) {
			Helpers.Errors.LogBDError(e);
			e.printStackTrace();
		}
		return items;
	}
}