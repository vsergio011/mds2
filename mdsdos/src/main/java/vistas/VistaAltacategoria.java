package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Input;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-altacategoria template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-altacategoria")
@JsModule("./src/vista-altacategoria.js")
public class VistaAltacategoria extends PolymerTemplate<VistaAltacategoria.VistaAltacategoriaModel> {

    @Id("categoriaNameLbl")
	private Input categoriaNameLbl;

	public Input getCategoriaNameLbl() {
		return categoriaNameLbl;
	}

	/**
     * Creates a new VistaAltacategoria.
     */
    public VistaAltacategoria() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAltacategoria and vista-altacategoria
     */
    public interface VistaAltacategoriaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
