package com.Hello_maria.dockerLearning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/name")
	public String getName() {
		return "Hello Maria. How are you ....?";
	}

}
