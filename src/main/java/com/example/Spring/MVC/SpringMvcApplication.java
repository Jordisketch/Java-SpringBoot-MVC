package com.example.Spring.MVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvcApplication {

	//Esta clase tiene un servidor embebido, quiere decir que trae un servidor que arranca la aplicación
	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);

	}

}
