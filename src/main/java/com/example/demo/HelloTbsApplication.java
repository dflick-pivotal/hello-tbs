package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloTbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloTbsApplication.class, args);
	}

	@RequestMapping
	String hello()
	{
		return "hello TBS!";
	}
}
