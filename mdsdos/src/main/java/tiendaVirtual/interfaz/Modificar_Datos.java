package tiendaVirtual.interfaz;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.FileData;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import vistas.VistaModificargeneral;

public class Modificar_Datos extends Modificar_general {
	private Object _borrarCuentaB;
	private Object _contactoB;
	private Object _comprasB;
	private Object _desconectarB;
	public Perfil _perfil;
	
	public Modificar_Datos(appventawebbd.Usuario ciber) {
		super(ciber);
	}
	
	/*public void showLess() {
		this.getBorrarCuentaBtn().setVisible(false);
		this.getCambiarPasswordBtn().setVisible(false);
	}*/
}