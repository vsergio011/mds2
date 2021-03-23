package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Input;

/**
 * A Designer generated component for the vista-recuperarcontrasena template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-recuperarcontrasena")
@JsModule("./src/vista-recuperarcontrasena.js")
public class VistaRecuperarcontrasena extends PolymerTemplate<VistaRecuperarcontrasena.VistaRecuperarcontrasenaModel> {

    public Input getEmailInput() {
		return emailInput;
	}

	public void setEmailInput(Input emailInput) {
		this.emailInput = emailInput;
	}

	@Id("continueBtn")
	private Button continueBtn;
	@Id("emailInput")
	private Input emailInput;

	/**
     * Creates a new VistaRecuperarcontrasena.
     */
    public VistaRecuperarcontrasena() {
        // You can initialise any data required for the connected UI components here.
    }

    public Button getContinueBtn() {
		return continueBtn;
	}

	public void setContinueBtn(Button continueBtn) {
		this.continueBtn = continueBtn;
	}

	/**
     * This model binds properties between VistaRecuperarcontrasena and vista-recuperarcontrasena
     */
    public interface VistaRecuperarcontrasenaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
