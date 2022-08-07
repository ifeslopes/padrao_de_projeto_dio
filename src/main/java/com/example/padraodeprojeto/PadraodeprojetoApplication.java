package com.example.padraodeprojeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PadraodeprojetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadraodeprojetoApplication.class, args);


	}

}
