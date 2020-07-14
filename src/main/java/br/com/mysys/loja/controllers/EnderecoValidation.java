package br.com.mysys.loja.controllers;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import br.com.mysys.loja.models.Endereco;

public class EnderecoValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Endereco.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

	}

}
