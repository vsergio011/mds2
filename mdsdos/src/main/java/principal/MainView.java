package principal;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import appventawebbd.*;
import basededatos.BDPrincipal;
import tiendaVirtual.interfaz.Cibernauta_Registrado;
import tiendaVirtual.interfaz.Cibernauta_no_Registrado;

import java.util.List;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and
 * use @Route annotation to announce it in a URL as a Spring managed
 * bean.
 * Use the @PWA annotation make the application installable on phones,
 * tablets and some desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every
 * browser tab/window.
 */
@Route
@PWA(name = "Vaadin Application",
        shortName = "Vaadin App",
        description = "This is an example Vaadin application.",
        enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {

    /**
     * Construct a new Vaadin view.
     * <p>
     * Build the initial UI state for the user accessing the application.
     *
     * @param service The message service. Automatically injected Spring managed bean.
     */
    public MainView() {
    	Cibernauta_no_Registrado cnr = new Cibernauta_no_Registrado();
    	add(cnr);
    	
    	/*tiendaVirtual.interfaz.Administrador admin = new tiendaVirtual.interfaz.Administrador();
		add(admin);*/
		
		/*Cibernauta_Registrado cr = new Cibernauta_Registrado(1);
		add(cr);*/
    	
    	/*cnr._cabecera._login.getLoginBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				BDPrincipal bd = new BDPrincipal();
				String user = cnr._cabecera._login.getUsernameLbl().getValue();
				String password = cnr._cabecera._login.getPasswordLbl().getValue();
				
				Cibernauta ci = bd.getUsuarioLogin(user, password);
				if (ci != null) {
					Cibernauta_Registrado cr = new Cibernauta_Registrado(ci.getId());
					add(cr);
				}
				
			}
		});*/
    	
    	cnr._cabecera._login.getLoginBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				removeAll();	
				BDPrincipal bd = new BDPrincipal();
				String user = cnr._cabecera._login.getUsernameLbl().getValue();
				String password = cnr._cabecera._login.getPasswordLbl().getValue();
				
				switch (user) {
				case "cibernauta":
					Cibernauta_Registrado cr = new Cibernauta_Registrado((Cibernauta) bd.getUsuarioEmail("foo@example.com"));
					add(cr);
					break;
				case "admin":
					tiendaVirtual.interfaz.Administrador admin = new tiendaVirtual.interfaz.Administrador();
					add(admin);
					break;
				case "encargado":
					tiendaVirtual.interfaz.Encargado encargado = new tiendaVirtual.interfaz.Encargado((Cibernauta) bd.getUsuarioEmail("foo@example.com"));
					add(encargado);
					break;
				}				
			}
		});
    }

}
