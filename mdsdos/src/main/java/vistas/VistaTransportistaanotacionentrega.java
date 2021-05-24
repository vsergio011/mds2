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
 * A Designer generated component for the vista-transportistaanotacionentrega template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-transportistaanotacionentrega")
@JsModule("./src/vista-transportistaanotacionentrega.js")
public class VistaTransportistaanotacionentrega extends PolymerTemplate<VistaTransportistaanotacionentrega.VistaTransportistaanotacionentregaModel> {
	
	@Id("btnPedidoRecibido")
	private Button btnPedidoRecibido;
	@Id("btnExit")
	private Button btnExit;
	@Id("idPedido")
	private Label idPedido;
	@Id("containerPedido")
	private VerticalLayout containerPedido;
	
	public Button getbtnExit() {
		return btnExit;
	}
	
	public Label getidPedido() {
		return idPedido;
	}
	
	public VerticalLayout getcontainerPedido() {
		return containerPedido;
	}
	
	public Button getbtnPedidoRecibido() {
		return btnPedidoRecibido;
	}
	
	
	
	
    /**
     * Creates a new VistaTransportistaanotacionentrega.
     */
    public VistaTransportistaanotacionentrega() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaTransportistaanotacionentrega and vista-transportistaanotacionentrega
     */
    public interface VistaTransportistaanotacionentregaModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
