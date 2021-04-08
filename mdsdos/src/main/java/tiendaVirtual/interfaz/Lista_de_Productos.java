package tiendaVirtual.interfaz;

import java.util.Vector;

import vistas.VistaListadeproductos;
// import interfaz.Cabecera_Lista_Productos;
// import interfaz.Producto_Ciber;

public class Lista_de_Productos extends VistaListadeproductos{
	private Object _tituloL;
	public Productos_mas_vendidos _productosMasVendidos;
	public Vector<Cabecera_Lista_Productos> _list_Cabecera_Lista_Productos = new Vector<Cabecera_Lista_Productos>();
	public Vector<Producto_Ciber> _producto = new Vector<Producto_Ciber>();
	public Categorias _categorias;
	
	public Lista_de_Productos()
	{
		// TODO: Rellenar con datos de verdad.
		for(int j = 0; j<3; j++) {
			Producto_Ciber p= new Producto_Ciber();
			_producto.add(p);
		}
	}
}