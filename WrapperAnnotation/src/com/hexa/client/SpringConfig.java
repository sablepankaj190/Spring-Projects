package com.hexa.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan("com.hexa")
@PropertySource("classpath:hexa.properties")
public class SpringConfig {

	@Bean
	public PropertySourcesPlaceholderConfigurer getConfigurer() {
		PropertySourcesPlaceholderConfigurer obj = new PropertySourcesPlaceholderConfigurer();
		
		return obj;
	}
}
