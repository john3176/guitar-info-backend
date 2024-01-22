package com.info.guitar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class GuitarApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuitarApplication.class, args);
	}

}
