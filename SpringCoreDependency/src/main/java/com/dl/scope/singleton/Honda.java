package com.dl.scope.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Honda {
	@Autowired
	private Model model;

	@Override
	public String toString() {
		return "Honda [model=" + model + "]";
	}
	
}
