package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-carrito template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-carrito")
@JsModule("./src/vista-carrito.js")
public class VistaCarrito extends PolymerTemplate<VistaCarrito.VistaCarritoModel> {

    public Element getProductosLayout() {
		return productosLayout;
	}

	public Button getComprarBtn() {
		return comprarBtn;
	}

	@Id("productosLayout")
	private Element productosLayout;
	@Id("comprarBtn")
	private Button comprarBtn;
	@Id("registerBtn")
	private Button registerBtn;
	@Id("priceLbl")
	private Label priceLbl;


	public Label getPriceLbl() {
		return priceLbl;
	}

	public Button getRegisterBtn() {
		return registerBtn;
	}

	/**
     * Creates a new VistaCarrito.
     */
    public VistaCarrito() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCarrito and vista-carrito
     */
    public interface VistaCarritoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
