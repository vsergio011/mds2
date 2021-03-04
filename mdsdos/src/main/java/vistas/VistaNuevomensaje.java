package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-nuevomensaje template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-nuevomensaje")
@JsModule("./src/vista-nuevomensaje.js")
public class VistaNuevomensaje extends PolymerTemplate<VistaNuevomensaje.VistaNuevomensajeModel> {

    /**
     * Creates a new VistaNuevomensaje.
     */
    public VistaNuevomensaje() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaNuevomensaje and vista-nuevomensaje
     */
    public interface VistaNuevomensajeModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
