package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

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

	/**
     * Creates a new VistaRegistro.
     */
    public VistaRegistro() {
        // You can initialise any data required for the connected UI components here.
    }

    public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
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
