package com.ksoft.estudos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EstudosApplication {

	public static void main(String[] args) {
		System.out.println("RODANDO APLICACAO");
		SpringApplication.run(EstudosApplication.class, args);
	}

}
