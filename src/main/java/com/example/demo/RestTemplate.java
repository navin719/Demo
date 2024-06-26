package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTemplate {
	
	@GetMapping("/test")
	String getName(){
		return "Welcome Navin..!! you are ready with your Azure project with CI/CD ";
	}

	

	@GetMapping("/welcome/{name}")
	String getName(@PathVariable String name){
//		return "Welcome "+name+"..!! you are ready with your Azure project with CI/CD ";
		return String.format("Welcome %s ..!! Finally you did it Congratulations ..!!!! hurray...:)", name);
		
	}
}
