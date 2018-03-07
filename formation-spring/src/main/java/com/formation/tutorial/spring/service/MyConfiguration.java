package com.formation.tutorial.spring.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value="com.formation.tutorial.spring.service")
public class MyConfiguration {

	@Bean
	public MyService getService(){
		return new MyService();
	}
}
