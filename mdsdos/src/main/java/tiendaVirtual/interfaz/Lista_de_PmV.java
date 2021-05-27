package tiendaVirtual.interfaz;

import java.util.Vector;
// import interfaz.Producto_Admin;

public class Lista_de_PmV extends Productos_mas_vendidos {
	public Administrador _administrador;
	public Vector<Producto_Admin> _producto = new Vector<Producto_Admin>();
	
	public Lista_de_PmV() {
		super();
	}
	
	public Lista_de_PmV(appventawebbd.Categoria cat) {
		super(cat);
	}
}