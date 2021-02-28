package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-detalleproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-detalleproducto")
@JsModule("./src/vista-detalleproducto.js")
public class VistaDetalleproducto extends PolymerTemplate<VistaDetalleproducto.VistaDetalleproductoModel> {

    /**
     * Creates a new VistaDetalleproducto.
     */
    public VistaDetalleproducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaDetalleproducto and vista-detalleproducto
     */
    public interface VistaDetalleproductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
