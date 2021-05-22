package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.checkbox.Checkbox;

/**
 * A Designer generated component for the vista-notificacion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-notificacion")
@JsModule("./src/vista-notificacion.js")
public class VistaNotificacion extends PolymerTemplate<VistaNotificacion.VistaNotificacionModel> {

    @Id("asuntoLbl")
	private Label asuntoLbl;
	@Id("msgLbl")
	private Label msgLbl;
	@Id("vaadinCheckbox")
	private Checkbox vaadinCheckbox;

	public Checkbox getVaadinCheckbox() {
		return vaadinCheckbox;
	}

	public Label getAsuntoLbl() {
		return asuntoLbl;
	}

	public Label getMsgLbl() {
		return msgLbl;
	}

	/**
     * Creates a new VistaNotificacion.
     */
    public VistaNotificacion() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaNotificacion and vista-notificacion
     */
    public interface VistaNotificacionModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
