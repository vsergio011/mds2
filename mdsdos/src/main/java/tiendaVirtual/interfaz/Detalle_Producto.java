package tiendaVirtual.interfaz;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iCibernauta;
import vistas.VistaDetalleproducto;

public class Detalle_Producto  extends VistaDetalleproducto {
	private Object _titutloL;
	private Object _valoracionL;
	private Object _imagen;
	private java.util.Vector<Object> _miniaturas;
	private Object _descripcionProductoL;
	private Object _caracteristicasL;
	private Object _precioL;
	private Object _comentariosB;
	public Info_Producto _info;
	public Ver_comentarios _comentarios;
	
	public Detalle_Producto()
	{
		
	}
	
	public void fillImgs(appventawebbd.Producto producto) {
		VerticalLayout vl = this.getLyimagenesLateral().as(VerticalLayout.class);		
		vl.removeAll();
		
		iCibernauta bd = new BDPrincipal();
		
		for (appventawebbd.Foto img : bd.getFotosProducto(producto.getId())) {
			Image image = new Image(img.getRuta(), "DummyImage");
            image.setWidth("50px");
			vl.add(image);
		}
	}
}