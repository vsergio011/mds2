package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-transportista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-transportista")
@JsModule("./src/vista-transportista.js")
public class VistaTransportista extends PolymerTemplate<VistaTransportista.VistaTransportistaModel> {

    /**
     * Creates a new VistaTransportista.
     */
    public VistaTransportista() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaTransportista and vista-transportista
     */
    public interface VistaTransportistaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
