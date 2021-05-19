package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-modificardatos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-modificardatos")
@JsModule("./src/vista-modificardatos.js")
public class VistaModificardatos extends PolymerTemplate<VistaModificardatos.VistaModificardatosModel> {

    /**
     * Creates a new VistaModificardatos.
     */
    public VistaModificardatos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaModificardatos and vista-modificardatos
     */
    public interface VistaModificardatosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
