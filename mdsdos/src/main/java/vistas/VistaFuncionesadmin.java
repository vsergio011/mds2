package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-funcionesadmin template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-funcionesadmin")
@JsModule("./src/vista-funcionesadmin.js")
public class VistaFuncionesadmin extends PolymerTemplate<VistaFuncionesadmin.VistaFuncionesadminModel> {

    @Id("addCategoriaBtn")
	private Button addCategoriaBtn;
	@Id("addProductoBtn")
	private Button addProductoBtn;
	@Id("modificarEmpleadoBtn")
	private Button modificarEmpleadoBtn;

	public Button getAddCategoriaBtn() {
		return addCategoriaBtn;
	}

	public Button getAddProductoBtn() {
		return addProductoBtn;
	}

	public Button getModificarEmpleadoBtn() {
		return modificarEmpleadoBtn;
	}

	/**
     * Creates a new VistaFuncionesadmin.
     */
    public VistaFuncionesadmin() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaFuncionesadmin and vista-funcionesadmin
     */
    public interface VistaFuncionesadminModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
