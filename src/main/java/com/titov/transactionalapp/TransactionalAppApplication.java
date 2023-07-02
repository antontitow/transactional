package com.titov.transactionalapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.titov.transactionalapp.repository")
public class TransactionalAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionalAppApplication.class, args);
	}

}
