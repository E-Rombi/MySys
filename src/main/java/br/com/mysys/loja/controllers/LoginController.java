package br.com.mysys.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginForm() {
		return "login";
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String index() {
		return "login";
	}

}
