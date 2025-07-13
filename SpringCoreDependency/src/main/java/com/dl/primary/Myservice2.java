package com.dl.primary;

import org.springframework.stereotype.Component;

@Component
public class Myservice2 implements MyService{

	@Override
	public void performService() {
		System.out.println("Service Two");
		
	}

}
