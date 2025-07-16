package com.dl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/basics")
public class HelloController {
	
	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String hello(Model model) {
		model.addAttribute("username","bunny");
		model.addAttribute("useremail","satya@gmail.com");
		return "hello";
		
	}
}
