package com.dl.dependency.annotation;

import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements Brand {

	@Override
	public String honda() {
		
		return "Honda sp 125";
	}

	

}
