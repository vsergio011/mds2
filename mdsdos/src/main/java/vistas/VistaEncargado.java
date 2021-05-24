package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-encargado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-encargado")
@JsModule("./src/vista-encargado.js")
public class VistaEncargado extends PolymerTemplate<VistaEncargado.VistaEncargadoModel> {

	@Id("mainContainer")
	private VerticalLayout mainContainer;
	
	public VerticalLayout getmainContainer() {
		return mainContainer;
	}
	
    /**
     * Creates a new VistaEncargado.
     */
    public VistaEncargado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEncargado and vista-encargado
     */
    public interface VistaEncargadoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
