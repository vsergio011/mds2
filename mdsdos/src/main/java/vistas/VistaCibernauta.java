package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-cibernauta template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cibernauta")
@JsModule("./src/vista-cibernauta.js")
public class VistaCibernauta extends PolymerTemplate<VistaCibernauta.VistaCibernautaModel> {

    /**
     * Creates a new VistaCibernauta.
     */
    public VistaCibernauta() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCibernauta and vista-cibernauta
     */
    public interface VistaCibernautaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
