package com.codingdojo.human;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	
	@RequestMapping("/")
	public String human(@RequestParam(value="firstName", required = false ) String firstName,
						@RequestParam(value="lastName", required = false ) String lastName,
						@RequestParam(value="times", required = false) Integer times) {
		if(firstName == "" || firstName == null) {
			
			return "Hello human";
		}
		
		if(lastName == "" || lastName == null) {
			return "Hello " + firstName;
		}
		
		if(times == null || times == 0) {
			
			
			return "Hello " + firstName + " " + lastName;
		}
		String repeatedMessage = "";
		
		for(int i = 0; i < times; i++) {
			repeatedMessage += " " + firstName + " " + lastName;
			
		}
		return "Hello " + repeatedMessage;
	}
	

}
