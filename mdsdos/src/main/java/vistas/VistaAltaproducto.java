package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.html.Input;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.combobox.ComboBox;

/**
 * A Designer generated component for the vista-altaproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-altaproducto")
@JsModule("./src/vista-altaproducto.js")
public class VistaAltaproducto extends PolymerTemplate<VistaAltaproducto.VistaAltaproductoModel> {

    @Id("titleLbl")
	private Label titleLbl;
	@Id("descripcionInput")
	private TextArea descripcionInput;
	public Label getTitleLbl() {
		return titleLbl;
	}

	public TextArea getDescripcionInput() {
		return descripcionInput;
	}

	public TextArea getVaadinTextArea() {
		return vaadinTextArea;
	}

	public Input getInputTitulo() {
		return inputTitulo;
	}

	public Image getImg() {
		return img;
	}

	public Button getDeleteImgBtn() {
		return deleteImgBtn;
	}

	public Button getModificarImgBtn() {
		return modificarImgBtn;
	}

	public Button getAddImgBtn() {
		return addImgBtn;
	}

	public Button getCancelBtn() {
		return cancelBtn;
	}

	public Button getAddBtn() {
		return addBtn;
	}

	public TextField getProductoPrecio() {
		return productoPrecio;
	}

	public ComboBox<String> getProductoCategorias() {
		return productoCategorias;
	}
	
	public HorizontalLayout gethorizontalLYUpImg() {
		return horizontalLYUpImg;
	}
	public VerticalLayout getvlImages() {
		return vlImages;
	}
	
	@Id("vlImages")
	private VerticalLayout vlImages;
	@Id("horizontalLYUpImg")
	private HorizontalLayout horizontalLYUpImg;
	@Id("vaadinTextArea")
	private TextArea vaadinTextArea;
	@Id("inputTitulo")
	private Input inputTitulo;
	@Id("img")
	private Image img;
	@Id("deleteImgBtn")
	private Button deleteImgBtn;
	@Id("modificarImgBtn")
	private Button modificarImgBtn;
	@Id("addImgBtn")
	private Button addImgBtn;
	@Id("cancelBtn")
	private Button cancelBtn;
	@Id("addBtn")
	private Button addBtn;
	@Id("productoPrecio")
	private TextField productoPrecio;
	@Id("productoCategorias")
	private ComboBox<String> productoCategorias;

	/**
     * Creates a new VistaAltaproducto.
     */
    public VistaAltaproducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAltaproducto and vista-altaproducto
     */
    public interface VistaAltaproductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
