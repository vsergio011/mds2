package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-detallecompra template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-detallecompra")
@JsModule("./src/vista-detallecompra.js")
public class VistaDetallecompra extends PolymerTemplate<VistaDetallecompra.VistaDetallecompraModel> {

    /**
     * Creates a new VistaDetallecompra.
     */
    public VistaDetallecompra() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaDetallecompra and vista-detallecompra
     */
    public interface VistaDetallecompraModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
