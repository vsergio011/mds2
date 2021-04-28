package bds;

import Diagrama_BD.Categoria;
import Diagrama_BD.Comentario;
import Diagrama_BD.Oferta;
import Diagrama_BD.Producto;
import Diagrama_BD.Foto;

public interface iCibernauta {

	public void cambiar_contrasena(String aEmail, String aNewContrasen);

	public Categoria[] listCategorias();

	public Comentario[] listComentarios(int aIdProducto);

	public Oferta[] getOfertasPopulares();

	public Producto[] getProductosMasVendidos();

	public Producto[] listProductos();

	public Producto getProducto(int aIdProducto);

	public Foto[] getFotosProducto(int aIdProducto);
}