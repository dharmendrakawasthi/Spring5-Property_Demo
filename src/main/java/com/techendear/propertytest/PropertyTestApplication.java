package com.techendear.propertytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.techendear.propertytest.controllers.HelloController;
import com.techendear.propertytest.examplebeans.DummyDatasource;
import com.techendear.propertytest.examplebeans.DummyJmsBroker;

@SpringBootApplication
public class PropertyTestApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(PropertyTestApplication.class, args);
		HelloController hello=(HelloController)ctx.getBean(HelloController.class);
		hello.sayHellotoMe();
		DummyDatasource ds=(DummyDatasource)ctx.getBean(DummyDatasource.class);
		System.out.println(ds.getUser());
		System.out.println(ds.getPass());
		System.out.println(ds.getUrl());
		
		DummyJmsBroker dsor=(DummyJmsBroker)ctx.getBean(DummyJmsBroker.class);
		System.out.println(dsor.getJmsuser());
		System.out.println(dsor.getJmapass());
		System.out.println(dsor.getJmsurl());
		
		
	}
}
