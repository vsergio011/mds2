package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;

/**
 * A Designer generated component for the vista-nuevomensaje template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-nuevomensaje")
@JsModule("./src/vista-nuevomensaje.js")
public class VistaNuevomensaje extends PolymerTemplate<VistaNuevomensaje.VistaNuevomensajeModel> {

    @Id("titleLbl")
	private Label titleLbl;
	@Id("asuntoInput")
	private TextField asuntoInput;
	@Id("destinatarioInput")
	private TextField destinatarioInput;
	@Id("mensajeInput")
	private TextArea mensajeInput;
	@Id("responderBtn")
	private Button responderBtn;
	@Id("enviarBtn")
	private Button enviarBtn;
	@Id("remitenteInput")
	private TextField remitenteInput;
	@Id("usuariosCombo")
	private ComboBox<String> usuariosCombo;

	public ComboBox<String> getUsuariosCombo() {
		return usuariosCombo;
	}

	public TextField getRemitenteInput() {
		return remitenteInput;
	}

	public Label getTitleLbl() {
		return titleLbl;
	}

	public TextField getAsuntoInput() {
		return asuntoInput;
	}

	public TextField getDestinatarioInput() {
		return destinatarioInput;
	}

	public TextArea getMensajeInput() {
		return mensajeInput;
	}

	public Button getResponderBtn() {
		return responderBtn;
	}

	public Button getEnviarBtn() {
		return enviarBtn;
	}

	/**
     * Creates a new VistaNuevomensaje.
     */
    public VistaNuevomensaje() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaNuevomensaje and vista-nuevomensaje
     */
    public interface VistaNuevomensajeModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
