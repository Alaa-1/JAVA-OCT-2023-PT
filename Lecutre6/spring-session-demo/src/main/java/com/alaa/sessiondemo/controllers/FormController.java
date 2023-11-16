package com.alaa.sessiondemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
public class FormController {
	
	
	@RequestMapping("/form")
	public String formPage() {
		
		return "forms_pages/form.jsp";
	}
	
	@RequestMapping(value="/processForm", method= RequestMethod.POST)
	public String login(@RequestParam(value="email") String userEmail,
						@RequestParam(value="password") String pw,
						HttpSession session,
						RedirectAttributes flash) {
		
		session.setAttribute("email", userEmail);
		session.setAttribute("pass", pw);
		if(pw.length() < 8) {
			flash.addFlashAttribute("error", "Your password must be more than 8 characters");
			return "redirect:form";
		}
		flash.addFlashAttribute("success", "You have successfully Logged-in");
//		System.out.println("You payed 100$");
		return "redirect:/display";
	}
	
	@RequestMapping("/display")
	public String displayResult() {
		
		
//		render result.jsp
		return "forms_pages/result.jsp";
	}
	
	
	
	
	
	
	

	
	
	
}
