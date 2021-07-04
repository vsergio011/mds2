package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.checkbox.Checkbox;

/**
 * A Designer generated component for the vista-encargadodetallesdepedido template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-encargadodetallesdepedido")
@JsModule("./src/vista-encargadodetallesdepedido.js")
public class VistaEncargadodetallesdepedido extends PolymerTemplate<VistaEncargadodetallesdepedido.VistaEncargadodetallesdepedidoModel> {

    @Id("textTotal")
	private TextField textTotal;
	@Id("contenedorProductos")
	private Element contenedorProductos;
	@Id("lbDireccionComprador")
	private Label lbDireccionComprador;
	@Id("lbDatosComprador")
	private Label lbDatosComprador;
	@Id("lbFechaPedido")
	private Label lbFechaPedido;
	@Id("checkEnviado")
	private Checkbox checkEnviado;
	@Id("checkRecibido")
	private Checkbox checkRecibido;
	@Id("aprobarBtn")
	private Button aprobarBtn;
	@Id("identificadorLbl")
	private Label identificadorLbl;
	@Id("recibidoBtn")
	private Button recibidoBtn;
	@Id("formapagoLbl")
	private Label formapagoLbl;

	public Label getFormapagoLbl() {
		return formapagoLbl;
	}

	public Button getRecibidoBtn() {
		return recibidoBtn;
	}

	public Label getIdentificadorLbl() {
		return identificadorLbl;
	}

	public TextField getTextTotal() {
		return textTotal;
	}

	public Element getContenedorProductos() {
		return contenedorProductos;
	}

	public Label getLbDireccionComprador() {
		return lbDireccionComprador;
	}

	public Label getLbDatosComprador() {
		return lbDatosComprador;
	}

	public Label getLbFechaPedido() {
		return lbFechaPedido;
	}

	public Checkbox getCheckEnviado() {
		return checkEnviado;
	}

	public Checkbox getCheckRecibido() {
		return checkRecibido;
	}

	public Button getAprobarBtn() {
		return aprobarBtn;
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
