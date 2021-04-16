package com.yash;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	// Program for understanding bean life cycle by using init and destroy
	// method;
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationcontext.xml");
		Lifecycle lifecycle = applicationContext.getBean("lifecycle", Lifecycle.class);
		applicationContext.registerShutdownHook();

	}
}
