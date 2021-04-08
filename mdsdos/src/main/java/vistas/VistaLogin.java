package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.PasswordField;

/**
 * A Designer generated component for the vista-login template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-login")
@JsModule("./src/vista-login.js")
public class VistaLogin extends PolymerTemplate<VistaLogin.VistaLoginModel> {

    @Id("resetPasswordBtn")
	private Button resetPasswordBtn;
	@Id("loginBtn")
	private Button loginBtn;
	@Id("registerBtn")
	private Button registerBtn;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("usernameLbl")
	private TextField usernameLbl;
	@Id("passwordLbl")
	private PasswordField passwordLbl;

	public Button getResetPasswordBtn() {
		return resetPasswordBtn;
	}

	public void setResetPasswordBtn(Button resetPasswordBtn) {
		this.resetPasswordBtn = resetPasswordBtn;
	}

	public Button getLoginBtn() {
		return loginBtn;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public TextField getUsernameLbl() {
		return usernameLbl;
	}

	public PasswordField getPasswordLbl() {
		return passwordLbl;
	}

	public void setLoginBtn(Button loginBtn) {
		this.loginBtn = loginBtn;
	}

	public Button getRegisterBtn() {
		return registerBtn;
	}

	public void setRegisterBtn(Button registerBtn) {
		this.registerBtn = registerBtn;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	/**
     * Creates a new VistaLogin.
     */
    public VistaLogin() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaLogin and vista-login
     */
    public interface VistaLoginModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
