package com.hexa.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hexa.service.CarFactory;

@Configuration
@ComponentScan("com.hexa")
public class SpringConfig {

	@Bean(name = "mycar")
	public CarFactory getCarFactory() {
		return new CarFactory();
	}
}
