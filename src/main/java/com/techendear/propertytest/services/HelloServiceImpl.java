package com.techendear.propertytest.services;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{

	@Override
	public String sayHello() {
		
		return "Hello from hello service";
	}


}
