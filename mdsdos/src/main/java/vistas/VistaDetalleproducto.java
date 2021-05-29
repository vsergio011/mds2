package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-detalleproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-detalleproducto")
@JsModule("./src/vista-detalleproducto.js")
public class VistaDetalleproducto extends PolymerTemplate<VistaDetalleproducto.VistaDetalleproductoModel> {

    @Id("img")
	private Image img;
	@Id("descriptionLabel")
	private Label descriptionLabel;
	public Image getImg() {
		return img;
	}

	public Button getAnadirACarritoBtn() {
		return anadirACarritoBtn;
	}

	public TextArea getVaadinTextArea() {
		return vaadinTextArea;
	}

	public Label getDescriptionLabel() {
		return descriptionLabel;
	}

	public Label getLabel() {
		return label;
	}

	public Label getRateLabel() {
		return rateLabel;
	}

	public Button getUpdateBtn() {
		return updateBtn;
	}

	public Button getViewComentsBtn() {
		return viewComentsBtn;
	}

	public Label getPriceLAbel() {
		return priceLAbel;
	}

	public Button getDeleteBtn() {
		return deleteBtn;
	}

	public Button getAddOfferBtn() {
		return addOfferBtn;
	}

	@Id("label")
	private Label label;
	@Id("rateLabel")
	private Label rateLabel;
	@Id("updateBtn")
	private Button updateBtn;
	@Id("viewComentsBtn")
	private Button viewComentsBtn;
	@Id("priceLAbel")
	private Label priceLAbel;
	@Id("deleteBtn")
	private Button deleteBtn;
	@Id("addOfferBtn")
	private Button addOfferBtn;
	@Id("anadirACarritoBtn")
	private Button anadirACarritoBtn;
	@Id("vaadinTextArea")
	private TextArea vaadinTextArea;
	@Id("lyimagenesLateral")
	private Element lyimagenesLateral;
	@Id("btnBorradoProducto")
	private Button btnBorradoProducto;

	public Button getBtnBorradoProducto() {
		return btnBorradoProducto;
	}

	public Element getLyimagenesLateral() {
		return lyimagenesLateral;
	}
	
	/**
     * Creates a new VistaDetalleproducto.
     */
    public VistaDetalleproducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaDetalleproducto and vista-detalleproducto
     */
    public interface VistaDetalleproductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
