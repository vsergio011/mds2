package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.UnorderedList;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-listadoempleados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listadoempleados")
@JsModule("./src/vista-listadoempleados.js")
public class VistaListadoempleados extends PolymerTemplate<VistaListadoempleados.VistaListadoempleadosModel> {

	@Id("verEmpleadoBtn")
	private Button verEmpleadoBtn;
	public Button getVerEmpleadoBtn() {
		return verEmpleadoBtn;
	}

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	public TextField getVaadinTextField() {
		return vaadinTextField;
	}

	@Id("vaadinTextField")
	private TextField vaadinTextField;

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

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
