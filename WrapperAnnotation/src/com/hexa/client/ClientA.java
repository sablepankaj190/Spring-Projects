package com.hexa.client;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hexa.service.Iser;


public class ClientA {

	static ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

	public static void main(String[] args) {
		System.out.println("Main Starts");

		Iser ser = ctx.getBean("myservice", Iser.class);
		System.out.println(ser.convertToINR(56.0));
	}

}
