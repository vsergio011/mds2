package tiendaVirtual.interfaz;

import vistas.VistaComentario;

public class Comentario extends VistaComentario{
	private Object _nombreUsuarioL;
	private Object _valoracionL;
	private Object _comentarioL;
	public Comentarios _comentarios;
	
	public Comentario(appventawebbd.Comentario c) {
		this.getValoracion().setText("Valorasao");
		this.getValoracionUsuario().setText(c.getCibernauta().getNombre());
		this.getValoracionNumero().setText("" + c.getValoracion() + "/5");
		this.getValoracionTexto().setText(c.getTexto());
	}
}