package com.hexa.dao;

import com.hexa.entity.Account;
import com.hexa.exceptions.IDException;

public interface IAccountDao {
	
	public Account getAccount(int aid) throws IDException;
	
	public int updateAccount(Account acc);
	

}
