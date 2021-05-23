package tiendaVirtual.interfaz;

import java.util.List;

public class Comprar {
	// private event _realizar_Compra;
	private Object _resumenL;
	private Object _totalProductosL;
	private Object _precioL;
	private Object _precioEnvioL;
	private Object _totalL;
	private Object _totalProductosCaptionL;
	private Object _precioCaptionL;
	private Object _precioEnvioCaptionL;
	private Object _totalCaptionL;
	private Object _cambiarDatosB;
	private Object _cancelarB;
	private Object _realizarCompraB;
	public Carrito_Registrado _carrito;
	public Cambiar_datos_Compra _cambiarDatosCompra;

	public void Realizar_Compra(List<appventawebbd.Item> items) {
		for (appventawebbd.Item item : items) {
			System.out.println("ITEM : " + item.getProducto().getNombre());
		}
	}
	
	public Comprar() {
		_cambiarDatosCompra = new Cambiar_datos_Compra();
	}
}