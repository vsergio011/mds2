package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.select.Select;

/**
 * A Designer generated component for the vista-productopedido template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productopedido")
@JsModule("./src/vista-productopedido.js")
public class VistaProductopedido extends PolymerTemplate<VistaProductopedido.VistaProductopedidoModel> {

	@Id("precioUnidadLbl")
	private Label precioUnidadLbl;
	@Id("comentarBtn")
	private Button comEntarBtn;
	@Id("deleteBtn")
	private Button deleteBtn;

	public ComboBox<String> getVaadinComboBox() {
		return vaadinComboBox;
	}

	public Label getValoracionLbl() {
		return valoracionLbl;
	}

	public Label getUnidadesLbl() {
		return unidadesLbl;
	}

	public Label getPrecioUnidadLbl() {
		return precioUnidadLbl;
	}

	public Image getImgProducto() {
		return imgProducto;
	}

	public void setPrecioUnidadLbl(Label precioUnidadLbl) {
		this.precioUnidadLbl = precioUnidadLbl;
	}

	public void setComEntarBtn(Button comEntarBtn) {
		this.comEntarBtn = comEntarBtn;
	}

	public void setDeleteBtn(Button deleteBtn) {
		this.deleteBtn = deleteBtn;
	}

	public void setPrecioEurosLbl(Label precioEurosLbl) {
		this.precioEurosLbl = precioEurosLbl;
	}

	public void setNombreProductoLbl(Label nombreProductoLbl) {
		this.nombreProductoLbl = nombreProductoLbl;
	}

	public void setDescripProducLbl(Label descripProducLbl) {
		this.descripProducLbl = descripProducLbl;
	}

	public Button getComEntarBtn() {
		return comEntarBtn;
	}

	public Button getDeleteBtn() {
		return deleteBtn;
	}

	public Label getPrecioEurosLbl() {
		return precioEurosLbl;
	}

	public Label getNombreProductoLbl() {
		return nombreProductoLbl;
	}

	public Label getDescripProducLbl() {
		return descripProducLbl;
	}

	@Id("precioEurosLbl")
	private Label precioEurosLbl;
	@Id("nombreProductoLbl")
	private Label nombreProductoLbl;
	@Id("descripProducLbl")
	private Label descripProducLbl;
	@Id("imgProducto")
	private Image imgProducto;
	@Id("valoracionLbl")
	private Label valoracionLbl;
	@Id("unidadesLbl")
	private Label unidadesLbl;
	@Id("vaadinComboBox")
	private ComboBox<String> vaadinComboBox;
	@Id("comentarBtn")
	private Button comentarBtn;
	/**
     * Creates a new VistaProductopedido.
     */
    public VistaProductopedido() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProductopedido and vista-productopedido
     */
    public interface VistaProductopedidoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
