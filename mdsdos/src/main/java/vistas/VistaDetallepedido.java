package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-detallepedido template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-detallepedido")
@JsModule("./src/vista-detallepedido.js")
public class VistaDetallepedido extends PolymerTemplate<VistaDetallepedido.VistaDetallepedidoModel> {

    /**
     * Creates a new VistaDetallepedido.
     */
    public VistaDetallepedido() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaDetallepedido and vista-detallepedido
     */
    public interface VistaDetallepedidoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
