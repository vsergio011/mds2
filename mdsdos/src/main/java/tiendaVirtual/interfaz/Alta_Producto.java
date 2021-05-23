package tiendaVirtual.interfaz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

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
	
	iAdministrador ciberAdm;
	Upload upload ;
	MemoryBuffer memoryBuffer;
	File tmpFile;
	
	appventawebbd.Categoria selected = null;
	public Alta_Producto() {
		
		iCibernauta ciber = new BDPrincipal();
		
		List<appventawebbd.Categoria> categorias = ciber.listCategorias();
		List<String> cats = new ArrayList<String>();
		for (appventawebbd.Categoria cat : categorias) {
			cats.add(cat.getNombre());
		}
		this.getProductoCategorias().setItems(cats);
		
		this.getProductoCategorias().addValueChangeListener(event -> {
			int index = cats.indexOf(event.getValue());
			selected = categorias.get(index);
		});
		memoryBuffer = new MemoryBuffer();
		upload = new Upload(memoryBuffer);
		upload.addFinishedListener(e -> {
		    InputStream inputStream = memoryBuffer.getInputStream();
		    // read the contents of the buffered memory
		    // from inputStream
		});
		this.gethorizontalLYUpImg().add(upload);
		
		this.getAddImgBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Agregar_Imagen();
				
			}
		});
			
		
	}

	public void Agregar_Imagen() {
		System.out.println(memoryBuffer.getFileName());
		System.out.println(memoryBuffer.getFileData());
		
		try {
            InputStream is = memoryBuffer.getInputStream();
            
            OutputStream os = new FileOutputStream("./src/main/webapp/img"+memoryBuffer.getFileName());
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
            this.getImg().setSrc("img/"+memoryBuffer.getFileName());
            
    		
            
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}

	public void Cambiar_Imagen() {
		throw new UnsupportedOperationException();
	}

	public void Borrar_Imagen() {
		throw new UnsupportedOperationException();
	}
	
	public void SaveProducto() {
		appventawebbd.Producto pro = new appventawebbd.Producto();
		pro.setCategoria(this.selected);
		
		pro.setDescripcion(this.getDescripcionInput().getValue());
		pro.setNombre(this.getInputTitulo().getValue());
		pro.setPrecio(Integer.parseInt(this.getProductoPrecio().getValue()));
		pro.setDetalles(this.getVaadinTextArea().getValue());
		pro.setFotos(this.getImg().getSrc());
		
		iAdministrador admin = new BDPrincipal();
		Producto id = admin.altaProducto(pro);	
		
	}
}