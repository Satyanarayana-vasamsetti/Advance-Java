package com.dl.lazy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Client {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppCofig.class);
		context.close();
	}
}
