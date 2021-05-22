package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.dom.Element;
import vistas.VistaNotificaciones;

/**
 * A Designer generated component for the vista-mensajeria template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-mensajeria")
@JsModule("./src/vista-mensajeria.js")
public class VistaMensajeria extends PolymerTemplate<VistaMensajeria.VistaMensajeriaModel> {

    @Id("recibidosBtn")
	private Button recibidosBtn;
	@Id("enviadosBtn")
	private Button enviadosBtn;
	@Id("nuevoMensajeBtn")
	private Button nuevoMensajeBtn;
	@Id("nombreBtn")
	private Label nombreBtn;
	@Id("tituloLbl")
	private Label tituloLbl;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("responderBtn")
	private Button responderBtn;
	@Id("verMensajeBtn")
	private Button verMensajeBtn;

	public Button getVerMensajeBtn() {
		return verMensajeBtn;
	}

	public Button getResponderBtn() {
		return responderBtn;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public Button getRecibidosBtn() {
		return recibidosBtn;
	}

	public Button getEnviadosBtn() {
		return enviadosBtn;
	}

	public Button getNuevoMensajeBtn() {
		return nuevoMensajeBtn;
	}

	public Label getNombreBtn() {
		return nombreBtn;
	}

	public Label getTituloLbl() {
		return tituloLbl;
	}

	/**
     * Creates a new VistaMensajeria.
     */
    public VistaMensajeria() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaMensajeria and vista-mensajeria
     */
    public interface VistaMensajeriaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
