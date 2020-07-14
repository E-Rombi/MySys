package br.com.mysys.loja.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.mysys.loja.models.Cliente;

@Repository
@Transactional
public class ClienteDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	
	public List<Cliente> lista() {
		TypedQuery<Cliente> query = manager.createQuery("select c from Cliente c order by c.status", Cliente.class);
		return query.getResultList();
	}
	
	public Cliente find(Integer id) {
		return manager.find(Cliente.class, id);
	}

	public void persist(Cliente cliente) {
		manager.persist(cliente);
		
	}

	public void merge(Cliente cliente) {
		manager.merge(cliente);
	}

	public void deleteById(Cliente cliente) {
		manager.remove(cliente);
	}

	
	
}
