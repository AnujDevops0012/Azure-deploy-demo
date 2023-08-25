package com.sdtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@SpringBootApplication
public class AzureWebDeployApplication {

	@GetMapping("/message")
	public String demoMessage()
	{
		return  "Hi! This the message from Azure Web Application  ";
	}

	public static void main(String[] args) {
		System.out.println("Application Started !!!!!");
		SpringApplication.run(AzureWebDeployApplication.class, args);
	}

}
