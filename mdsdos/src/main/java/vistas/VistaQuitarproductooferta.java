package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-quitarproductooferta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-quitarproductooferta")
@JsModule("./src/vista-quitarproductooferta.js")
public class VistaQuitarproductooferta extends PolymerTemplate<VistaQuitarproductooferta.VistaQuitarproductoofertaModel> {

    /**
     * Creates a new VistaQuitarproductooferta.
     */
    public VistaQuitarproductooferta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaQuitarproductooferta and vista-quitarproductooferta
     */
    public interface VistaQuitarproductoofertaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
