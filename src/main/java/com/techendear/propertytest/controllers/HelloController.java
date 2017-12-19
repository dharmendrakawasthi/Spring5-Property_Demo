package com.techendear.propertytest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.techendear.propertytest.services.HelloServiceImpl;

@Controller
public class HelloController {

	@Autowired
	private HelloServiceImpl helloServiceImpl;

	public HelloController(HelloServiceImpl helloServiceImpl) {
		this.helloServiceImpl = helloServiceImpl;
	}
	public void sayHellotoMe() {
		System.out.println(helloServiceImpl.sayHello());
	}
	
}
