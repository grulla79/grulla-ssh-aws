package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@RestController
public class HelloWorldController {

	@GetMapping("/demo")
	public String helloWorld() {
		return "Hello World!";
	}
	//hello
}