package com.dl.injection.qualifer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("carShowroom")
public class Showroom {
	@Value("${model.showroom}")
	private String showroom;

	@Override
	public String toString() {
		return "Showroom [showroom=" + showroom + "]";
	}
	
}
