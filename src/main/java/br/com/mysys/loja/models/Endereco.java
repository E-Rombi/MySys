package br.com.mysys.loja.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import br.com.mysys.loja.enums.Estados;

@Entity
public class Endereco  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String cidade;
	
	@Enumerated(EnumType.STRING)
	private Estados uf;
	
	private String fone;
	private String foneOutro;
	private String celular;
	
	@Lob
	private String observacao;

	public Integer getId() {
		return id;
	}

	public String getCep() {
		return cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getFone() {
		return fone;
	}

	public String getFoneOutro() {
		return foneOutro;
	}

	public String getCelular() {
		return celular;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public void setFoneOutro(String foneOutro) {
		this.foneOutro = foneOutro;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Estados getUf() {
		return uf;
	}

	public void setUf(Estados uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "Endereco [id=" + id + ", cep=" + cep + ", logradouro=" + logradouro + ", complemento=" + complemento
				+ ", bairro=" + bairro + ", cidade=" + cidade + ", fone=" + fone + ", foneOutro="
				+ foneOutro + ", celular=" + celular + ", observacao=" + observacao + "]";
	}	
	
}
