package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-listadoproductooferta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listadoproductooferta")
@JsModule("./vista-listadoproductooferta.js")
public class VistaListadoproductooferta extends PolymerTemplate<VistaListadoproductooferta.VistaListadoproductoofertaModel> {

    /**
     * Creates a new VistaListadoproductooferta.
     */
    public VistaListadoproductooferta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaListadoproductooferta and vista-listadoproductooferta
     */
    public interface VistaListadoproductoofertaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
