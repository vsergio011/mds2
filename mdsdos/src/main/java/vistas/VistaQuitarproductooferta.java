package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-quitarproductooferta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-quitarproductooferta")
@JsModule("./src/vista-quitarproductooferta.js")
public class VistaQuitarproductooferta extends PolymerTemplate<VistaQuitarproductooferta.VistaQuitarproductoofertaModel> {

    @Id("cancelarBtn")
	private Button cancelarBtn;
	@Id("aceptarBtn")
	private Button aceptarBtn;
	@Id("idProductoLbl")
	private Label idProductoLbl;
	@Id("precioOriginalInput")
	private TextField precioOriginalInput;
	@Id("precioFinalInput")
	private TextField precioFinalInput;
	@Id("fechaFinLbl")
	private TextField fechaFinLbl;

	public TextField getFechaFinLbl() {
		return fechaFinLbl;
	}

	public Button getCancelarBtn() {
		return cancelarBtn;
	}

	public Button getAceptarBtn() {
		return aceptarBtn;
	}

	public Label getIdProductoLbl() {
		return idProductoLbl;
	}

	public TextField getPrecioOriginalInput() {
		return precioOriginalInput;
	}

	public TextField getPrecioFinalInput() {
		return precioFinalInput;
	}

	/**
     * Creates a new VistaQuitarproductooferta.
     */
    public VistaQuitarproductooferta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaQuitarproductooferta and vista-quitarproductooferta
     */
    public interface VistaQuitarproductoofertaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
