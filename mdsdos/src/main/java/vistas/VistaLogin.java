package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vista-login template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-login")
@JsModule("./src/vista-login.js")
public class VistaLogin extends PolymerTemplate<VistaLogin.VistaLoginModel> {

    /**
     * Creates a new VistaLogin.
     */
    public VistaLogin() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaLogin and vista-login
     */
    public interface VistaLoginModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
