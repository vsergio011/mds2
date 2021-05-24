package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-detallecompra template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-detallecompra")
@JsModule("./src/vista-detallecompra.js")
public class VistaDetallecompra extends PolymerTemplate<VistaDetallecompra.VistaDetallecompraModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("cancelarCompraBtn")
	private Button cancelarCompraBtn;
	@Id("idPedido")
	private Label idPedido;
	@Id("label")
	private Label label;
	@Id("total")
	private TextField total;

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public Button getCancelarCompraBtn() {
		return cancelarCompraBtn;
	}

	public Label getIdPedido() {
		return idPedido;
	}

	public Label getLabel() {
		return label;
	}

	public TextField getTotal() {
		return total;
	}

	/**
     * Creates a new VistaDetallecompra.
     */
    public VistaDetallecompra() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaDetallecompra and vista-detallecompra
     */
    public interface VistaDetallecompraModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
