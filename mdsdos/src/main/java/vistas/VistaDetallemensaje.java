package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-detallemensaje template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-detallemensaje")
@JsModule("./src/vista-detallemensaje.js")
public class VistaDetallemensaje extends PolymerTemplate<VistaDetallemensaje.VistaDetallemensajeModel> {

    /**
     * Creates a new VistaDetallemensaje.
     */
    public VistaDetallemensaje() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaDetallemensaje and vista-detallemensaje
     */
    public interface VistaDetallemensajeModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
