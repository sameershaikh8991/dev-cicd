package com.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdApplication {


	@GetMapping("/get")
	public String get(){
		return "hello sameer";
	}

	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);
	}

}
