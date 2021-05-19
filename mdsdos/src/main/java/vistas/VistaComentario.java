package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.Id;

/**
 * A Designer generated component for the vista-comentario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-comentario")
@JsModule("./src/vista-comentario.js")
public class VistaComentario extends PolymerTemplate<VistaComentario.VistaComentarioModel> {

    @Id("valoracionTexto")
	private Label valoracionTexto;
	@Id("valoracion")
	private Label valoracion;
	@Id("valoracionUsuario")
	private Label valoracionUsuario;
	public Label getValoracionTexto() {
		return valoracionTexto;
	}

	public Label getValoracion() {
		return valoracion;
	}

	public Label getValoracionUsuario() {
		return valoracionUsuario;
	}

	public Label getValoracionNumero() {
		return valoracionNumero;
	}

	@Id("valoracionNumero")
	private Label valoracionNumero;

	/**
     * Creates a new VistaComentario.
     */
    public VistaComentario() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaComentario and vista-comentario
     */
    public interface VistaComentarioModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
