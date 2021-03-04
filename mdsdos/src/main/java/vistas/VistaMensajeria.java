package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-mensajeria template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-mensajeria")
@JsModule("./src/vista-mensajeria.js")
public class VistaMensajeria extends PolymerTemplate<VistaMensajeria.VistaMensajeriaModel> {

    /**
     * Creates a new VistaMensajeria.
     */
    public VistaMensajeria() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaMensajeria and vista-mensajeria
     */
    public interface VistaMensajeriaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
