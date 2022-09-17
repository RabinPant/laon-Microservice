package com.rabin.loan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScans({@ComponentScan("com.rabin.loan.controller")})
@EnableJpaRepositories("com.rabin.loan.repository")
@EntityScan("com.rabin.loan.model")
public class LoanApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanApplication.class, args);
	}

}
