package com.formation.tutorial.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.formation.tutorial.spring.service.MyConfiguration;
import com.formation.tutorial.spring.service.MyService;

public class AppTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				MyConfiguration.class);
		MyService service = ctx.getBean(MyService.class);
		
		service.log("Hi");
		
		MyService newService = ctx.getBean(MyService.class);
		System.out.println("service hashcode="+service.hashCode());
		System.out.println("newService hashcode="+newService.hashCode());
		ctx.close();
	}

}
