package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-producto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-producto")
@JsModule("./src/vista-producto.js")
public class VistaProducto extends PolymerTemplate<VistaProducto.VistaProductoModel> {

    public Button getMoreInfoBtn() {
		return moreInfoBtn;
	}

	public Label getProductLbl() {
		return productLbl;
	}

	public Image getImgProducto() {
		return imgProducto;
	}

	public void setImgProducto(Image imgProducto) {
		this.imgProducto = imgProducto;
	}

	@Id("imgProducto")
	private Image imgProducto;
	@Id("moreInfoBtn")
	private Button moreInfoBtn;
	@Id("productLbl")
	private Label productLbl;
	@Id("addOffertaBtn")
	private Button addOffertaBtn;
	@Id("quitarOfertaBtn")
	private Button quitarOfertaBtn;
	@Id("label")
	private Label label;
	@Id("addCarritoBtn")
	private Button addCarritoBtn;

	public Button getAddCarritoBtn() {
		return addCarritoBtn;
	}

	public Button getAddOffertaBtn() {
		return addOffertaBtn;
	}

	public Button getQuitarOfertaBtn() {
		return quitarOfertaBtn;
	}

	public Label getLabel() {
		return label;
	}

	/**
     * Creates a new VistaProducto.
     */
    public VistaProducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaProducto and vista-producto
     */
    public interface VistaProductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
