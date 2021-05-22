package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-notificaciones template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-notificaciones")
@JsModule("./src/vista-notificaciones.js")
public class VistaNotificaciones extends PolymerTemplate<VistaNotificaciones.VistaNotificacionesModel> {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	/**
     * Creates a new VistaNotificaciones.
     */
    public VistaNotificaciones() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaNotificaciones and vista-notificaciones
     */
    public interface VistaNotificacionesModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
