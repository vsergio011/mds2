package tiendaVirtual.interfaz;

import java.text.DecimalFormat;
import java.util.List;

import Helpers.Notifications.NotificationType;
import basededatos.BDPrincipal;
import basededatos.iCibernauta;
import basededatos.iCibernauta_Registrado;
import vistas.VistaProcesodecompra;

public class Comprar extends VistaProcesodecompra {
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

	double precio = 0;
	public void Realizar_Compra(List<appventawebbd.Item> items, appventawebbd.Cibernauta ciber, double precio) {
		iCibernauta_Registrado c = new BDPrincipal();
		c.RealizaCompra(items, ciber, precio);
		
		Helpers.Notifications.ShowAlert("Compra realizada con éxito.", NotificationType.INFORMATION);
	}
	
	public void ShowDatosCompra(List<appventawebbd.Item> items, double total) {
		this.getnProductos().setText("" + items.size());
		
		double precio = 0;
		for (appventawebbd.Item item : items) {
			precio += item.getProducto().getPrecio() * item.getCantidad();
		}
		if (total != 0) {
			precio = total;
		}
		this.getPrecio().setText(new DecimalFormat("#.##").format(precio) + " €");
		
		double gastosEnvios = precio * 0.2;
		this.getPrecioGastosEnvio().setText(new DecimalFormat("#.##").format(gastosEnvios) + " €");
		this.getTotal().setText(new DecimalFormat("#.##").format(precio + gastosEnvios) + " €");	
		
		this.precio = precio + gastosEnvios;
	}
	
	public Comprar(appventawebbd.Cibernauta ciber) {
		_cambiarDatosCompra = new Cambiar_datos_Compra(ciber);
	}
}