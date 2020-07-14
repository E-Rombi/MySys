package br.com.mysys.loja.enums;

import java.util.Arrays;
import java.util.List;

public enum Estados {

	RO("Rondônia"),
	AC("Acre"),
	AM("Amazonas"),
	RR("Roraima"),
	PA("Pará"),
	AP("Amapá"),
	TO("Tocantins"),
	MA("Maranhão"),
	PI("Piauí"),
	CE("Ceará"),
	RN("Rio Grande do Norte"),
	PB("Paraíba"),
	PE("Pernambuco"),
	AL("Alagoas"),
	SE("Sergipe"),
	BA("Bahia"),
	MG("Minas Gerais"),
	ES("Espírito Santo"),
	RJ("Rio de Janeiro"),
	SP("São Paulo"),
	PR("Paraná"),
	SC("Santa Catarina"),
	RS("Rio Grande do Sul"),
	MS("Mato Grosso do Sul"),
	MT("Mato Grosso"),
	GO("Goiás"),
	DF("Distrito Federal");
		
	private final String uf;
	
	private Estados(String uf) {
		this.uf = uf;
	}
	
	public String getUf(){
		return uf;
	}
	
	public static List<Estados> lista() {
		List<Estados> lista = Arrays.asList(RO,AC,AM,RR,PA,AP,TO,MA,PI,CE,RN,PB,PE,AL,SE,BA,MG,ES,RJ,SP,PR,SC,RS,MS,MT,GO,DF);
		return lista;
	}
}