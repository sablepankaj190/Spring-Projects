package com.hexa.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myservice")
public class SerImpl implements Iser{

	@Value("${inr}")
	private double inr;
	

	@Override
	public double convertToINR(double dollar) {
		double in = this.inr * dollar;
		return in;
	}

}
