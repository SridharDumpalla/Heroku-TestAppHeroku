package com.example.TestAppHeroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.app")
public class TestAppHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestAppHerokuApplication.class, args);
	}

}
