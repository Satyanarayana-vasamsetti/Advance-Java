package com.dl.primary;

import org.springframework.context.annotation.Primary; 
import org.springframework.stereotype.Component;

@Component
@Primary
public class Myservice1 implements MyService {

	@Override
	public void performService() {
		System.out.println("Service One");
		
	}
	

}
