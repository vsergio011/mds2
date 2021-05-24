package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-cambiodatoscompra template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cambiodatoscompra")
@JsModule("./src/vista-cambiodatoscompra.js")
public class VistaCambiodatoscompra extends PolymerTemplate<VistaCambiodatoscompra.VistaCambiodatoscompraModel> {

    @Id("datosPagoInput")
	private TextField datosPagoInput;
	@Id("direccionInput")
	private TextField direccionInput;
	@Id("aceptarBtn")
	private Button aceptarBtn;
	@Id("cancelarBtn")
	private Button cancelarBtn;

	public TextField getDatosPagoInput() {
		return datosPagoInput;
	}

	public TextField getDireccionInput() {
		return direccionInput;
	}

	public Button getAceptarBtn() {
		return aceptarBtn;
	}

	public Button getCancelarBtn() {
		return cancelarBtn;
	}

	/**
     * Creates a new VistaCambiodatoscompra.
     */
    public VistaCambiodatoscompra() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCambiodatoscompra and vista-cambiodatoscompra
     */
    public interface VistaCambiodatoscompraModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
