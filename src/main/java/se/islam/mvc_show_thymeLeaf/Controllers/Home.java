package se.islam.mvc_show_thymeLeaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
	
	@GetMapping("/")
	public String index() {
		return "Index";
	}
	
	
	@GetMapping("/Contact")
	public String contact() {
		return "Contact";
	}
	
	
	@GetMapping("/Adress")
	public String adress() {
		return "Adress";
	}
	
	
	@GetMapping("/Alvesta")
	public String alvesta() {
		return "Alvesta/Alvesta"; 
	}


}
