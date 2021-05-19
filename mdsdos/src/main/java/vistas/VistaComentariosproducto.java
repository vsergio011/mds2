package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-comentariosproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-comentariosproducto")
@JsModule("./src/vista-comentariosproducto.js")
public class VistaComentariosproducto extends PolymerTemplate<VistaComentariosproducto.VistaComentariosproductoModel> {

	@Id("valoracionLbl")
	private Label valoracionLbl;
	@Id("titleLbl")
	private Label titleLbl;
	@Id("addCarritoBtn")
	private Button addCarritoBtn;
	@Id("backProductBtn")
	private Button backProductBtn;
	@Id("listaComentarios")
	private Element listaComentarios;

	public Label getValoracionLbl() {
		return valoracionLbl;
	}

	public Label getTitleLbl() {
		return titleLbl;
	}

	public Button getAddCarritoBtn() {
		return addCarritoBtn;
	}

	public Button getBackProductBtn() {
		return backProductBtn;
	}

	public Element getListaComentarios() {
		return listaComentarios;
	}

	/**
     * Creates a new VistaComentariosproducto.
     */
    public VistaComentariosproducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaComentariosproducto and vista-comentariosproducto
     */
    public interface VistaComentariosproductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
