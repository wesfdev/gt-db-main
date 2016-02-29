package gt.com.database.clientDao;

import java.util.List;

import gt.com.database.client.model.Cliente;

public interface ClientDao {
	
	public List<Cliente> findAll();
	

}
