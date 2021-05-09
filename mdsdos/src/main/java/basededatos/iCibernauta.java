package basededatos;

import java.util.List;

import appventawebbd.Categoria;
import appventawebbd.Comentario;
import appventawebbd.Oferta;
import appventawebbd.Producto;
import appventawebbd.Foto;

public interface iCibernauta {

	public void cambiar_contrasena(String aEmail, String aNewContrasen);

	public List<Categoria> listCategorias();

	public Comentario[] listComentarios(int aIdProducto);

	public List<Oferta> getOfertasPopulares();

	public List<Producto> getProductosMasVendidos();

	public List<Producto> listProductos();

	public Producto getProducto(int aIdProducto);

	public Foto[] getFotosProducto(int aIdProducto);
}