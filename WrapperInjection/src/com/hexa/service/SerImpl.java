package com.hexa.service;

public class SerImpl implements Iser{

	private double inr;
	



	public SerImpl(double inr) {
		this.inr = inr;
	}



	@Override
	public double convertToINR(double dollar) {
		double in = this.inr * dollar;
		return in;
	}

}
