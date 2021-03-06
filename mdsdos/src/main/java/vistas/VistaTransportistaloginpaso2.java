package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-transportistaloginpaso2 template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-transportistaloginpaso2")
@JsModule("./src/vista-transportistaloginpaso2.js")
public class VistaTransportistaloginpaso2 extends PolymerTemplate<VistaTransportistaloginpaso2.VistaTransportistaloginpaso2Model> {

	@Id("InputPassword")
	private TextField InputPassword;
	
	@Id("btnSiguiente")
	private Button btnSiguiente;
	
	
	public TextField getInputPassword() {
		return InputPassword;
	}
	
	public Button getbtnSiguiente() {
		return btnSiguiente;
	}
	
	
    /**
     * Creates a new VistaTransportistaloginpaso2.
     */
    public VistaTransportistaloginpaso2() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaTransportistaloginpaso2 and vista-transportistaloginpaso2
     */
    public interface VistaTransportistaloginpaso2Model extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
