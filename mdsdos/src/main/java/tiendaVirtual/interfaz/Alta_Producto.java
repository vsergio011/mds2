package tiendaVirtual.interfaz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.FileData;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.component.upload.receivers.MultiFileMemoryBuffer;

import appventawebbd.Categoria;
import appventawebbd.Producto;
import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import basededatos.iCibernauta;
import vistas.VistaAltaproducto;

public class Alta_Producto extends VistaAltaproducto{
/*	private event _agregar_Imagen;
	private event _cambiar_Imagen;
	private event _borrar_Imagen;*/
	private Object _cancelarB;
	private Object _aceptarB;
	private Object _altaProductoB;
	private Object _tituloL;
	private Object _tituloTF;
	private Object _descripcionL;
	private Object _descripcionTF;
	private Object _caracteristicasL;
	private Object _caracteristicasTF;
	private Object _categoriasCB;
	private Object _precioTF;
	private Object _imagen;
	private java.util.Vector<Object> _miniaturas;
	public Funciones_Admin _funcionesAdmin;
	List<String> imagenesUrl = new ArrayList<String>();
	iAdministrador ciberAdm;
	Upload upload ;
	MultiFileMemoryBuffer multiFileMemoryBuffer;
	File tmpFile;
	
	appventawebbd.Categoria selected = null;
	public Alta_Producto() {
		LoadCategories();
		
		multiFileMemoryBuffer = new MultiFileMemoryBuffer();
		Upload upload = new Upload(multiFileMemoryBuffer);
		upload.addFinishedListener(e -> {
			for(String a : multiFileMemoryBuffer.getFiles()) {
				System.out.println(a);
				InputStream inputStream = multiFileMemoryBuffer.getInputStream(a);
			}   
		});
		this.gethorizontalLYUpImg().add(upload);
		
		this.getAddImgBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				AppendImagen();
			}
		});
		
		this.getModificarImgBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Agregar_Imagen();
			}
		});
	}
	
	public void LoadCategories() {
		iCibernauta ciber = new BDPrincipal();
		
		List<appventawebbd.Categoria> categorias = ciber.listCategorias();
		List<String> cats = new ArrayList<String>();
		for (appventawebbd.Categoria cat : categorias) {
			cats.add(cat.getNombre());
		}
		this.getProductoCategorias().setItems(cats);
		
		this.getProductoCategorias().addValueChangeListener(event -> {
			int index = cats.indexOf(event.getValue());
			if (index != -1) {
				selected = categorias.get(index);
			}			
		});
	}

	public void Agregar_Imagen() {
		if (multiFileMemoryBuffer.getFiles().size() == 0) {
			return;
		}
		imagenesUrl = new ArrayList<String>();
		this.getvlImages().removeAll();
		 
		for(String a : multiFileMemoryBuffer.getFiles()) {
			FileData fd = multiFileMemoryBuffer.getFileData(a);
			InputStream is = multiFileMemoryBuffer.getInputStream(fd.getFileName());
			
			try {
	            OutputStream os = new FileOutputStream("./src/main/webapp/img/"+a);
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
	            
	            imagenesUrl.add("img/"+a);
	            this.getImg().setSrc("img/"+a);
	            Image image = new Image("img/"+a, "DummyImage");
	            image.setWidth("50px");
	            this.getvlImages().add(image);
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }	
		}
		multiFileMemoryBuffer.getFiles().clear();
	}
	
	public void AppendImagen() {		 
		for(String a : multiFileMemoryBuffer.getFiles()) {
			FileData fd = multiFileMemoryBuffer.getFileData(a);
			InputStream is = multiFileMemoryBuffer.getInputStream(fd.getFileName());
			
			try {
	            OutputStream os = new FileOutputStream("./src/main/webapp/img/"+a);
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
	            
	            imagenesUrl.add("img/"+a);
	            
	            if (this.getImg().getSrc().isEmpty() || this.getImg().getSrc().equals("https://www.mundofino.com/site/assets/files/1729/no_foto.600x600nw.jpg")) {
	            	this.getImg().setSrc("img/"+a);
	            }	            
	            Image image = new Image("img/"+a, "DummyImage");
	            image.setWidth("50px");
	            this.getvlImages().add(image);
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }	
		}
		multiFileMemoryBuffer.getFiles().clear();
	}
	
	public void fillImgs() {
		this.getvlImages().removeAll();
		for (String img : imagenesUrl) {
			Image image = new Image(img, "DummyImage");
            image.setWidth("50px");
            this.getvlImages().add(image);
		}
	}

	public void Borrar_Imagen() {
		this.getImg().setSrc("");
	}
	
	public void SaveProducto() {
		appventawebbd.Producto pro = new appventawebbd.Producto();
		
		pro.setDescripcion(this.getDescripcionInput().getValue());
		pro.setNombre(this.getInputTitulo().getValue());
		pro.setPrecio(Integer.parseInt(this.getProductoPrecio().getValue()));
		pro.setDetalles(this.getVaadinTextArea().getValue());
		pro.setFotos(this.getImg().getSrc());
		
		iAdministrador admin = new BDPrincipal();
		Producto id = admin.altaProducto(pro, this.imagenesUrl, this.selected.getId());
	}
}