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

public class Perfil extends VistaPerfil{
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
	public Perfil() {
		
	}
	public Perfil(appventawebbd.Cibernauta ciber) {
		VerticalLayout layoutPerfil = this.getPerfilLayout();
		Modificar_general mg = new Modificar_general();
		mg.fillData(ciber);
		layoutPerfil.removeAll();
		layoutPerfil.add(mg);
	}
	
	public Perfil(appventawebbd.Administrador admin) {
		VerticalLayout layoutPerfil = this.getPerfilLayout();
		Modificar_general mg = new Modificar_general();
		mg.fillData(admin);
		layoutPerfil.removeAll();
		layoutPerfil.add(mg);
		this.getCambiarImgBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				layoutPerfil.removeAll();
				
				memoryBuffer = new MemoryBuffer();

				Upload upload = new Upload(memoryBuffer);
				upload.addFinishedListener(e -> {
				    InputStream inputStream = memoryBuffer.getInputStream();
				    // read the contents of the buffered memory
				    // from inputStream
				});
				Button imgUpBtn = new Button();
				imgUpBtn.setText("Subir");
				imgUpBtn.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						Cambiar_Imagen_de_Perfil();
						
					}
				});
				
				layoutPerfil.add(upload);
				layoutPerfil.add(imgUpBtn);
				
			}
		});
		this.getCambiarPasswordBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				layoutPerfil.removeAll();
				Cambiar_Contrasena _Cambiar_Contrasena = new Cambiar_Contrasena();
				layoutPerfil.add(_Cambiar_Contrasena);
			}
		});
		
		this.getDesconectarBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				UI.getCurrent().getPage().reload();
				/*Cambiar_Contrasena _Cambiar_Contrasena = new Cambiar_Contrasena();
				containerInfo.add(_Cambiar_Contrasena);*/
				
			}
		});
	}

	
	public void Cambiar_Imagen_de_Perfil() {
		InputStream is = memoryBuffer.getInputStream();
		String UrlImagen = "img/"+memoryBuffer.getFileName();
		
		try {
            
            OutputStream os = new FileOutputStream("./src/main/webapp/img/"+memoryBuffer.getFileName());
            byte[] buffer = new byte[1024];
            int bytesRead;
            //read from is to buffer
            while((bytesRead = is.read(buffer)) !=-1){
                os.write(buffer, 0, bytesRead);
            }
            is.close();
            //flush OutputStream to write any buffered data to file
            os.flush();
            os.close();
            this.getImg().setMaxWidth("300px");
            
           
            this.getImg().setSrc(UrlImagen);
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }	
	}
}