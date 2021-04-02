package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-listadeproductos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listadeproductos")
@JsModule("./src/vista-listadeproductos.js")
public class VistaListadeproductos extends PolymerTemplate<VistaListadeproductos.VistaListadeproductosModel> {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("label")
	private Label label;

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public Label getLabel() {
		return label;
	}

	/**
     * Creates a new VistaListadeproductos.
     */
    public VistaListadeproductos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaListadeproductos and vista-listadeproductos
     */
    public interface VistaListadeproductosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
