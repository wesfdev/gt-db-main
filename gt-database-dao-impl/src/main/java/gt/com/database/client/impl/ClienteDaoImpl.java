package gt.com.database.client.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import gt.com.database.acess.EntityAcess;
import gt.com.database.client.model.Cliente;
import gt.com.database.clientDao.ClientDao;


public class ClienteDaoImpl extends EntityAcess implements Serializable, ClientDao{	
	
    @PersistenceContext(unitName = "gt-database-model")
    EntityManager em;

	@Override
	public List<Cliente> findAll() {
		
		Query query = em.createNamedQuery("Cliente.findAll");
		
		List<Cliente> list = query.getResultList();
		
		   System.out.println("otros");
			for (Cliente cliente : list) {
				System.out.print(cliente.getId() + " - ");
				System.out.println(cliente.getNombre());
			}
		
		return list;
	}

}
