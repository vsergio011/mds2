package tiendaVirtual.interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaComentariosproducto;

public class Ver_comentarios extends VistaComentariosproducto{
	private Object _titutloL;
	private Object _valoracionL;
	private Object _volverB;
	public Detalle_Producto _detalle;
	public Comentarios _comentarios;
	
	public Ver_comentarios(appventawebbd.Producto p)
	{
		this.getTitleLbl().setText(p.getNombre());
		this.getValoracionLbl().setText(String.format("Valoración media: %f/5", p.getValoracionMedia()));
		
		VerticalLayout vl = this.getListaComentarios().as(VerticalLayout.class);
		for (appventawebbd.Comentario comentario : p.comentarios.toArray()) {
			vl.add(new Comentario(comentario));
		}
	}
 }