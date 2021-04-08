package com.example.test;

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

import tiendaVirtual.interfaz.Cabecera_Pagina;
import tiendaVirtual.interfaz.Cibernauta;
import tiendaVirtual.interfaz.Cibernauta_Registrado;
import tiendaVirtual.interfaz.Cibernauta_no_Registrado;

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
    	Cibernauta_Registrado cr = new Cibernauta_Registrado();
    	
    	add(cnr);
    	
    	cnr._cabecera._login.getLoginBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				String user = "";
				user = cnr._cabecera._login.getUsernameLbl().getValue();
				
				System.out.println("USER : " + user);
				switch(user) {
				case "admin":
					break;
				case "cibernauta":
					break;
				case "transportista":
					break;
				case "encargado":
					break;
				default:
					System.out.println("NO DEBERIA ENTRAR AQUI.");
				}
			}
		});
    	
    	
    	// TODO: Controlar aqui el login.
    }

}
