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

public class Modificar_Datos extends VistaModificargeneral {
	private Object _borrarCuentaB;
	private Object _contactoB;
	private Object _comprasB;
	private Object _desconectarB;
	public Perfil _perfil;
	public VerticalLayout containerInfo;
	MemoryBuffer memoryBuffer;
	
	public Modificar_Datos() {
	}
	
	public Modificar_Datos(appventawebbd.Usuario ciber) {		
		if (ciber == null) {
			return;
		}
		//this.fillData(ciber);	
		this.getLbNombreUsuario().setValue(ciber.getUsuario());
		this.getImg().setSrc(ciber.getFoto());
		Modificar_general _Modificar_general = new Modificar_general();
		_Modificar_general.fillData(ciber);
		containerInfo = this.getContainerLayout();
		containerInfo.removeAll();
		containerInfo.add(_Modificar_general);
		
		
		this.getCambiarImagenBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				containerInfo.removeAll();
				
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
						Cambiar_Imagen();
						
					}
				});
				
				containerInfo.add(upload);
				containerInfo.add(imgUpBtn);
				
			}
		});
		
		this.getCambiarPasswordBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				containerInfo.removeAll();
				Cambiar_Contrasena _Cambiar_Contrasena = new Cambiar_Contrasena();
				containerInfo.add(_Cambiar_Contrasena);
				
			}
		});
		
		
		this.getComprasBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				containerInfo.removeAll();
				/*Cambiar_Contrasena _Cambiar_Contrasena = new Cambiar_Contrasena();
				containerInfo.add(_Cambiar_Contrasena);*/
				
			}
		});
		
		this.getContactoBTn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				containerInfo.removeAll();
				/*Cambiar_Contrasena _Cambiar_Contrasena = new Cambiar_Contrasena();
				containerInfo.add(_Cambiar_Contrasena);*/
				
			}
		});
		
		this.getBorrarCuentaBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				containerInfo.removeAll();
				/*Cambiar_Contrasena _Cambiar_Contrasena = new Cambiar_Contrasena();
				containerInfo.add(_Cambiar_Contrasena);*/
				
			}
		});
		
		this.getDesconectarBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				containerInfo.removeAll();
				/*Cambiar_Contrasena _Cambiar_Contrasena = new Cambiar_Contrasena();
				containerInfo.add(_Cambiar_Contrasena);*/
				
			}
		});
		
		this.getAceptarCambiosBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				containerInfo.removeAll();
				/*Cambiar_Contrasena _Cambiar_Contrasena = new Cambiar_Contrasena();
				containerInfo.add(_Cambiar_Contrasena);*/
				
			}
		});
		
	}
	
	public void Cambiar_Imagen() {
	
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
	
	
	public void showLess() {
		this.getBorrarCuentaBtn().setVisible(false);
		this.getDesconectarBtn().setVisible(false);
		this.getComprasBtn().setVisible(false);
		this.getContactoBTn().setVisible(false);
		this.getCambiarPasswordBtn().setVisible(false);
		
	}
}