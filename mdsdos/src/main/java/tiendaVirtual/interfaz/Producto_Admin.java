package tiendaVirtual.interfaz;

public class Producto_Admin extends Producto {
	private Object _addOfertaB;
	private Object _deleteOfertaB;
	public Cabecera_Administrador _cabecera;
	public Lista_de_PmV _listaPmV;
	public Lista_Ofertas _ofertas;
	public Agregar_Oferta _agregarOferta;
	public Quitar_Oferta _quitarOferta;

	public void Esta_en_oferta() {
		throw new UnsupportedOperationException();
	}
}