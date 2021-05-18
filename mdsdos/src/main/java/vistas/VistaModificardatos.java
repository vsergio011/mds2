package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-modificardatos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-modificardatos")
@JsModule("./src/vista-modificardatos.js")
public class VistaModificardatos extends PolymerTemplate<VistaModificardatos.VistaModificardatosModel> {

    @Id("datosPagoInput")
	private TextField datosPagoInput;
	@Id("direccionInput")
	private TextField direccionInput;
	@Id("nombreUsuarioInput")
	private TextField nombreUsuarioInput;
	public TextField getNomreInput() {
		return nomreInput;
	}

	@Id("dniInput")
	private TextField dniInput;
	public TextField getDatosPagoInput() {
		return datosPagoInput;
	}

	public TextField getDireccionInput() {
		return direccionInput;
	}

	public TextField getNombreUsuarioInput() {
		return nombreUsuarioInput;
	}

	public TextField getDniInput() {
		return dniInput;
	}

	public TextField getEmailInput() {
		return emailInput;
	}

	public TextField getApellidosInput() {
		return apellidosInput;
	}

	@Id("emailInput")
	private TextField emailInput;
	@Id("apellidosInput")
	private TextField apellidosInput;
	@Id("nomreInput")
	private TextField nomreInput;

	/**
     * Creates a new VistaModificardatos.
     */
    public VistaModificardatos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaModificardatos and vista-modificardatos
     */
    public interface VistaModificardatosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
