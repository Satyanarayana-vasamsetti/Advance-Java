package com.dl.dependency.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.dl.dependency.javabased")
@Component("bike")
public class Bike implements Brand {

	@Override
	@Bean
	public String honda() {
		
		return "Honda sp 125";
	}

	

}
