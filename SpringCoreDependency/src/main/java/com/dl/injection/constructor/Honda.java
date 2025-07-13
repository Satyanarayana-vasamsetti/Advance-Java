package com.dl.injection.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Honda {
	private Model models;

	@Autowired
	public Honda(Model models) {
		super();
		this.models = models;
	}

	@Override
	public String toString() {
		return "Honda [models=" + models + "]";
	}
	
}
