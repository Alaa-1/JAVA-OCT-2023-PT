package com.alaa.hellospring.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	
	// by default GET Request
	@RequestMapping("/")
	public String index() {
		return "Hello Spring!";
	}

	@RequestMapping("/about")
	public String about() {
		return "<h1>This is an about page</h1><hr><p>this a paragraph</p>";
	}
	
// POST REQUEST
//	@RequestMapping(value = "/another", method = RequestMethod.POST)
//	public String another() {
//		return "post request demo";
//	}
	
	

	// ==== QUERY PARAMETER ====
	// http://localhost:8080/search?q=spring+boot

	@RequestMapping("/search")
	public String search(@RequestParam(value = "q",required=false) String searchQuery) {

		return "you searched for " + searchQuery;
	}

	// name 
	// email
	// pw
	// url: localhost:8080/signup/?
	@RequestMapping("/signup")
	public String signup(@RequestParam(value = "name") String name,
						@RequestParam(value = "email") String email,
						@RequestParam(value = "password") String pw) {

		return "your name is " + name + " email:" + email + " password:" + pw;
	}
	
	
	// ==== PATH VARIABLE ====
	
	// http://localhost:8080/greeting/joe
	
	@RequestMapping("/greeting/{name}")
	public String greet(@PathVariable("name") String username) {
		
		return "Good Evening " + username;
	}
	
	
	// http://localhost:8080/greeting/Amy/15/oranges
	
	@RequestMapping("/greeting/{name}/{number}/{something}")
	public String greet2(@PathVariable("name") String username,
						@PathVariable("number") Integer count,
						@PathVariable("something") String someVar) {
					
		if(count > 10) {
			return username + " " + "has too many " + someVar;
		}
		return "Your name is " + username + " and you have " + count  +" " + someVar;
	}
	
}
