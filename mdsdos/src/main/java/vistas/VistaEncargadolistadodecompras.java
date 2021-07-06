package vistas;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-encargadolistadodecompras template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-encargadolistadodecompras")
@JsModule("./src/vista-encargadolistadodecompras.js")
public class VistaEncargadolistadodecompras extends PolymerTemplate<VistaEncargadolistadodecompras.VistaEncargadolistadodecomprasModel> {
	
	@Id("btnNuevo")
	private Button btnNuevo;
	
	@Id("btnEnviado")
	private Button btnEnviado;
	
	@Id("btnRecibido")
	private Button btnRecibido;
	
	@Id("contenedorPedidos")
	private VerticalLayout contenedorPedidos;

	@Id("btnAll")
	private Button btnAll;

	public Button getBtnAll() {
		return btnAll;
	}
	public Button getBtnNuevo() {
		return btnNuevo;
	}
	public Button getBtnEnviado() {
		return btnEnviado;
	}
	public Button getBtnRecibido() {
		return btnRecibido;
	}
	public VerticalLayout getContenedorPedidos() {
		return contenedorPedidos;
	}	
	public Button getbtnNuevo() {
		return btnNuevo;
	}
	public Button getbtnEnviado() {
		return btnEnviado;
	}
	public Button getbtnRecibido() {
		return btnRecibido;
	}	
	public VerticalLayout getcontenedorPedidos() {
		return contenedorPedidos;
	}
	
	
    /**
     * Creates a new VistaEncargadolistadodecompras.
     */
    public VistaEncargadolistadodecompras() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between VistaEncargadolistadodecompras and vista-encargadolistadodecompras
     */
    public interface VistaEncargadolistadodecomprasModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
