package com.dl.injection.setters;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Models {
	@Value("${models.name}")
	private String models;
	@Value("${type.name}")
	private String type;
	public String getModels() {
		return models;
	}
	public void setModels(String models) {
		this.models = models;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Models [models=" + models + ", type=" + type + "]";
	}
	
}
