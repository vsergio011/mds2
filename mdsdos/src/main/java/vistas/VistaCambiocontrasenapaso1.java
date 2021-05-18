package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Input;

/**
 * A Designer generated component for the vista-cambiocontrasenapaso1 template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cambiocontrasenapaso1")
@JsModule("./src/vista-cambiocontrasenapaso1.js")
public class VistaCambiocontrasenapaso1 extends PolymerTemplate<VistaCambiocontrasenapaso1.VistaCambiocontrasenapaso1Model> {

    @Id("sendBtn")
	private Button sendBtn;
	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("descripcionLabel")
	private Label descripcionLabel;
	@Id("titleLbl")
	private Label titleLbl;
	public Label getDescripcionLabel() {
		return descripcionLabel;
	}

	public Label getTitleLbl() {
		return titleLbl;
	}

	public Input getInput() {
		return input;
	}

	@Id("input")
	private Input input;

	public Button getSendBtn() {
		return sendBtn;
	}

	public void setSendBtn(Button sendBtn) {
		this.sendBtn = sendBtn;
	}

	/**
     * Creates a new VistaCambiocontrasenapaso1.
     */
    public VistaCambiocontrasenapaso1() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCambiocontrasenapaso1 and vista-cambiocontrasenapaso1
     */
    public interface VistaCambiocontrasenapaso1Model extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
