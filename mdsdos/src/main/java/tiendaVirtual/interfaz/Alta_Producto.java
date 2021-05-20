package tiendaVirtual.interfaz;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaAltaproducto;

public class Alta_Producto extends VistaAltaproducto{
/*	private event _agregar_Imagen;
	private event _cambiar_Imagen;
	private event _borrar_Imagen;*/
	private Object _cancelarB;
	private Object _aceptarB;
	private Object _altaProductoB;
	private Object _tituloL;
	private Object _tituloTF;
	private Object _descripcionL;
	private Object _descripcionTF;
	private Object _caracteristicasL;
	private Object _caracteristicasTF;
	private Object _categoriasCB;
	private Object _precioTF;
	private Object _imagen;
	private java.util.Vector<Object> _miniaturas;
	public Funciones_Admin _funcionesAdmin;

	public void Agregar_Imagen() {
		throw new UnsupportedOperationException();
	}

	public void Cambiar_Imagen() {
		throw new UnsupportedOperationException();
	}

	public void Borrar_Imagen() {
		throw new UnsupportedOperationException();
	}
	
	public void SaveProducto() {
		appventawebbd.Producto pro = new appventawebbd.Producto();
		// TODO: Asignar bien la categoria
		// pro.setCategoria(this.getProductoCategorias().getValue());
		
		pro.setDescripcion(this.getDescripcionInput().getValue());
		pro.setFotos(this.getImg().getSrc());
		pro.setNombre(this.getInputTitulo().getValue());
		pro.setPrecio(Integer.parseInt(this.getProductoPrecio().getValue()));
		
		// TODO: DETALLES?
		//pro.setDetalles(this.getD);
		
		iAdministrador admin = new BDPrincipal();
		admin.altaProducto(pro);		
	}
}