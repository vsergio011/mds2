package tiendaVirtual.interfaz;

import appventawebbd.Categoria;
import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaAltacategoria;

public class Alta_Categoria extends VistaAltacategoria{
	private Object _tituloL;
	private Object _nombreTF;
	private Object _cancelarB;
	private Object _aceptarB;
	public Funciones_Admin _funcionesAdmin;
	
	public void SaveCategoria() {
		if (this.getCategoriaNameLbl().getValue().isEmpty()) {
			return;
		}
		
		Categoria cat = new Categoria();
		cat.setNombre(this.getCategoriaNameLbl().getValue());
		
		iAdministrador admin = new BDPrincipal();
		admin.addCategoria(cat);
	}
}