package br.com.mysys.loja.enums;

import java.util.Arrays;
import java.util.List;

public enum TipoPessoa {
	
	FISICA("Física"), JURIDICA("Jurídica");
	
	private final String tipoPessoa;
	
	private TipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	
	public String getTipoPessoa() {
		return tipoPessoa;
	}
	
	public static List<TipoPessoa> lista() {
		List<TipoPessoa> lista = Arrays.asList(FISICA, JURIDICA);
		return lista;
	}
}
