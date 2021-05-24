package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-transportistaloginpaso1 template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-transportistaloginpaso1")
@JsModule("./src/vista-transportistaloginpaso1.js")
public class VistaTransportistaloginpaso1 extends PolymerTemplate<VistaTransportistaloginpaso1.VistaTransportistaloginpaso1Model> {
	
	@Id("InputUsuario")
	private TextField InputUsuario;
	@Id("btnSiguiente")
	private Button btnSiguiente;
	
	
	public TextField getInputUsuario() {
		return InputUsuario;
	}
	
	public Button getbtnSiguiente() {
		return btnSiguiente;
	}
	
    /**
     * Creates a new VistaTransportistaloginpaso1.
     */
    public VistaTransportistaloginpaso1() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaTransportistaloginpaso1 and vista-transportistaloginpaso1
     */
    public interface VistaTransportistaloginpaso1Model extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
