package basededatos;

import java.util.List;

import appventawebbd.Categoria;
import appventawebbd.Cibernauta;
import appventawebbd.Comentario;
import appventawebbd.Oferta;
import appventawebbd.Producto;
import appventawebbd.Usuario;
import appventawebbd.Foto;

public interface iCibernauta {

	public void cambiar_contrasena(int idCiber, String aNewContrasen);

	public List<Categoria> listCategorias();

	public Comentario[] listComentarios(int aIdProducto);

	public List<Oferta> getOfertasPopulares();

	public List<Producto> getProductosMasVendidos();

	public List<Producto> listProductos();

	public Producto getProducto(int aIdProducto);

	public Foto[] getFotosProducto(int aIdProducto);
	
	public Usuario getUsuarioEmail(String email);
	
	public void nuevaNotificacion(Usuario remitente, Usuario destinatario, String asunto, String cuerpo);
	
	public Producto[] getProductos(int idCategoria);
}