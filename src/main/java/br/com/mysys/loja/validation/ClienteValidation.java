package br.com.mysys.loja.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import br.com.mysys.loja.models.Cliente;

public class ClienteValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Cliente.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		

	}

}
