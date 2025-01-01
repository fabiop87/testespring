package com.fabio.testespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
//@Profile("dev")
public class TestespringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestespringApplication.class, args);
	}

}
