package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-compra template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-compra")
@JsModule("./src/vista-compra.js")
public class VistaCompra extends PolymerTemplate<VistaCompra.VistaCompraModel> {

    @Id("precioLbl")
	private Label precioLbl;
	@Id("verProductosBtn")
	private Button verProductosBtn;
	@Id("cancelarPedidoBtn")
	private Button cancelarPedidoBtn;
	@Id("estadoLbl")
	private Label estadoLbl;
	@Id("idLBL")
	private Label idLBL;
	@Id("fechaPedidoLbl")
	private Label fechaPedidoLbl;

	public Label getPrecioLbl() {
		return precioLbl;
	}

	public Button getVerProductosBtn() {
		return verProductosBtn;
	}

	public Button getCancelarPedidoBtn() {
		return cancelarPedidoBtn;
	}

	public Label getEstadoLbl() {
		return estadoLbl;
	}

	public Label getIdLBL() {
		return idLBL;
	}

	public Label getFechaPedidoLbl() {
		return fechaPedidoLbl;
	}

	/**
     * Creates a new VistaCompra.
     */
    public VistaCompra() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCompra and vista-compra
     */
    public interface VistaCompraModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
