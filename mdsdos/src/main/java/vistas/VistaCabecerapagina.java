package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.combobox.ComboBox;

/**
 * A Designer generated component for the vista-cabecerapagina template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabecerapagina")
@JsModule("./src/vista-cabecerapagina.js")
public class VistaCabecerapagina extends PolymerTemplate<VistaCabecerapagina.VistaCabecerapaginaModel> {

    public Button getOffertasButton() {
		return offertasButton;
	}

	@Id("btnLogin")
	private Button btnLogin;

	public ComboBox<String> getCategoriesCombo() {
		return categoriesCombo;
	}

	public void setCategoriesCombo(ComboBox<String> categoriesCombo) {
		this.categoriesCombo = categoriesCombo;
	}

	public Button getOfferBtn() {
		return offerBtn;
	}

	public void setOfferBtn(Button offerBtn) {
		this.offerBtn = offerBtn;
	}

	@Id("searchInput")
	private TextField inputSearch;
	@Id("btnCarrito")
	private Button btnCarrito;
	public Button getLimpiarBtn() {
		return limpiarBtn;
	}

	public Button getPerfilBtn() {
		return perfilBtn;
	}

	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("offerBtn")
	private Button offerBtn;
	@Id("categoriesCombo")
	private ComboBox<String> categoriesCombo;
	@Id("perfilBtn")
	private Button perfilBtn;
	@Id("adminBtn")
	private Button adminBtn;
	@Id("limpiarBtn")
	private Button limpiarBtn;
	@Id("offertasButton")
	private Button offertasButton;
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

	public Button getAdminBtn() {
		return adminBtn;
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
