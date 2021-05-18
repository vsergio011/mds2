package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-altaproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-altaproducto")
@JsModule("./src/vista-altaproducto.js")
public class VistaAltaproducto extends PolymerTemplate<VistaAltaproducto.VistaAltaproductoModel> {

    /**
     * Creates a new VistaAltaproducto.
     */
    public VistaAltaproducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAltaproducto and vista-altaproducto
     */
    public interface VistaAltaproductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
