package tiendaVirtual.interfaz;

import vistas.VistaFuncionesadmin;

public class Funciones_Admin extends VistaFuncionesadmin{
	private Object _tituloL;
	private Object _altaCategoriaB;
	private Object _altaProductoB;
	private Object _modificarEmpleadosB;
	private Object _mensajesB;
	public Cabecera_Administrador _cabecera;
	public Mensajeria _mensajeria;
	public Listado_de_Compras _compras;
	public Alta_Categoria _altaCategoria;
	public Alta_Producto _altaProducto;
	public Modificar_Empleado _modificarEmpleado;
	
	public Funciones_Admin(appventawebbd.Administrador admin) {
		_altaCategoria = new Alta_Categoria();
		_altaProducto = new Alta_Producto();
		_modificarEmpleado = new Modificar_Empleado();
		_mensajeria = new Mensajeria(admin);
	}
}
