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
 * A Designer generated component for the vista-encargadodetallesdepedido template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-encargadodetallesdepedido")
@JsModule("./src/vista-encargadodetallesdepedido.js")
public class VistaEncargadodetallesdepedido extends PolymerTemplate<VistaEncargadodetallesdepedido.VistaEncargadodetallesdepedidoModel> {

	@Id("lbId")
	private Label lbId;
	
	@Id("lbDatosComprador")
	private Label lbDatosComprador;
	
	@Id("lbDireccionComprador")
	private Label lbDireccionComprador;
	
	@Id("lbFechaPedido")
	private Label lbFechaPedido;
	
	@Id("textTotal")
	private TextField textTotal;
	
	@Id("contenedorProductos")
	private VerticalLayout contenedorProductos;
	
	public Label getlbId() {
		return lbId;
	}
	
	public Label getlbDatosComprador() {
		return lbDatosComprador;
	}
	
	public Label getlbDireccionComprador() {
		return lbDireccionComprador;
	}
	
	public Label getlbFechaPedido() {
		return lbFechaPedido;
	}
	
	public TextField gettextTotal() {
		return textTotal;
	}
	
	public VerticalLayout getcontenedorProductos() {
		return contenedorProductos;
	}
	
	
	
    /**
     * Creates a new VistaEncargadodetallesdepedido.
     */
    public VistaEncargadodetallesdepedido() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEncargadodetallesdepedido and vista-encargadodetallesdepedido
     */
    public interface VistaEncargadodetallesdepedidoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
