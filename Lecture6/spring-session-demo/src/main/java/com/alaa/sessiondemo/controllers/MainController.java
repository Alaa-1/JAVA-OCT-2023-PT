package com.alaa.sessiondemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index(Model model, HttpSession session) {
		String username = "John";
		model.addAttribute("name", username);
		// save the username inside the session
		session.setAttribute("username", username);
		return "index.jsp";
	}
	
	@RequestMapping("/profile")
	public String profile(HttpSession sesh) {
		
		String user = (String) sesh.getAttribute("username");
		System.out.println(user.length());
		
		return "profil.jsp";
	}

}
