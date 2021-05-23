package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-listacomprasanteriores template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listacomprasanteriores")
@JsModule("./src/vista-listacomprasanteriores.js")
public class VistaListacomprasanteriores extends PolymerTemplate<VistaListacomprasanteriores.VistaListacomprasanterioresModel> {

    /**
     * Creates a new VistaListacomprasanteriores.
     */
    public VistaListacomprasanteriores() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaListacomprasanteriores and vista-listacomprasanteriores
     */
    public interface VistaListacomprasanterioresModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
