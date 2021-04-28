package bds;

import java.util.Vector;

import Diagrama_BD.Mensaje;

public class BD__Mensaje {
	public BDPrincipal _bd_prin_mens;
	public Vector<Mensaje> _contiene_mensajes = new Vector<Mensaje>();

	public Mensaje detalleMensaje(int aId) {
		throw new UnsupportedOperationException();
	}

	public void nuevaNotificacion(int aOrigen, int aDestino, Mensaje aMensaje) {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] getMensajes(int aId) {
		throw new UnsupportedOperationException();
	}
}