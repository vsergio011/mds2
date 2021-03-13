package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-cabecerapagina template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabecerapagina")
@JsModule("./src/vista-cabecerapagina.js")
public class VistaCabecerapagina extends PolymerTemplate<VistaCabecerapagina.VistaCabecerapaginaModel> {

    /**
     * Creates a new VistaCabecerapagina.
     */
    public VistaCabecerapagina() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaCabecerapagina and vista-cabecerapagina
     */
    public interface VistaCabecerapaginaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
