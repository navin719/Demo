package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTemplate {
	
	@GetMapping("/check")
	String getName(){
		return "Welcome Navin..!! you are ready with your Azure project with CI/CD ";
	}

}
