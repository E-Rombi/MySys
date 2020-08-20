package br.com.mysys.loja.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Role implements GrantedAuthority {

	private static final long serialVersionUID = 1L;

	@Id
	private String nome;
	
	@Lob
	private String descricao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String getAuthority() {
		return this.nome;
	}

	@Override
	public String toString() {
		return "Role [nome=" + nome + ", descricao=" + descricao + "]";
	}
	
	
}
