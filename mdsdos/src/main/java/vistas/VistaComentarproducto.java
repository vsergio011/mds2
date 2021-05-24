package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Input;

/**
 * A Designer generated component for the vista-comentarproducto template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-comentarproducto")
@JsModule("./src/vista-comentarproducto.js")
public class VistaComentarproducto extends PolymerTemplate<VistaComentarproducto.VistaComentarproductoModel> {

    @Id("nombreProductoLbl")
	private Label nombreProductoLbl;
	@Id("comentarioTxt")
	private TextArea comentarioTxt;
	@Id("cancelarBtn")
	private Button cancelarBtn;
	@Id("valoracionInput")
	private Input valoracionInput;
	@Id("aceptarBtn")
	private Button aceptarBtn;

	public Button getAceptarBtn() {
		return aceptarBtn;
	}

	public Input getValoracionInput() {
		return valoracionInput;
	}

	public Label getNombreProductoLbl() {
		return nombreProductoLbl;
	}

	public TextArea getComentarioTxt() {
		return comentarioTxt;
	}

	public Button getCancelarBtn() {
		return cancelarBtn;
	}

	/**
     * Creates a new VistaComentarproducto.
     */
    public VistaComentarproducto() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaComentarproducto and vista-comentarproducto
     */
    public interface VistaComentarproductoModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
