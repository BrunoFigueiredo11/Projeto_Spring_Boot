package br.com.fiap.appprodutoteste.produto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("home");
				
		return model;
	}

}
