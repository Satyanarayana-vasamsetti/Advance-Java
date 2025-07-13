package com.dl.injection.fieldlevel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Honda {
	@Autowired
	private Model model;

	@Override
	public String toString() {
		return "Honda [model=" + model + "]";
	}
	
}
