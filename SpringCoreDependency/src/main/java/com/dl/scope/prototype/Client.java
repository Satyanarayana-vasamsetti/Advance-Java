package com.dl.scope.prototype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com/dl/scope/prototype")
@PropertySource("com/dl/scope/prototype/application.properties")
class AppConfig{
	
}
public class Client {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Honda honda = context.getBean(Honda.class);
		System.out.println(honda.hashCode());//24119573
		
		Honda honda1 = context.getBean(Honda.class);
		System.out.println(honda1.hashCode());//568221876
		context.close();
	}
}
