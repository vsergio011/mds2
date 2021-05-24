package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.charts.model.Label;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-transportistalistadopedidos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-transportistalistadopedidos")
@JsModule("./src/vista-transportistalistadopedidos.js")
public class VistaTransportistalistadopedidos extends PolymerTemplate<VistaTransportistalistadopedidos.VistaTransportistalistadopedidosModel> {

	@Id("btnExit")
	private Button btnExit;
	@Id("inputBusqueda")
	private TextField inputBusqueda;
	@Id("containerPedido")
	private VerticalLayout containerPedido;
	
	public Button getbtnExit() {
		return btnExit;
	}
	
	public TextField getinputBusqueda() {
		return inputBusqueda;
	}
	
	public VerticalLayout getcontainerPedido() {
		return containerPedido;
	}
	
	
    /**
     * Creates a new VistaTransportistalistadopedidos.
     */
    public VistaTransportistalistadopedidos() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaTransportistalistadopedidos and vista-transportistalistadopedidos
     */
    public interface VistaTransportistalistadopedidosModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
