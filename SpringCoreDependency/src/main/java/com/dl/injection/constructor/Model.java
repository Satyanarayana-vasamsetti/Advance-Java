package com.dl.injection.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Model {
	private String model;
	private String type;
	public Model(@Value("${model.name}") String model,@Value("${model.type}") String type) {
		super();
		this.model = model;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Model [model=" + model + ", type=" + type + "]";
	}
	
}
