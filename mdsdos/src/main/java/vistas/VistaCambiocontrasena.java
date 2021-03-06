package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.textfield.PasswordField;

/**
 * A Designer generated component for the vista-cambiocontrasena template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cambiocontrasena")
@JsModule("./src/vista-cambiocontrasena.js")
public class VistaCambiocontrasena extends PolymerTemplate<VistaCambiocontrasena.VistaCambiocontrasenaModel> {

    @Id("continueBtn")
	private Button continueBtn;
	@Id("cancelBtn")
	private Button cancelBtn;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("inputNewPassword")
	private PasswordField inputNewPassword;
	@Id("inputRepeatNewPassword")
	private PasswordField inputRepeatNewPassword;
	@Id("errLayout")
	private Element errLayout;

	public Element getErrLayout() {
		return errLayout;
	}

	public Button getContinueBtn() {
		return continueBtn;
	}

	public void setContinueBtn(Button continueBtn) {
		this.continueBtn = continueBtn;
	}

	public Button getCancelBtn() {
		return cancelBtn;
	}

	public void setCancelBtn(Button cancelBtn) {
		this.cancelBtn = cancelBtn;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public PasswordField getInputNewPassword() {
		return inputNewPassword;
	}

	public void setInputNewPassword(PasswordField inputNewPassword) {
		this.inputNewPassword = inputNewPassword;
	}

	public PasswordField getInputRepeatNewPassword() {
		return inputRepeatNewPassword;
	}

	public void setInputRepeatNewPassword(PasswordField inputRepeatNewPassword) {
		this.inputRepeatNewPassword = inputRepeatNewPassword;
	}

	/**
     * Creates a new VistaCambiocontrasena.
     */
    public VistaCambiocontrasena() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCambiocontrasena and vista-cambiocontrasena
     */
    public interface VistaCambiocontrasenaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
