package tiendaVirtual.interfaz;

import java.util.Vector;

import appventawebbd.*;
import basededatos.*;
import vistas.VistaListadeproductos;
// import interfaz.Cabecera_Lista_Productos;
// import interfaz.Producto_Ciber;

public class Lista_de_Productos extends VistaListadeproductos {
	private Object _tituloL;
	public Productos_mas_vendidos _productosMasVendidos;
	public Vector<Cabecera_Lista_Productos> _list_Cabecera_Lista_Productos = new Vector<Cabecera_Lista_Productos>();
	public Vector<Producto_Ciber> _producto = new Vector<Producto_Ciber>();
	public Categorias _categorias;
	
	public Lista_de_Productos(Categoria cat) {
		iCibernauta bd = new BDPrincipal();
		
		for(appventawebbd.Producto p: bd.getProductos(cat.getId())) {
			Producto_Ciber pc = new Producto_Ciber(p);
			pc.getImgProducto().setHeight("150px");
			pc.getImgProducto().setWidth("200px");
			pc.getImgProducto().setSrc(p.getFotos());
			pc.getLabel().setText(p.getPrecio() + " €");
			
			_producto.add(pc);
		}
	}
}