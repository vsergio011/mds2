package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-listadocompras template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listadocompras")
@JsModule("./src/vista-listadocompras.js")
public class VistaListadocompras extends PolymerTemplate<VistaListadocompras.VistaListadocomprasModel> {

    /**
     * Creates a new VistaListadocompras.
     */
    public VistaListadocompras() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaListadocompras and vista-listadocompras
     */
    public interface VistaListadocomprasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
