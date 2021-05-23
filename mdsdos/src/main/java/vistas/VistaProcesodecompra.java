package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-procesodecompra template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-procesodecompra")
@JsModule("./src/vista-procesodecompra.js")
public class VistaProcesodecompra extends PolymerTemplate<VistaProcesodecompra.VistaProcesodecompraModel> {

    /**
     * Creates a new VistaProcesodecompra.
     */
    public VistaProcesodecompra() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProcesodecompra and vista-procesodecompra
     */
    public interface VistaProcesodecompraModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
