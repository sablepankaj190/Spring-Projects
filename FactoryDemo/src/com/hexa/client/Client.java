package com.hexa.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexa.service.Car;

public class Client {

	static ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

	public static void main(String[] args) {

		Car car = ctx.getBean("mycar", Car.class);
		car.drive();
	}

}
