package com.techendear.propertytest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.techendear.propertytest.examplebeans.DummyDatasource;
import com.techendear.propertytest.examplebeans.DummyJmsBroker;

@Configuration

@PropertySources({
	
	@PropertySource("classpath:datasource.properties"),
	@PropertySource("classpath:jms.properties")
})
public class PropertyConfig {
	
	@Value("${com.user}")
	String user;
	
	@Value("${com.pass}")
	String pass;
	
	@Value("${com.url}")
	String url;
	
	@Value("${com.jms.username}")
	String username;
	
	@Value("${com.jms.pass}")
	String password;
	
	@Value("${com.jms.url}")
	String urljms;
	
	@Bean
	public DummyDatasource dummyDatasource() {
		DummyDatasource source=new DummyDatasource();
		source.setUser(user);
		source.setPass(pass);
		source.setUrl(url);
		return source;
		
	}
	
	@Bean
	public DummyJmsBroker dummyJmsBroker() {
		DummyJmsBroker jmssource=new DummyJmsBroker();
		jmssource.setJmsuser(username);
		jmssource.setJmapass(password);
		jmssource.setJmsurl(urljms);		
		return jmssource;
	}
	
//	@Bean
//	public static PropertySourcesPlaceholderConfigurer properties() {
//		return new PropertySourcesPlaceholderConfigurer();
//	}
}
