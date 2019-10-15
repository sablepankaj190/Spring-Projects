package com.hexa.service;

import com.hexa.entity.Account;
import com.hexa.exceptions.BalException;
import com.hexa.exceptions.IDException;

public interface ISer {

	boolean transferFund(int from, int to, double amt)
			throws IDException, BalException;
	
	Account getAccount(int aid)throws IDException;
}
