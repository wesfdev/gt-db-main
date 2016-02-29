package gt.com.database.acess;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EntityAcess {
	
	@PersistenceContext(name ="gt-database-model")
	private EntityManager manager;

	public EntityManager getManager() {
		return manager;
	}


	

}
