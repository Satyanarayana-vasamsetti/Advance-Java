package com.dl.dependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/dl/dependency/applicationContext.xml");
		Brand car = context.getBean("car",Brand.class);
		System.out.println(car.honda());
		
		Brand bike = context.getBean("bike",Brand.class);
		System.out.println(bike.honda());
		context.close();
		
		//File system
		FileSystemXmlApplicationContext context2 = new FileSystemXmlApplicationContext("C:/Users/satya/OneDrive/Desktop/Code Practice/Adv Java/SpringCoreDependency/src/main/java/com/dl/dependency/applicationContext.xml");
		Brand ca = context2.getBean("car",Brand.class);
		System.out.println(car.honda());
		
		Brand bik = context2.getBean("bike",Brand.class);
		System.out.println(bike.honda());
		context2.close();
	}
}
