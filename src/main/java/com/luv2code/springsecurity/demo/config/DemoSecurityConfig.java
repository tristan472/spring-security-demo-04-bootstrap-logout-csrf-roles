package com.luv2code.springsecurity.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig {

	@Bean
	public InMemoryUserDetailsManager userDetailsService() {
		
		UserDetails user = User.withUsername("employe").password("{noop}test123").roles("EMPLOYE").build();
		UserDetails admin = User.withUsername("admin").password("{noop}test123").roles("ADMIN").build();
		UserDetails manager = User.withUsername("manager").password("{noop}test123").roles("MANAGER").build();
		return new InMemoryUserDetailsManager(user, admin, manager);
		
	}
	
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests()
		.anyRequest().authenticated().and()
		.formLogin().loginPage("/showMyLoginPage").loginProcessingUrl("authentificateTheUser")
		.permitAll();
	}
	
}