package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-agregaroferta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-agregaroferta")
@JsModule("./src/vista-agregaroferta.js")
public class VistaAgregaroferta extends PolymerTemplate<VistaAgregaroferta.VistaAgregarofertaModel> {

    /**
     * Creates a new VistaAgregaroferta.
     */
    public VistaAgregaroferta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAgregaroferta and vista-agregaroferta
     */
    public interface VistaAgregarofertaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
