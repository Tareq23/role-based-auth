package com.tareq23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
//@EnableJpaRepositories
//@ComponentScan(basePackages="com.tareq23.controller")
public class RoleBaseAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoleBaseAuthenticationApplication.class, args);
//		System.out.println("Hello world");
	}

}
