package tiendaVirtual.interfaz;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import Helpers.Notifications.NotificationType;
import basededatos.BDPrincipal;
import basededatos.iCibernauta_Registrado;
import vistas.VistaModificardatos;
import vistas.VistaModificargeneral;

public class Modificar_general extends VistaModificargeneral {
	// private event _cambiar_Imagen_de_Perfil;
	private Object _imagen;
	private Object _aceptarB;
	private Object _cancelarB;
	private Object _nombreL;
	private Object _nombreTF;
	private Object _apellidosL;
	private Object _apellidosTF;
	private Object _emailL;
	private Object _emailTF;
	private Object _direccionCompletaL;
	private Object _direccionCompletaTF;
	private Object _nombreUsuarioL;
	private Object _nombreUsuarioTF;
	private Object _datosPagoL;
	private Object _datosPagoTF;
	
	MemoryBuffer memoryBuffer;
	
	public Modificar_general(appventawebbd.Usuario ciber) {
		if (ciber == null) {
			return;
		}
		this.fillData(ciber);
		
		memoryBuffer = new MemoryBuffer();
		Upload upload = this.getImgUpload();
		upload.setReceiver(memoryBuffer);
		this.getAddImgBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Cambiar_Imagen();
			}
		});
	}
		
	public void fillData(appventawebbd.Usuario ciber) {
		this.getLbNombre().setValue(ciber.getNombre());
		this.getLbApellidos().setValue(ciber.getApellidos());
		this.getLbDatosDePago().setValue(ciber.getFormaPago());
		this.getLbDireccion().setValue(ciber.getDireccionCompleta());
		this.getLbEmail().setValue(ciber.getCorreoElectronico());
		this.getLbNombreUsuario().setValue(ciber.getUsuario());
		this.getImg().setSrc(ciber.getFoto());
	}
	
	public void Cambiar_Imagen() {
		InputStream is = memoryBuffer.getInputStream();
		String UrlImagen = "img/"+memoryBuffer.getFileName();
		
		try {
            OutputStream os = new FileOutputStream("./src/main/webapp/img/"+memoryBuffer.getFileName());
            byte[] buffer = new byte[1024];
            int bytesRead;
            
            while((bytesRead = is.read(buffer)) !=-1){
                os.write(buffer, 0, bytesRead);
            }
            is.close();
            
            os.flush();
            os.close();
            this.getImg().setMaxWidth("300px");
            
            this.getImg().setSrc(UrlImagen);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public void UpdateUsuario(int id, int tipo) {
		BDPrincipal bd = new BDPrincipal();
		
		appventawebbd.Usuario ciber = new appventawebbd.Usuario();
		ciber.setApellidos(this.getLbApellidos().getValue());
		ciber.setTipo(tipo);
		ciber.setCorreoElectronico(this.getLbEmail().getValue());
		ciber.setDireccionCompleta(this.getLbDireccion().getValue());
		ciber.setFormaPago(this.getLbDatosDePago().getValue());
		ciber.setFoto(this.getImg().getSrc());
		ciber.setNombre(this.getLbNombre().getValue());
		ciber.setUsuario(this.getLbNombreUsuario().getValue());
		
		bd.modificarDatos(id, ciber);
		
		fillData(bd.getUsuario(id));
		
		Helpers.Notifications.ShowAlert("Empleado modificado con exito", NotificationType.INFORMATION);
	}
}