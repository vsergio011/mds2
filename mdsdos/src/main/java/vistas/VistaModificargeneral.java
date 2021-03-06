package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.upload.Upload;

/**
 * A Designer generated component for the vista-modificargeneral template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-modificargeneral")
@JsModule("./src/vista-modificargeneral.js")
public class VistaModificargeneral extends PolymerTemplate<VistaModificargeneral.VistaModificargeneralModel> {

    @Id("lbNombreUsuario")
	private TextField lbNombreUsuario;
	public VerticalLayout getContainerLayout() {
		return containerLayout;
	}

	@Id("lbApellidos")
	private TextField lbApellidos;
	public Button getAceptarCambiosBtn() {
		return aceptarCambiosBtn;
	}

	@Id("lbNombre")
	private TextField lbNombre;
	@Id("lbEmail")
	private TextField lbEmail;
	@Id("lbDireccion")
	private TextField lbDireccion;
	@Id("lbDatosDePago")
	private TextField lbDatosDePago;
	@Id("img")
	private Image img;
	@Id("borrarCuentaBtn")
	private Button borrarCuentaBtn;
	@Id("cambiarPasswordBtn")
	private Button cambiarPasswordBtn;
	@Id("containerLayout")
	private VerticalLayout containerLayout;
	@Id("aceptarCambiosBtn")
	private Button aceptarCambiosBtn;
	@Id("imgUpload")
	private Upload imgUpload;
	@Id("addImgBtn")
	private Button addImgBtn;
	
	public Button getAddImgBtn() {
		return addImgBtn;
	}

	public Upload getImgUpload() {
		return imgUpload;
	}

	public TextField getLbNombreUsuario() {
		return lbNombreUsuario;
	}

	public TextField getLbApellidos() {
		return lbApellidos;
	}

	public TextField getLbNombre() {
		return lbNombre;
	}

	public TextField getLbEmail() {
		return lbEmail;
	}

	public TextField getLbDireccion() {
		return lbDireccion;
	}

	public TextField getLbDatosDePago() {
		return lbDatosDePago;
	}

	public Image getImg() {
		return img;
	}

	public Button getBorrarCuentaBtn() {
		return borrarCuentaBtn;
	}

	public Button getCambiarPasswordBtn() {
		return cambiarPasswordBtn;
	}

	/**
     * Creates a new VistaModificargeneral.
     */
    public VistaModificargeneral() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaModificargeneral and vista-modificargeneral
     */
    public interface VistaModificargeneralModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
