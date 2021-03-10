package tiendaVirtual.interfaz;

public class Detalle_Producto_Admin extends Detalle_Producto {
	private Object _modificarB;
	private Object _deleteOfertasB;
	private Object _addOfertasB;
	public Modificar_Producto _modificar;
	public Agregar_Oferta _agregarOferta;
	public Quitar_Oferta _quitarOferta;

	public void Esta_en_oferta() {
		throw new UnsupportedOperationException();
	}
}