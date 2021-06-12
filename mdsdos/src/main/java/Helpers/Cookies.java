package Helpers;

import javax.servlet.http.Cookie;

import com.vaadin.flow.server.VaadinRequest;
import com.vaadin.flow.server.VaadinService;
import com.vaadin.flow.server.VaadinSession;

import appventawebbd.Administrador;
import appventawebbd.Cibernauta;
import appventawebbd.Encargado;
import appventawebbd.Transportista;
import basededatos.BDPrincipal;

public class Cookies {
	
	public enum TipoUsuario {
	  UNKNOWN,
	  
	  ADMINISTRADOR,
	  ENCARGADOCOMPRAS,
	  TRANSPORTISTA,
	  CIBERNAUTA
	}
	
	private Administrador administrador = null;
	private Encargado encargadoCompras = null;
	private Transportista transportista = null;
	private Cibernauta cibernauta = null;
	
	private TipoUsuario tipoUsuario = TipoUsuario.UNKNOWN;
	public static int idUsuario = -1;
	
	public VaadinSession session;
	
	public TipoUsuario getTipoUsuario() {
		return this.tipoUsuario;
	}
	
	public Administrador getAdministrador() {
		return administrador;
	}

	public Encargado getEncargadoCompras() {
		return encargadoCompras;
	}

	public Transportista getTransportista() {
		return transportista;
	}

	public Cibernauta getCibernauta() {
		return cibernauta;
	}
	
	public Cookies() {
		super();
		BDPrincipal bd = new BDPrincipal();
	    cibernauta = null;
	    encargadoCompras = null;
	    administrador = null;
	    transportista = null;
    	session = VaadinSession.getCurrent();

		Cookie[] cookies = VaadinRequest.getCurrent().getCookies();
		if (cookies == null || cookies.length == 0) {
			System.out.println("No hay cookies almacenadas.");
			return;
		}
		
		for (Cookie cookie : cookies) {
			String cookieName = cookie.getName();
			String cookieValue = cookie.getValue();
			
			System.out.println("Cookie name: " + cookieName);
			System.out.println("Cookie value: " + cookieValue);
			
			switch (cookieName) {
			case "tipoUsuario":
				this.tipoUsuario = this.getTipoUsuario(cookieValue);
				break;
			case "idUsuario":
				System.out.println("IDUSUARIO:" + cookieValue);
				idUsuario = Integer.parseInt(cookieValue);
				break;
			}
		}
		
		System.out.println("Tipo de usuario: " + tipoUsuario);
		switch (tipoUsuario) {
		case ADMINISTRADOR:
			administrador = (Administrador) bd.getUsuario(idUsuario);
			session.setAttribute("admin", administrador);
			break;
		case CIBERNAUTA:
			cibernauta = (Cibernauta) bd.getUsuario(idUsuario);
			session.setAttribute("cibernauta", cibernauta);
			break;
		case ENCARGADOCOMPRAS:
			encargadoCompras = (Encargado) bd.getUsuario(idUsuario);
			session.setAttribute("encargado", encargadoCompras);
			break;
		case TRANSPORTISTA:
			transportista = (Transportista) bd.getUsuario(idUsuario);
			session.setAttribute("transportista", transportista);
			break;
		}
	}
	
	public void AddCookies(int idCliente, TipoUsuario tipo) {
		String tipoUsuarioCookieValue = GetTipoUsuario(tipo);
		if (idCliente == -1) {
			tipoUsuarioCookieValue = GetTipoUsuario(TipoUsuario.UNKNOWN);
		}
		Cookie cliente = new Cookie("idUsuario", String.valueOf(idCliente));
		Cookie tipoUsuario= new Cookie("tipoUsuario", tipoUsuarioCookieValue);

		cliente.setMaxAge(60 * 60 * 24 * 7 * 52);
		cliente.setPath("/");
		tipoUsuario.setMaxAge(60 * 60 * 24 * 7 * 52);
		tipoUsuario.setPath("/");
		
		VaadinService.getCurrentResponse().addCookie(cliente);
		VaadinService.getCurrentResponse().addCookie(tipoUsuario);
	}
	
	public static void ClearCookies() {
		Cookie cliente = new Cookie("idUsuario", "-1");
		Cookie tipoUsuario= new Cookie("tipoUsuario", "");

		cliente.setMaxAge(60 * 60 * 24 * 7 * 52);
		cliente.setPath("/");
		tipoUsuario.setMaxAge(60 * 60 * 24 * 7 * 52);
		tipoUsuario.setPath("/");
		
		VaadinService.getCurrentResponse().addCookie(cliente);
		VaadinService.getCurrentResponse().addCookie(tipoUsuario);
	}
	
	private TipoUsuario getTipoUsuario(String tipoUsuario) {
		switch (tipoUsuario) {
		 case "cibernauta":
			 return TipoUsuario.CIBERNAUTA;
		 case "admin":
			 return TipoUsuario.ADMINISTRADOR;
		 case "encargado":
			 return TipoUsuario.ENCARGADOCOMPRAS;
		 case "transportista":
			 return TipoUsuario.TRANSPORTISTA;
		 default:
			 return TipoUsuario.UNKNOWN;
		 }
	}
	
	private String GetTipoUsuario(TipoUsuario tipoUsuario) {
		switch(tipoUsuario) {
		case ADMINISTRADOR:
			return "admin";
		case CIBERNAUTA:
			return "cibernauta";
		case ENCARGADOCOMPRAS:
			return "encargado";
		case TRANSPORTISTA:
			return "transportista";
		default:
			return "";
		}
	}
}
