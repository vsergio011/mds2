package tiendaVirtual.interfaz;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import vistas.VistaPerfil;

public class Perfil extends VistaPerfil {
	private Object _imagen;
	private Object _cambiarPasswordB;
	private Object _modificarDatosB;
	private Object _desconectarB;
	// private event _cambiar_Imagen_de_Perfil;
	private Object _nombreCompletoL;
	private Object _emailL;
	private Object _direccionCompletaL;
	public Cabecera_Administrador _cabecera;
	public Cambiar_Contrasena _cambiarContrasena;
	public Modificar_Datos _modificar;
	MemoryBuffer memoryBuffer;
	
	public Perfil(appventawebbd.Cibernauta ciber) {
		if (ciber == null) {
			return;
		}
		_cambiarContrasena = new Cambiar_Contrasena();
		_modificar = new Modificar_Datos(ciber);
		_modificar.fillData(ciber);
	}
	
	public Perfil(appventawebbd.Administrador admin) {
		if (admin == null) {
			return;
		}
		_cambiarContrasena = new Cambiar_Contrasena();
		_modificar = new Modificar_Datos(admin);
		_modificar.fillData(admin);
		
		this.getComprasRealizadasBtn().setVisible(false);
		this.getContactoBtn().setVisible(false);
		this.getBorrarCuentaBtn().setVisible(false);
		
		this.getImg().setSrc(admin.getFoto());
	}
}