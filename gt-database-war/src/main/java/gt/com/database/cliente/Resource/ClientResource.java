package gt.com.database.cliente.Resource;
import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import gt.com.database.client.model.Cliente;
import gt.com.database.clientDao.ClientDao;

@Path("/client")
public class ClientResource implements Serializable{
	
	@Inject
	ClientDao svc;
	
	  //private String PERSISTENCE_UNIT_NAME = "gt-database-model";
	  //private EntityManagerFactory factory;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAll()throws Exception{
		try {
		//    factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

		  //  EntityManager em = factory.createEntityManager();
		    // read the existing entries and write to console
//		    Query q = em.createQuery("SELECT c FROM Cliente c");
		    //Query q = em.createNamedQuery("Cliente.findAll");
		    
		    //List<Cliente> domain = q.getResultList();
		    
			List<Cliente> domain = svc.findAll();
			
			return Response.status(Status.OK).entity(domain).build();
		
		} catch (Exception e) {
			
			return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
		}
	}
	
	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String hello(){
		return "hola";
		
	}	
}
