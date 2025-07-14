package com.dl.lazy;

import org.springframework.stereotype.Component;

@Component
public class LazyBean {
	public LazyBean() {
		System.out.println("Lazy Bean");
	}
}
