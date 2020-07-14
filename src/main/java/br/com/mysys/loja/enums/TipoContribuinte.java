package br.com.mysys.loja.enums;

import java.util.Arrays;
import java.util.List;

public enum TipoContribuinte {

	CONTRIBUINTE("Contribuinte"), CONTRIBUINTE_ISENTO("Contribuinte Isento"), NAO_CONTRIBUINTE("Não contribuinte");
	
	private final String tipoContribuinte;
	
	private TipoContribuinte(String tipoContribuinte) {
		this.tipoContribuinte = tipoContribuinte;
	}
	
	public String getTipoContribuinte() {
		return tipoContribuinte;
	}
	
	public static List<TipoContribuinte> lista() {
		List<TipoContribuinte> lista = Arrays.asList(CONTRIBUINTE, CONTRIBUINTE_ISENTO, NAO_CONTRIBUINTE);
		return lista;
	}
	
}
