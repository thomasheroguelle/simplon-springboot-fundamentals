package co.simplon.cda.fundamentals.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/invisibles")
@RestController
class InvisibleController {
	@GetMapping
	String getOne() { 
		return "I am invisible"; 
	}
}
