package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-carrito template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-carrito")
@JsModule("./src/vista-carrito.js")
public class VistaCarrito extends PolymerTemplate<VistaCarrito.VistaCarritoModel> {

    /**
     * Creates a new VistaCarrito.
     */
    public VistaCarrito() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCarrito and vista-carrito
     */
    public interface VistaCarritoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
