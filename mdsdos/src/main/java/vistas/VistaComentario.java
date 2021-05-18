package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-comentario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-comentario")
@JsModule("./src/vista-comentario.js")
public class VistaComentario extends PolymerTemplate<VistaComentario.VistaComentarioModel> {

    /**
     * Creates a new VistaComentario.
     */
    public VistaComentario() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaComentario and vista-comentario
     */
    public interface VistaComentarioModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
