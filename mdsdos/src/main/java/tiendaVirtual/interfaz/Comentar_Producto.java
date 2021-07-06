package tiendaVirtual.interfaz;

import basededatos.BDPrincipal;
import basededatos.iCibernauta_Registrado;
import vistas.VistaComentarproducto;

public class Comentar_Producto extends VistaComentarproducto{
	private Object _tituloL;
	private Object _valoracionL;
	private Object _valoracionTF;
	private Object _comentarioL;
	private Object _comentarioTF;
	private Object _cancelarB;
	private Object _aceptarB;
	public Producto_Adquirido _productoAdquirido;
	
	appventawebbd.Producto producto = null;
	public Comentar_Producto(appventawebbd.Producto p) {
		this.producto = p;
	}
	
	public void ComentarProducto(appventawebbd.Cibernauta ciber) {
		appventawebbd.Comentario comentario = new appventawebbd.Comentario();
		comentario.setTexto(this.getComentarioTxt().getValue());
		comentario.setValoracion(Integer.parseInt(this.getValoracionInput().getValue()));
		
		iCibernauta_Registrado cibernauta = new BDPrincipal();
		cibernauta.comentarProducto(producto.getId(), comentario, ciber.getId());
		cibernauta.ActualizarValoracionMedia(producto.getId());
	}
}