package br.com.mysys.loja.enums;

import java.util.Arrays;
import java.util.List;

public enum TipoRegimeTributario {
	
	LUCRO_REAL("Lucro Real"), LUCRO_PRESUMIDO("Lucro Presumido"), SIMPLES_NACIONAL("Simples Nacional");
	
	private final String tipoRegimeTributario;
	
	private TipoRegimeTributario(String tipoRegimeTributario) {
		this.tipoRegimeTributario = tipoRegimeTributario;
	}

	public String getTipoRegimeTributario() {
		return tipoRegimeTributario;
	}
	
	public static List<TipoRegimeTributario> lista() {
		List<TipoRegimeTributario> lista = Arrays.asList(LUCRO_REAL, LUCRO_PRESUMIDO, SIMPLES_NACIONAL);
		return lista;
	}
}
