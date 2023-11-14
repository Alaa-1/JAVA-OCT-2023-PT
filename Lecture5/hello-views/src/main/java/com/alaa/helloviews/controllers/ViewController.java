package com.alaa.helloviews.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	
	
	@RequestMapping("/")
	public String index(Model model) {
		String username = "Joe Doe";
		model.addAttribute("name", username);
		return "index.jsp";
	}	
	
	
	@RequestMapping("/other")
	public String otherRoute(Model m) {	
		String message = "<h1>hello from controller</h1><script>alert('this is bad')</script>";
		m.addAttribute("test",message);
		return "index.jsp";
	}
	
	
	@RequestMapping("/dojos")
	public String dojos(Model model) {
		
		ArrayList<String> dojos = new ArrayList<String>();
		dojos.add("San Jose");
		dojos.add("Seattle");
		dojos.add("Tunisia");
		
		model.addAttribute("dojoList", dojos);
		
		return "dojos.jsp";
	}
}
