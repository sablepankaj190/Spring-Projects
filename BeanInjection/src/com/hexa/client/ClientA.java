package com.hexa.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hexa.service.ISer;

public class ClientA {

	static ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

	public static void main(String[] args) {
		System.out.println("Main Starts");
		ISer ser = ctx.getBean("myservice", ISer.class);
		System.out.println(ser.viewDao());
		

		System.out.println("---- Demand for second time ----");
		ser = ctx.getBean("myservice", ISer.class);
		System.out.println(ser.viewDao());
	}

}
