package com.nexyliya.dramacookie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.nexyliya.dramacookie.repositories") 
@EntityScan("com.nexyliya.dramacookie.entities")
@SpringBootApplication
public class DramacookieApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(DramacookieApplication.class, args);
	}
}
