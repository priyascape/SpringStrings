package com.kw.springstringsproject.controllers;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class StringsController {
	// 1. Annotation
		@RequestMapping("/")
		    // 3. Method that maps to the request route above
		    public String hello() { // 3
		            return "Hello Coding Dojo Tutor, How are you doing?!";
		}
		
		@RequestMapping("/random")
		public String springOther() {
			return "Spring Boot is great! SO easy to respond with strings";
		}

}
