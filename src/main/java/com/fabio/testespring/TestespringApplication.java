package com.fabio.testespring;

import com.fabio.testespring.utils.EnvLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
//@Profile("dev")
public class TestespringApplication {

	public static void main(String[] args) {

		// Carrega as variáveis do arquivo .env
		EnvLoader.loadEnv(".env");

		SpringApplication.run(TestespringApplication.class, args);
	}

}
