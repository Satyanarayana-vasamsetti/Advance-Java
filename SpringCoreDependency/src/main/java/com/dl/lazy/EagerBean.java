package com.dl.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class EagerBean {
	public EagerBean() {
		System.out.println("Eager Bean");
	}
}
