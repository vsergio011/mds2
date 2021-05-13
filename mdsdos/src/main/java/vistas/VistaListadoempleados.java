package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.UnorderedList;

/**
 * A Designer generated component for the vista-listadoempleados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listadoempleados")
@JsModule("./src/vista-listadoempleados.js")
public class VistaListadoempleados extends PolymerTemplate<VistaListadoempleados.VistaListadoempleadosModel> {

	@Id("empleadosLayout")
	private Element empleadosLayout;
	public Element getEmpleadosLayout() {
		return empleadosLayout;
	}

	public Button getVerEmpleadoBtn() {
		return verEmpleadoBtn;
	}

	@Id("verEmpleadoBtn")
	private Button verEmpleadoBtn;

	/**
     * Creates a new VistaListadoempleados.
     */
    public VistaListadoempleados() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaListadoempleados and vista-listadoempleados
     */
    public interface VistaListadoempleadosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
