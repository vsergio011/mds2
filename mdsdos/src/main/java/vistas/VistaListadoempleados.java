package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-listadoempleados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listadoempleados")
@JsModule("./src/vista-listadoempleados.js")
public class VistaListadoempleados extends PolymerTemplate<VistaListadoempleados.VistaListadoempleadosModel> {

    /**
     * Creates a new VistaListadoempleados.
     */
    public VistaListadoempleados() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaListadoempleados and vista-listadoempleados
     */
    public interface VistaListadoempleadosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
