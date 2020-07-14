package br.com.mysys.loja.infra;

import java.io.IOException;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;

public class ConsultaCEP {

	public ConsultaCEP() {
	}

	
	public ViaCEPClient consultar(String cep) {
		ViaCEPClient client = new ViaCEPClient();
		try {
			client.getEndereco(cep);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return client;
	}
	
	
}
