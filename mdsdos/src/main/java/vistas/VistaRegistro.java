package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-registro template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-registro")
@JsModule("./src/vista-registro.js")
public class VistaRegistro extends PolymerTemplate<VistaRegistro.VistaRegistroModel> {

    @Id("editImgBtn")
	private Button editImgBtn;
	@Id("createAccountBtn")
	private Button createAccountBtn;
	@Id("cancelBtn")
	private Button cancelBtn;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("userLbl")
	private TextField userLbl;
	@Id("nombreLbl")
	private TextField nombreLbl;
	@Id("apellidosLbl")
	private TextField apellidosLbl;
	@Id("emailLbl")
	private TextField emailLbl;
	@Id("password")
	private PasswordField password;
	@Id("direccionLbl")
	private TextField direccionLbl;
	@Id("img")
	private Image img;

	/**
     * Creates a new VistaRegistro.
     */
    public VistaRegistro() {
        // You can initialise any data required for the connected UI components here.
    }

    public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public TextField getUserLbl() {
		return userLbl;
	}

	public TextField getNombreLbl() {
		return nombreLbl;
	}

	public TextField getApellidosLbl() {
		return apellidosLbl;
	}

	public TextField getEmailLbl() {
		return emailLbl;
	}

	public PasswordField getPassword() {
		return password;
	}

	public TextField getDireccionLbl() {
		return direccionLbl;
	}

	public Image getImg() {
		return img;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	/**
     * This model binds properties between VistaRegistro and vista-registro
     */
    public interface VistaRegistroModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

	public Button getEditImgBtn() {
		return editImgBtn;
	}

	public void setEditImgBtn(Button editImgBtn) {
		this.editImgBtn = editImgBtn;
	}

	public Button getCreateAccountBtn() {
		return createAccountBtn;
	}

	public void setCreateAccountBtn(Button createAccountBtn) {
		this.createAccountBtn = createAccountBtn;
	}

	public Button getCancelBtn() {
		return cancelBtn;
	}

	public void setCancelBtn(Button cancelBtn) {
		this.cancelBtn = cancelBtn;
	}
}
