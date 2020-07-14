package br.com.mysys.loja.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.mysys.loja.models.Usuario;

@Repository
@Transactional
public class UserDAO {
	
	@PersistenceContext
	private EntityManager manager;

	public List<Usuario> lista() {
		List<Usuario> list = manager.createQuery("select u from Usuario u", Usuario.class).getResultList();
		return list;
	}
	
	public void persist(Usuario usuario) {
		manager.persist(usuario);
	}
	
	public void merge(Usuario usuario) {
		manager.merge(usuario);
	}

	public void deleteById(Integer id) {
		Usuario user = manager.find(Usuario.class, id);
		manager.remove(user);
	}
	
	public Usuario find(Integer id) {
		return manager.find(Usuario.class, id);
	}
	
	
}
