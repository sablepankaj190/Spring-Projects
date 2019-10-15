package com.hexa.service;

public class SerImpl implements Iser {

	private String msg;
	


	//setter for IOC to do dependency Injection
	public void setMsg(String msg) {
		this.msg = msg;
	}


	@Override
	public String sayHello(String str) {

		return msg + ": " + str;
	}

}
