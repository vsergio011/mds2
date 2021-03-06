/**
 * Licensee: antonioofdzj(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.orm.*;

import appventawebbd.*;
public class CreateAppventawebData {
	public void createTestData() throws PersistentException {
		String images[] = new String[] { 
		  "http://www.entreperiodistas.com/wp-content/uploads/2018/05/como-hacer-fotografia-de-producto-1.jpg", 
		  "https://www.dzoom.org.es/wp-content/uploads/2013/08/foto-de-producto-retoque-comparativa-734x551.jpg", 
		  "https://www.mundofino.com/site/assets/files/1729/no_foto.600x600nw.jpg", 
		  "https://mott.pe/noticias/wp-content/uploads/2018/05/fotografia-de-producto-vs-fotografia-publicitaria-1.png", 
		  "https://static-cse.canva.com/blob/205214/05-Secretos-fotos-de-producto.jpg",
		  "https://rockcontent.com/es/wp-content/uploads/sites/3/2019/02/o-que-e-produto-no-mix-de-marketing.png",
		  "https://static-cse.canva.com/blob/205233/15-Secretos-fotos-de-producto-1.jpg"
		};
		// PersistentTransaction t = AppventawebPersistentManager.instance().getSession().beginTransaction();
		try {
			Cibernauta ciber = CibernautaDAO.createCibernauta();
            ciber.setNombre("UAL");
            ciber.setPassword("1234");
            ciber.setApellidos("MDS2 ASIGNATURA");
            ciber.setOperativo(true);
            ciber.setCorreoElectronico("foo1@example.com");
            ciber.setUsuario("user");
            ciber.setFoto("https://img1.freepng.es/20180319/row/kisspng-computer-icons-google-account-user-profile-iconfin-png-icons-download-profile-5ab0301d8907a6.3404305715214960935613.jpg");
            ciber.setDireccionCompleta("Direccion falsa 123");
            ciber.setFormaPago("TARJETA");
            ciber.setTipo(0);
            CibernautaDAO.save(ciber);
            
            Transportista transportista = TransportistaDAO.createTransportista();
            transportista.setNombre("Transportista Alvaro");
            transportista.setPassword("1234");
            transportista.setApellidos("Fernandez Alvarez");
            transportista.setOperativo(true);
            transportista.setCorreoElectronico("foo4@example.com");
            transportista.setUsuario("transportista");
            transportista.setFoto("https://www.dzoom.org.es/wp-content/uploads/2020/02/portada-foto-perfil-redes-sociales-consejos.jpg");
            transportista.setDireccionCompleta("Direccion falsa 321");
            transportista.setFormaPago("TARJETA");
            transportista.setTipo(3);
            TransportistaDAO.save(transportista);
            
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date(System.currentTimeMillis());
            
            /*Pendiente pedido = PendienteDAO.createPendiente();
            pedido.setCibernauta(ciber);
            pedido.setDireccion(ciber.getDireccionCompleta());
            pedido.setFechaPedido(formatter.format(date));
            pedido.setFecha(formatter.format(date));
            pedido.setFormaPago(ciber.getFormaPago());
            pedido.setTotal(150.5);
            PendienteDAO.save(pedido);
            
            Enviado enviado = EnviadoDAO.createEnviado();
            enviado.setCibernauta(ciber);
            enviado.setDireccion(ciber.getDireccionCompleta());
            enviado.setFechaPedido(formatter.format(date));
            enviado.setFecha(formatter.format(date));
            enviado.setFormaPago(ciber.getFormaPago());
            enviado.setTotal(150.5);
            enviado.setTransportistaEnvio(transportista);
            EnviadoDAO.save(enviado);*/
            
            /*Entregado entregado = EntregadoDAO.createEntregado();
            entregado.setCibernauta(ciber);
            entregado.setDireccion(ciber.getDireccionCompleta());
            entregado.setFechaPedido(formatter.format(date));
            entregado.setFecha(formatter.format(date));
            entregado.setFormaPago(ciber.getFormaPago());
            entregado.setTotal(150.5);
            EntregadoDAO.save(entregado);
            
			for (int i = 0; i<=4; i++) {
				Categoria cat = CategoriaDAO.createCategoria();
				cat.setNombre("Category"+i);
				CategoriaDAO.save(cat);
				
				for (int j = 0; j<=4; j++) {
					Producto p = ProductoDAO.createProducto();
					p.setNombre("Producto " + j);
					p.setDetalles("DEtalles del producto " + j);
					p.setDescripcion("producto "+j);
					p.setValoracionMedia(j);
		            p.setPrecio(20+j);
		            p.setCategoria(cat);
		            p.setFotos(images[j]);
		            System.out.println(images[j]);
		            ProductoDAO.save(p);
		            
		            for (int k = 0; k < 4; k++) {
		            	Comentario comen = ComentarioDAO.createComentario();
		            	comen.setProducto(p);
		            	comen.setCibernauta(ciber);
		            	comen.setTexto("ME VALE VERGA");
		            	comen.setValoracion(5);
		            }
		            
		            Item item = ItemDAO.createItem();
		            item.setCantidad(2);
		            item.setProducto(p);		           
		            if (j == 0) {
		            	item.setPedido(pedido);
		            }else if (j <2) {
		            	item.setPedido(enviado);
		            } else {
		            	item.setPedido(entregado);
		            }
		            ItemDAO.save(item);
		            
		            if (j>2) {
		            	Oferta offer = OfertaDAO.createOferta();
		            	offer.setFechaFin("FooFechaFin");
		            	offer.setPrecio(p.getPrecio());
		            	offer.setProducto(p);
		            	OfertaDAO.save(offer);
		            }
				}
			}*/
			
			Administrador admin = AdministradorDAO.createAdministrador();
			admin.setNombre("Administrador Paco");
			admin.setPassword("1234");
			admin.setApellidos("Vera Perez");
			admin.setOperativo(true);
			admin.setCorreoElectronico("foo2@example.com");
			admin.setUsuario("admin");
			admin.setFoto("https://www.dzoom.org.es/wp-content/uploads/2020/02/portada-foto-perfil-redes-sociales-consejos.jpg");
			admin.setDireccionCompleta("Direccion admin 123");
			admin.setFormaPago("TARJETA");
			admin.setTipo(1);
			AdministradorDAO.save(admin);
			
			Encargado encar = EncargadoDAO.createEncargado();
			encar.setNombre("Encargada Tamara");
			encar.setPassword("1234");
			encar.setApellidos("Jimenez Montoya");
			encar.setOperativo(true);
			encar.setCorreoElectronico("foo3@example.com");
			encar.setUsuario("encargado");
			encar.setFoto("https://www.dzoom.org.es/wp-content/uploads/2020/02/portada-foto-perfil-redes-sociales-consejos.jpg");
			encar.setDireccionCompleta("Direccion encargada 123");
			encar.setFormaPago("TARJETA");
			encar.setTipo(2);
			EncargadoDAO.save(encar);
			
			/*for (int i = 0; i < 5; i++) {
            	appventawebbd.Mensaje msg= MensajeDAO.createMensaje();
            	msg.setAsunto("Asunto msg " + i);
            	msg.setCuerpo("cuerpo " + i);
            	msg.setRemitente(admin);
            	msg.setDestinatario(ciber);
            	MensajeDAO.save(msg);
            }
			for (int i = 0; i < 3; i++) {
            	appventawebbd.Mensaje msg= MensajeDAO.createMensaje();
            	msg.setAsunto("Asunto msg " + i);
            	msg.setCuerpo("cuerpo " + i);
            	msg.setRemitente(ciber);
            	msg.setDestinatario(admin);
            	MensajeDAO.save(msg);
            }*/
			
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
