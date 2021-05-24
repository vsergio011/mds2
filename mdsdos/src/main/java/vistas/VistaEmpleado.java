package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-empleado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-empleado")
@JsModule("./src/vista-empleado.js")
public class VistaEmpleado extends PolymerTemplate<VistaEmpleado.VistaEmpleadoModel> {

    @Id("nombreEmpleadoLbl")
	private Label nombreEmpleadoLbl;
    
    @Id("mainViewEmp")
	private VerticalLayout mainViewEmp;
    

	public Label getNombreEmpleadoLbl() {
		return nombreEmpleadoLbl;
	}
	
	public VerticalLayout getMainViewEmp() {
		return mainViewEmp;
	}

	/**
     * Creates a new VistaEmpleado.
     */
    public VistaEmpleado() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEmpleado and vista-empleado
     */
    public interface VistaEmpleadoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
