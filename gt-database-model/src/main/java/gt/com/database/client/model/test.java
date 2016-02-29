package gt.com.database.client.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class test {


	
	  private static final String PERSISTENCE_UNIT_NAME = "gt-database-model";
	  private static EntityManagerFactory factory;

	  public static void main(String[] args) {
	    factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	    EntityManager em = factory.createEntityManager();
	    // read the existing entries and write to console
//	    Query q = em.createQuery("SELECT c FROM Cliente c");
	    Query q = em.createNamedQuery("Cliente.findAll");
	    	
	   
		@SuppressWarnings("unchecked")
		List<Cliente> todoList = q.getResultList();
	    //List<Todo> todoList = q.getResultList();
	   System.out.println("otros");
		for (Cliente cliente : todoList) {
			System.out.print(cliente.getId() + " - ");
			System.out.println(cliente.getNombre());
		}
	    
	    System.out.println("Size: " + todoList.size());
	  }
}
