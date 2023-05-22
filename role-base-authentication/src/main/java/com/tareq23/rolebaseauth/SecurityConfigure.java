package com.tareq23.rolebaseauth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

//@EnableWebSecurity
//public class SecurityConfigure extends WebSecurityConfigurerAdapter{
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication()
//			.withUser("tareq23")
//			.password("tareq23")
//			.roles("admin")
//			.and()
//			.withUser("tareq")
//			.password("tareq")
//			.roles("user");
//	}
//	
//	@Bean
//	public NoOpPasswordEncoder passwordEncoder() {
//		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
//	}
//	
//
//}


@Configuration
public class SecurityConfigure{
	
	
	@Autowired
	void registerProvider(AuthenticationManagerBuilder auth) throws Exception {
	    auth.inMemoryAuthentication().withUser("tareq23").password("tareq23").roles("user");
	}
	
	@Bean
	public NoOpPasswordEncoder passwordEncoder() {
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}
	
}