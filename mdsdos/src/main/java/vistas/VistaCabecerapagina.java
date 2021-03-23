package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-cabecerapagina template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabecerapagina")
@JsModule("./src/vista-cabecerapagina.js")
public class VistaCabecerapagina extends PolymerTemplate<VistaCabecerapagina.VistaCabecerapaginaModel> {

    @Id("btnLogin")
	private Button btnLogin;
	@Id("inputSearch")
	private TextField inputSearch;
	@Id("btnCarrito")
	private Button btnCarrito;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	public Button getBtnLogin() {
		return btnLogin;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public TextField getInputSearch() {
		return inputSearch;
	}

	public void setInputSearch(TextField inputSearch) {
		this.inputSearch = inputSearch;
	}

	public Button getBtnCarrito() {
		return btnCarrito;
	}

	public void setBtnCarrito(Button btnCarrito) {
		this.btnCarrito = btnCarrito;
	}

	public void setBtnLogin(Button btnLogin) {
		this.btnLogin = btnLogin;
	}

	/**
     * Creates a new VistaCabecerapagina.
     */
    public VistaCabecerapagina() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCabecerapagina and vista-cabecerapagina
     */
    public interface VistaCabecerapaginaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
