package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-encargadocabecera template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-encargadocabecera")
@JsModule("./src/vista-encargadocabecera.js")
public class VistaEncargadocabecera extends PolymerTemplate<VistaEncargadocabecera.VistaEncargadocabeceraModel> {

	@Id("btnCerraSesion")
	private Button btnCerraSesion;
	
	
	@Id("btnMensajes")
	private Button btnMensajes;
	
	public Button getbtnMensajes() {
		return btnMensajes;
	}
	
	
	public Button getbtnCerraSesion() {
		return btnCerraSesion;
	}
	
	
    /**
     * Creates a new VistaEncargadocabecera.
     */
    public VistaEncargadocabecera() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEncargadocabecera and vista-encargadocabecera
     */
    public interface VistaEncargadocabeceraModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
