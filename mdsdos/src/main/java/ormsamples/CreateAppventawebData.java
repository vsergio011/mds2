/**
 * Licensee: antonioofdzj(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import java.util.List;

import org.orm.*;

import appventawebbd.*;
public class CreateAppventawebData {
	public void createTestData() throws PersistentException {
		String images[] = new String[] { 
		  "http://www.entreperiodistas.com/wp-content/uploads/2018/05/como-hacer-fotografia-de-producto-1.jpg", 
		  "https://www.dzoom.org.es/wp-content/uploads/2013/08/foto-de-producto-retoque-comparativa-734x551.jpg", 
		  "https://www.blogdelfotografo.com/wp-content/uploads/2020/12/producto_fondo_negro.jpg", 
		  "https://mott.pe/noticias/wp-content/uploads/2018/05/fotografia-de-producto-vs-fotografia-publicitaria-1.png", 
		  "https://static-cse.canva.com/blob/205214/05-Secretos-fotos-de-producto.jpg",
		  "https://rockcontent.com/es/wp-content/uploads/sites/3/2019/02/o-que-e-produto-no-mix-de-marketing.png",
		  "https://static-cse.canva.com/blob/205233/15-Secretos-fotos-de-producto-1.jpg"
		};
		// PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		try {
			Cibernauta ciber = CibernautaDAO.createCibernauta();
            ciber.setNombre("PEPITO");
            ciber.setPassword("1234");
            ciber.setApellidos("VERA FERNANDEZ");
            ciber.setOperativo(true);
            ciber.setCorreoElectronico("foo@example.com");
            ciber.setUsuario("user");
            ciber.setFoto("https://img1.freepng.es/20180319/row/kisspng-computer-icons-google-account-user-profile-iconfin-png-icons-download-profile-5ab0301d8907a6.3404305715214960935613.jpg");
            ciber.setDireccionCompleta("calle falsa 123");
            ciber.setFormaPago("TARJETA");
            CibernautaDAO.save(ciber);
            
			for (int i = 0; i<=4; i++) {
				Categoria cat = CategoriaDAO.createCategoria();
				cat.setNombre("Category"+i);
				CategoriaDAO.save(cat);
				
				for (int j = 0; j<=4; j++) {
					Producto p = ProductoDAO.createProducto();
					p.setDescripcion("producto "+j);
					p.setValoracionMedia(j);
		            p.setPrecio(20+j);
		            p.setCategoria(cat);
		            p.setFotos(images[j]);
		            System.out.println(images[j]);
		            ProductoDAO.save(p);
		            
		            if (j>2) {
		            	Oferta offer = OfertaDAO.createOferta();
		            	offer.setFechaFin("FooFechaFin");
		            	offer.setPrecio(p.getPrecio());
		            	offer.setProducto(p);
		            	OfertaDAO.save(offer);
		            }
				}
			}
			
            /* Cibernauta ciber = CibernautaDAO.createCibernauta();
            ciber.setNombre("PEPITO");
            CibernautaDAO.save(ciber);

            Producto p = ProductoDAO.createProducto();
            p.setDescripcion("FooDescription");
            
            Comentario c = new Comentario();
            c.setTexto("FOOOA");
            c.setValoracion(4);
            c.setCibernauta(ciber);
            ComentarioDAO.save(c);
            
            p.comentarios.add(c);
            p.setValoracionMedia(5);
            p.setPrecio(23.0);
            p.setCategoria(cat);
            ProductoDAO.save(p);*/
            
            // t.commit();
            
	        /* // TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : valoracion, producto, cibernauta
			diagramabd.ComentarioDAO.save(diagramaBDComentario);
			diagramabd.Producto diagramaBDProducto = diagramabd.ProductoDAO.createProducto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : fotosProducto, items, ofertas, comentarios, valoracionMedia, precio, categoria
			diagramabd.ProductoDAO.save(diagramaBDProducto);
			diagramabd.Categoria diagramaBDCategoria = diagramabd.CategoriaDAO.createCategoria();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : productos
			diagramabd.CategoriaDAO.save(diagramaBDCategoria);*/
	            
			/*diagramabd.Usuario diagramaBDUsuario = diagramabd.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : mensajesRecibidos, mensajesEnviados, operativo
			diagramabd.UsuarioDAO.save(diagramaBDUsuario);
			diagramabd.Pedido diagramaBDPedido = diagramabd.PedidoDAO.createPedido();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : items, total, cibernauta
			diagramabd.PedidoDAO.save(diagramaBDPedido);
			diagramabd.Comentario diagramaBDComentario = diagramabd.ComentarioDAO.createComentario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : valoracion, producto, cibernauta
			diagramabd.ComentarioDAO.save(diagramaBDComentario);
			diagramabd.Producto diagramaBDProducto = diagramabd.ProductoDAO.createProducto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : fotosProducto, items, ofertas, comentarios, valoracionMedia, precio, categoria
			diagramabd.ProductoDAO.save(diagramaBDProducto);
			diagramabd.Categoria diagramaBDCategoria = diagramabd.CategoriaDAO.createCategoria();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : productos
			diagramabd.CategoriaDAO.save(diagramaBDCategoria);
			diagramabd.Mensaje diagramaBDMensaje = diagramabd.MensajeDAO.createMensaje();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : remitente, destinatario
			diagramabd.MensajeDAO.save(diagramaBDMensaje);
			diagramabd.Pendiente diagramaBDPendiente = diagramabd.PendienteDAO.createPendiente();
			// Initialize the properties of the persistent object here
			diagramabd.PendienteDAO.save(diagramaBDPendiente);
			diagramabd.Enviado diagramaBDEnviado = diagramabd.EnviadoDAO.createEnviado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : transportistaEnvio
			diagramabd.EnviadoDAO.save(diagramaBDEnviado);
			diagramabd.Entregado diagramaBDEntregado = diagramabd.EntregadoDAO.createEntregado();
			// Initialize the properties of the persistent object here
			diagramabd.EntregadoDAO.save(diagramaBDEntregado);
			diagramabd.Oferta diagramaBDOferta = diagramabd.OfertaDAO.createOferta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : precio, producto
			diagramabd.OfertaDAO.save(diagramaBDOferta);
			diagramabd.Cibernauta diagramaBDCibernauta = diagramabd.CibernautaDAO.createCibernauta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : comentario, pedidos
			diagramabd.CibernautaDAO.save(diagramaBDCibernauta);
			diagramabd.Empleado diagramaBDEmpleado = diagramabd.EmpleadoDAO.createEmpleado();
			// Initialize the properties of the persistent object here
			diagramabd.EmpleadoDAO.save(diagramaBDEmpleado);
			diagramabd.Administrador diagramaBDAdministrador = diagramabd.AdministradorDAO.createAdministrador();
			// Initialize the properties of the persistent object here
			diagramabd.AdministradorDAO.save(diagramaBDAdministrador);
			diagramabd.Encargado diagramaBDEncargado = diagramabd.EncargadoDAO.createEncargado();
			// Initialize the properties of the persistent object here
			diagramabd.EncargadoDAO.save(diagramaBDEncargado);
			diagramabd.Transportista diagramaBDTransportista = diagramabd.TransportistaDAO.createTransportista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : enviados
			diagramabd.TransportistaDAO.save(diagramaBDTransportista);
			diagramabd.Item diagramaBDItem = diagramabd.ItemDAO.createItem();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cantidad, idPedido, idProducto, producto, pedido
			diagramabd.ItemDAO.save(diagramaBDItem);
			diagramabd.Foto diagramaBDFoto = diagramabd.FotoDAO.createFoto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : productoFoto
			diagramabd.FotoDAO.save(diagramaBDFoto);
			t.commit();*/
		}
		catch (Exception e) {
			System.out.println("EXCEPTION : " + e.getMessage());
			// t.rollback();
		}
		
		PersistentTransaction t2 = AppventawebPersistentManager.instance().getSession().beginTransaction();
		
		List<Categoria> categorias = null;
		try {
			categorias = CategoriaDAO.queryCategoria(null, null);
		} catch (Exception e) {
			t2.rollback();
		}

		System.out.println("OLE TU: " + categorias.size());
		for (Categoria c1 :categorias) {
			System.out.println(c1.getNombre());
		}
		
		t2.commit();
	}
	
	public static void main(String[] args) {
		try {
			CreateAppventawebData createAppventawebData = new CreateAppventawebData();
			try {
				createAppventawebData.createTestData();
			}
			finally {
				appventawebbd.AppventawebPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
