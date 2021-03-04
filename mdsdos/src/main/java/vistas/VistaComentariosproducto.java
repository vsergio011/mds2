package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-comentariosproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-comentariosproducto")
@JsModule("./src/vista-comentariosproducto.js")
public class VistaComentariosproducto extends PolymerTemplate<VistaComentariosproducto.VistaComentariosproductoModel> {

    /**
     * Creates a new VistaComentariosproducto.
     */
    public VistaComentariosproducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaComentariosproducto and vista-comentariosproducto
     */
    public interface VistaComentariosproductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
