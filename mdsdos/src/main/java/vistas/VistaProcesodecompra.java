package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-procesodecompra template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-procesodecompra")
@JsModule("./src/vista-procesodecompra.js")
public class VistaProcesodecompra extends PolymerTemplate<VistaProcesodecompra.VistaProcesodecompraModel> {

    @Id("btnCancelar")
	private Button btnCancelar;
	@Id("btnRealizarCompra")
	private Button btnRealizarCompra;
	@Id("btnCambiarDatosCompra")
	private Button btnCambiarDatosCompra;
	@Id("total")
	private Label total;
	@Id("PrecioGastosEnvio")
	private Label precioGastosEnvio;
	@Id("Precio")
	private Label precio;
	@Id("nProductos")
	private Label nProductos;

	public Button getBtnCancelar() {
		return btnCancelar;
	}

	public Button getBtnRealizarCompra() {
		return btnRealizarCompra;
	}

	public Button getBtnCambiarDatosCompra() {
		return btnCambiarDatosCompra;
	}

	public Label getTotal() {
		return total;
	}

	public Label getPrecioGastosEnvio() {
		return precioGastosEnvio;
	}

	public Label getPrecio() {
		return precio;
	}

	public Label getnProductos() {
		return nProductos;
	}

	/**
     * Creates a new VistaProcesodecompra.
     */
    public VistaProcesodecompra() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProcesodecompra and vista-procesodecompra
     */
    public interface VistaProcesodecompraModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
