package com.dl.injection.qualifer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Honda {
	@Autowired
	@Qualifier("carModel")
	private Model models;
	
	@Autowired
	@Qualifier("carShowroom")
	private Showroom show;

	@Override
	public String toString() {
		return "Honda [models=" + models + ", show=" + show + "]";
	}
	
}
