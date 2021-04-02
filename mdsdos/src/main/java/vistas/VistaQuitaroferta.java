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
@Tag("vista-quitaroferta")
@JsModule("./src/vista-quitaroferta.js")
public class VistaQuitaroferta extends PolymerTemplate<VistaQuitaroferta.VistaQuitarofertaModel> {

    /**
     * Creates a new VistaAgregaroferta.
     */
    public VistaQuitaroferta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaAgregaroferta and vista-agregaroferta
     */
    public interface VistaQuitarofertaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
