package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-elementopedido template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-elementopedido")
@JsModule("./src/vista-elementopedido.js")
public class VistaElementopedido extends PolymerTemplate<VistaElementopedido.VistaElementopedidoModel> {

	@Id("pedidoBtnn")
	private Button pedidoBtnn;

	public Button getPedidoBtnn() {
		return pedidoBtnn;
	}

	/**
     * Creates a new VistaElementopedido.
     */
    public VistaElementopedido() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaElementopedido and vista-elementopedido
     */
    public interface VistaElementopedidoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
