package com.dl.injection.qualifer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("carModel")
public class Model {
	@Value("${model.name}")
	private String model;
	@Value("${model.type}")
	private String type;
	@Override
	public String toString() {
		return "Model [model=" + model + ", type=" + type + "]";
	}
	
}
