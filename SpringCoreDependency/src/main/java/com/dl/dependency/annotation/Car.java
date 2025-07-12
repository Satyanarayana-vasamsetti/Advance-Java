package com.dl.dependency.annotation;

import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Brand{

	@Override
	public String honda() {
		return "Honda Civic";
	}



}
