package br.com.mysys.loja.infra;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeraSenha {
	
	public static String gerar(String password) {
		
		return new BCryptPasswordEncoder().encode(password);
	}

}
