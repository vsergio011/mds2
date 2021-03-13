package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-ofertaspopulares template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ofertaspopulares")
@JsModule("./src/vista-ofertaspopulares.js")
public class VistaOfertaspopulares extends PolymerTemplate<VistaOfertaspopulares.VistaOfertaspopularesModel> {
	
	@Id("vaadinHorizontalLayout")
    private Element vaadinHorizontalLayout;
	 
    /**
     * Creates a new VistaOfertaspopulares.
     */
    public VistaOfertaspopulares() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaOfertaspopulares and vista-ofertaspopulares
     */
    public interface VistaOfertaspopularesModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
    
    public Element getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(Element vaadinVerticalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}
}
