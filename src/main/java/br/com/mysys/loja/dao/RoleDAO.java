package br.com.mysys.loja.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.mysys.loja.models.Role;

@Repository
public class RoleDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public Role find(String string) {
		return manager.find(Role.class, string);
	}
	
	public List<Role> lista() {
		TypedQuery<Role> query = manager.createQuery("select r from Role r", Role.class);
		return query.getResultList();
	}

	public void merge(Role role) {
		manager.merge(role);
		
	}

	public void persist(Role role) {
		manager.persist(role);
	}

	public void deleteById(String nome) {
		Role role = find(nome);
		manager.remove(role);
	}

}
