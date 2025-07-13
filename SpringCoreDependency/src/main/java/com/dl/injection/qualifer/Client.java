package com.dl.injection.qualifer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("com/dl/injection/qualifer")
@PropertySource("com/dl/injection/qualifer/application.properties")
class AppConfig{
	
}
public class Client {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Honda ho = context.getBean(Honda.class);
		System.out.println(ho);
		context.close();
	}
}
