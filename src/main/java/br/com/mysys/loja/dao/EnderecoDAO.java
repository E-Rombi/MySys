package br.com.mysys.loja.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.mysys.loja.models.Endereco;

@Repository
@Transactional
public class EnderecoDAO {

	@PersistenceContext
	private EntityManager manager;
	
	
	public void persist(Endereco endereco) {
		manager.persist(endereco);
	}


	public void merge(Endereco endereco) {
		manager.merge(endereco);
	}
}
