package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-perfil template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-perfil")
@JsModule("./src/vista-perfil.js")
public class VistaPerfil extends PolymerTemplate<VistaPerfil.VistaPerfilModel> {

    @Id("img")
	private Image img;
	@Id("cambiarImgBtn")
	private Button cambiarImgBtn;
	@Id("cambiarPasswordBtn")
	private Button cambiarPasswordBtn;
	@Id("ModificarDatosBtn")
	private Button modificarDatosBtn;
	@Id("comprasRealizadasBtn")
	private Button comprasRealizadasBtn;
	@Id("contactoBtn")
	private Button contactoBtn;
	@Id("borrarCuentaBtn")
	private Button borrarCuentaBtn;
	@Id("desconectarBtn")
	private Button desconectarBtn;
	public Button getAceptarCambiosBtn() {
		return aceptarCambiosBtn;
	}

	@Id("nombreApellidosLbl")
	private Label nombreApellidosLbl;
	@Id("emailLbl")
	private Label emailLbl;
	public Element getPerfilLayout() {
		return perfilLayout;
	}
	@Id("direccionLbl")
	private Label direccionLbl;
	@Id("perfilLayout")
	private Element perfilLayout;
	@Id("aceptarCambiosBtn")
	private Button aceptarCambiosBtn;

	/**
     * Creates a new VistaPerfil.
     */
    public VistaPerfil() {
        // You can initialise any data required for the connected UI components here.
    }

	public Image getImg() {
		return img;
	}

	public Button getCambiarImgBtn() {
		return cambiarImgBtn;
	}

	public Button getCambiarPasswordBtn() {
		return cambiarPasswordBtn;
	}

	public Button getModificarDatosBtn() {
		return modificarDatosBtn;
	}

	public Button getComprasRealizadasBtn() {
		return comprasRealizadasBtn;
	}

	public Button getContactoBtn() {
		return contactoBtn;
	}

	public Button getBorrarCuentaBtn() {
		return borrarCuentaBtn;
	}

	public Button getDesconectarBtn() {
		return desconectarBtn;
	}

	public Label getNombreApellidosLbl() {
		return nombreApellidosLbl;
	}

	public Label getEmailLbl() {
		return emailLbl;
	}

	public Label getDireccionLbl() {
		return direccionLbl;
	}

	/**
     * This model binds properties between VistaPerfil and vista-perfil
     */
    public interface VistaPerfilModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
