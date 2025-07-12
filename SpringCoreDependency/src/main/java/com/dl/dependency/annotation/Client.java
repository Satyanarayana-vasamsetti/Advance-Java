package com.dl.dependency.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Client {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Brand car = context.getBean("car",Brand.class);
		System.out.println(car.honda());
		Brand bike = context.getBean("bike",Brand.class);
		System.out.println(bike.honda());
		context.close();
	}
}
 