package br.com.mysys.loja.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import br.com.mysys.loja.enums.CadastroStatus;
import br.com.mysys.loja.enums.TipoContribuinte;
import br.com.mysys.loja.enums.TipoPessoa;
import br.com.mysys.loja.enums.TipoRegimeTributario;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Cadastro implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer id;

	@Enumerated(EnumType.STRING)
	private CadastroStatus status;
	
	@Enumerated(EnumType.STRING)
	private TipoContribuinte tipoContribuinte;
	
	@Enumerated(EnumType.STRING)
	private TipoPessoa tipoPessoa;
	
	@Enumerated(EnumType.STRING)
	private TipoRegimeTributario tipoRegime;
	
	@Column(length = 30)
	private String cnpjCpf;
	
	@Column(length = 30)
	private String ieRg;
	
	private String razaoSocial;
	private String Fantasia;
	
	@Column(length = 60)
	private String email;
	
	@Lob
	private String observacao;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Endereco endereco;

	public Integer getId() {
		return id;
	}

	public CadastroStatus getStatus() {
		return status;
	}

	public TipoContribuinte getTipoContribuinte() {
		return tipoContribuinte;
	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public TipoRegimeTributario getTipoRegime() {
		return tipoRegime;
	}

	public String getCnpjCpf() {
		return cnpjCpf;
	}

	public String getIeRg() {
		return ieRg;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getFantasia() {
		return Fantasia;
	}

	public String getEmail() {
		return email;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setStatus(CadastroStatus status) {
		this.status = status;
	}

	public void setTipoContribuinte(TipoContribuinte tipoContribuinte) {
		this.tipoContribuinte = tipoContribuinte;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public void setTipoRegime(TipoRegimeTributario tipoRegime) {
		this.tipoRegime = tipoRegime;
	}

	public void setCnpjCpf(String cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}

	public void setIeRg(String ieRg) {
		this.ieRg = ieRg;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void setFantasia(String fantasia) {
		Fantasia = fantasia;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cadastro [id=" + id + ", status=" + status + ", tipoContribuinte=" + tipoContribuinte + ", tipoPessoa="
				+ tipoPessoa + ", tipoRegime=" + tipoRegime + ", cnpjCpf=" + cnpjCpf + ", ieRg=" + ieRg
				+ ", razaoSocial=" + razaoSocial + ", Fantasia=" + Fantasia + ", email=" + email + ", observacao="
				+ observacao + ", endereco=" + endereco + "]";
	}
	
}
