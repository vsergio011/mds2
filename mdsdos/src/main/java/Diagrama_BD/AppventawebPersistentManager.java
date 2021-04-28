/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package Diagrama_BD;

import org.orm.*;
import org.orm.cfg.JDBCConnectionSetting;
import org.hibernate.*;
import java.util.Properties;
import org.hibernate.cfg.*;
import org.hibernate.boot.MetadataSources;

public class AppventawebPersistentManager extends PersistentManager {
	private static final String PROJECT_NAME = "Appventaweb";
	private static PersistentManager _instance = null;
	private static SessionType _sessionType = SessionType.THREAD_BASE;
	private static int _timeToAlive = 60000;
	private static JDBCConnectionSetting _connectionSetting = null;
	private static Properties _extraProperties = null;
	private static String _configurationFile = null;
	
	private AppventawebPersistentManager() throws PersistentException {
		super(_connectionSetting, _sessionType, _timeToAlive, new String[] {}, _extraProperties, _configurationFile);
		setFlushMode(FlushMode.AUTO);
	}
	
	@Override
	protected void configureMetadataSources(MetadataSources aMetadataSources) {
		super.configureMetadataSources(aMetadataSources);
		aMetadataSources.addAnnotatedClass(Diagrama_BD.Usuario.class);
		aMetadataSources.addAnnotatedClass(Diagrama_BD.Pedido.class);
		aMetadataSources.addAnnotatedClass(Diagrama_BD.Comentario.class);
		aMetadataSources.addAnnotatedClass(Diagrama_BD.Producto.class);
		aMetadataSources.addAnnotatedClass(Diagrama_BD.Categoria.class);
		aMetadataSources.addAnnotatedClass(Diagrama_BD.Mensaje.class);
		aMetadataSources.addAnnotatedClass(Diagrama_BD.Pendiente.class);
		aMetadataSources.addAnnotatedClass(Diagrama_BD.Enviado.class);
		aMetadataSources.addAnnotatedClass(Diagrama_BD.Entregado.class);
		aMetadataSources.addAnnotatedClass(Diagrama_BD.Oferta.class);
		aMetadataSources.addAnnotatedClass(Diagrama_BD.Cibernauta.class);
		aMetadataSources.addAnnotatedClass(Diagrama_BD.Empleado.class);
		aMetadataSources.addAnnotatedClass(Diagrama_BD.Administrador.class);
		aMetadataSources.addAnnotatedClass(Diagrama_BD.Encargado.class);
		aMetadataSources.addAnnotatedClass(Diagrama_BD.Transportista.class);
		aMetadataSources.addAnnotatedClass(Diagrama_BD.Item.class);
		aMetadataSources.addAnnotatedClass(Diagrama_BD.Foto.class);
	}
	
	public String getProjectName() {
		return PROJECT_NAME;
	}
	
	public static synchronized final PersistentManager instance() throws PersistentException {
		if (_instance == null) {
			_instance = new AppventawebPersistentManager();
		}
		
		return _instance;
	}
	
	public void disposePersistentManager() throws PersistentException {
		_instance = null;
		super.disposePersistentManager();
	}
	
	public static void setSessionType(SessionType sessionType) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set session type after create PersistentManager instance");
		}
		else {
			_sessionType = sessionType;
		}
		
	}
	
	public static void setAppBaseSessionTimeToAlive(int timeInMs) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set session time to alive after create PersistentManager instance");
		}
		else {
			_timeToAlive = timeInMs;
		}
		
	}
	
	public static void setJDBCConnectionSetting(JDBCConnectionSetting aConnectionSetting) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set connection setting after create PersistentManager instance");
		}
		else {
			_connectionSetting = aConnectionSetting;
		}
		
	}
	
	public static void setHibernateProperties(Properties aProperties) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set hibernate properties after create PersistentManager instance");
		}
		else {
			_extraProperties = aProperties;
		}
		
	}
	
	public static void setConfigurationFile(String aConfigurationFile) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set configuration file after create PersistentManager instance");
		}
		else {
			_configurationFile = aConfigurationFile;
		}
		
	}
	
	public static void saveJDBCConnectionSetting() {
		PersistentManager.saveJDBCConnectionSetting(PROJECT_NAME, _connectionSetting);
	}
}
