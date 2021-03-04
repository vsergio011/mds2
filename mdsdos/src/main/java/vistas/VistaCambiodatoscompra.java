package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-cambiodatoscompra template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cambiodatoscompra")
@JsModule("./src/vista-cambiodatoscompra.js")
public class VistaCambiodatoscompra extends PolymerTemplate<VistaCambiodatoscompra.VistaCambiodatoscompraModel> {

    /**
     * Creates a new VistaCambiodatoscompra.
     */
    public VistaCambiodatoscompra() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCambiodatoscompra and vista-cambiodatoscompra
     */
    public interface VistaCambiodatoscompraModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
