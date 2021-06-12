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

import Helpers.Cookies;
import Helpers.Cookies.TipoUsuario;
import appventawebbd.*;
import basededatos.BDPrincipal;
import basededatos.iCibernauta_no_Registrado;
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

	private Cookies cookies = null;
    /**
     * Construct a new Vaadin view.
     * <p>
     * Build the initial UI state for the user accessing the application.
     *
     * @param service The message service. Automatically injected Spring managed bean.
     */
    public MainView() {
    	cookies = new Cookies();
    	
    	boolean exists = false;
    	switch (cookies.getTipoUsuario()) {
		case ADMINISTRADOR:
			Administrador admin = cookies.getAdministrador();
			tiendaVirtual.interfaz.Administrador administrador = new tiendaVirtual.interfaz.Administrador(admin);
			cookies.AddCookies(admin.getId(), TipoUsuario.ADMINISTRADOR);
			add(administrador);
			exists = true;
			
			break;
		case CIBERNAUTA:
			Cibernauta ciber = cookies.getCibernauta();
			Cibernauta_Registrado cr = new Cibernauta_Registrado(ciber);
			cookies.AddCookies(ciber.getId(), TipoUsuario.CIBERNAUTA);
			add(cr);
			exists = true;
			
			break;
			
		case ENCARGADOCOMPRAS:
			Encargado encar = cookies.getEncargadoCompras();
			tiendaVirtual.interfaz.Encargado encargado = new tiendaVirtual.interfaz.Encargado(encar);
			cookies.AddCookies(encar.getId(), TipoUsuario.ENCARGADOCOMPRAS);
			add(encargado);
			exists = true;
			
			break;
			
		case TRANSPORTISTA:
			Transportista transpor = cookies.getTransportista();
			tiendaVirtual.interfaz.Transportista transportista = new tiendaVirtual.interfaz.Transportista(transpor);
			cookies.AddCookies(transpor.getId(), TipoUsuario.TRANSPORTISTA);
			add(transportista);
			exists = true;
			
			break;
		}
    	if (exists) {
    		return;
    	}
    	
    	Cibernauta_no_Registrado cnr = new Cibernauta_no_Registrado();
    	add(cnr);
    	
    	cnr._cabecera._login.getLoginBtn().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				removeAll();
				
				String username = cnr._cabecera._login.getUsernameLbl().getValue();
				String password = cnr._cabecera._login.getPasswordLbl().getValue();
				
				iCibernauta_no_Registrado bd = new BDPrincipal();
				
				appventawebbd.Usuario user = bd.getUsuarioLogin(username);
				if (user == null) {
					user = bd.getUsuarioEmail(username);
				}
				if (user == null) {
					System.out.println("USER NOT FOUND: " + username);
					Cibernauta_no_Registrado cnr = new Cibernauta_no_Registrado();
			    	add(cnr);
					return;
				}
				if (!user.getPassword().equals(password)) {
					System.out.println("BAD PASSWORD: " + password);
					Cibernauta_no_Registrado cnr = new Cibernauta_no_Registrado();
			    	add(cnr);
					return;
				}
				
				switch(user.getTipo()) {
				// Ciber
				case 0:
					Cibernauta_Registrado cr = new Cibernauta_Registrado((Cibernauta) user);
					cookies.AddCookies(user.getId(), TipoUsuario.CIBERNAUTA);
					add(cr);
					break;
					
				// Admin
				case 1:
					tiendaVirtual.interfaz.Administrador admin = new tiendaVirtual.interfaz.Administrador((appventawebbd.Administrador) user);
					add(admin);
					cookies.AddCookies(user.getId(), TipoUsuario.ADMINISTRADOR);
					break;
					
				// Encargado
				case 2:
					tiendaVirtual.interfaz.Encargado encargado = new tiendaVirtual.interfaz.Encargado((appventawebbd.Encargado) user);
					add(encargado);
					cookies.AddCookies(user.getId(), TipoUsuario.ENCARGADOCOMPRAS);
					break;
					
				// Transportista
				case 3:
					tiendaVirtual.interfaz.Transportista transportista = new tiendaVirtual.interfaz.Transportista((appventawebbd.Transportista) user);
					add(transportista);
					cookies.AddCookies(user.getId(), TipoUsuario.TRANSPORTISTA);
					break;
				}
			}
		});
    }

}
