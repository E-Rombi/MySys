package br.com.mysys.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView maw = new ModelAndView("home");
		
		return maw;
	}
	
	
}
