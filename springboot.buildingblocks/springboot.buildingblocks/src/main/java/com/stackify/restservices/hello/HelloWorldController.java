package com.stackify.restservices.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	
	
	//@RequestMapping(method=RequestMethod.GET,path="/helloworld")
	@GetMapping("/helloworld1")
	public String helloworld() {
		return "Hello yuvaraj1";
	}
	@GetMapping("/helloworld-Bean")
		public UserDetails helloworldBean(){
			return new UserDetails("yuvaraj","yerra","bangalore");
		}
	
}
