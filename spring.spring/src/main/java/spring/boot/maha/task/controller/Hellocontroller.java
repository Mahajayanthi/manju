package spring.boot.maha.task.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {
	
	@GetMapping("/hi")
	public String name() {
		return "Hi maha";
	}
		
	}


