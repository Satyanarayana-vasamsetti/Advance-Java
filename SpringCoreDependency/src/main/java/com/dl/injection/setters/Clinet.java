package com.dl.injection.setters;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("com.dl.injection.setters")
@PropertySource("classpath:com/dl/injection/setters/application.properties")
class AppConfig{
	
}
public class Clinet {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Honda honda = context.getBean(Honda.class);
		System.out.println(honda);
		context.close();
	}
}
