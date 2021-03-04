package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-listacomprasnocliente template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listacomprasnocliente")
@JsModule("./src/vista-listacomprasnocliente.js")
public class VistaListacomprasnocliente extends PolymerTemplate<VistaListacomprasnocliente.VistaListacomprasnoclienteModel> {

    /**
     * Creates a new VistaListacomprasnocliente.
     */
    public VistaListacomprasnocliente() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaListacomprasnocliente and vista-listacomprasnocliente
     */
    public interface VistaListacomprasnoclienteModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
