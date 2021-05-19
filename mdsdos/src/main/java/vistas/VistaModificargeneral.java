package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-modificargeneral template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-modificargeneral")
@JsModule("./src/vista-modificargeneral.js")
public class VistaModificargeneral extends PolymerTemplate<VistaModificargeneral.VistaModificargeneralModel> {

    /**
     * Creates a new VistaModificargeneral.
     */
    public VistaModificargeneral() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaModificargeneral and vista-modificargeneral
     */
    public interface VistaModificargeneralModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
