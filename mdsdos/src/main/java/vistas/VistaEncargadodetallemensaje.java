package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-encargadodetallemensaje template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-encargadodetallemensaje")
@JsModule("./src/vista-encargadodetallemensaje.js")
public class VistaEncargadodetallemensaje extends PolymerTemplate<VistaEncargadodetallemensaje.VistaEncargadodetallemensajeModel> {

    /**
     * Creates a new VistaEncargadodetallemensaje.
     */
    public VistaEncargadodetallemensaje() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEncargadodetallemensaje and vista-encargadodetallemensaje
     */
    public interface VistaEncargadodetallemensajeModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
