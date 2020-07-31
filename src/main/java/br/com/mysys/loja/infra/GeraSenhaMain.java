package br.com.mysys.loja.infra;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeraSenhaMain {
	
	public static void main(String[] args) {
		System.out.println(new BCryptPasswordEncoder().encode("123456"));
	}

}
