package com.dl.dependency.javabased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Client {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Car.class);
		Brand car = context.getBean("car",Car.class);
		System.out.println(car.honda());
		context.close();
		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(Bike.class);
		Brand bike = context1.getBean("bike",Bike.class);
		System.out.println(bike.honda());
		context1.close();
	}
}
 