package bds;

import java.util.Vector;

import Diagrama_BD.Item;

public class BD_Items {
	public BDPrincipal _bd_prin_items;
	public Vector<Item> _contiene_items = new Vector<Item>();

	public void crearItem(String aIdProducto, int aCantidad) {
		throw new UnsupportedOperationException();
	}

	public Item[] getItemsPedido(int aIdPedido) {
		throw new UnsupportedOperationException();
	}
}