package com.merchant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.merchant")
public class MerchantSpringTestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MerchantSpringTestAppApplication.class, args);
	}

}
