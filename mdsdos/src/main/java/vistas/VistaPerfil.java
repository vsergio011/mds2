package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-perfil template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-perfil")
@JsModule("./src/vista-perfil.js")
public class VistaPerfil extends PolymerTemplate<VistaPerfil.VistaPerfilModel> {

    /**
     * Creates a new VistaPerfil.
     */
    public VistaPerfil() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaPerfil and vista-perfil
     */
    public interface VistaPerfilModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
