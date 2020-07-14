package br.com.mysys.loja.enums;

import java.util.Arrays;
import java.util.List;

public enum CadastroStatus {
	
	ATIVO("Ativo"), INATIVO("Inativo");
	
	private final String status;
	
	private CadastroStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
	
	public static List<CadastroStatus> lista() {
		List<CadastroStatus> lista = Arrays.asList(ATIVO, INATIVO);
		return lista;
	}
}
