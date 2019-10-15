package com.hexa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hexa.dao.IAccountDao;
import com.hexa.entity.Account;
import com.hexa.exceptions.BalException;
import com.hexa.exceptions.IDException;

@Service("aservice")
@Transactional
public class AccSerImpl implements ISer{

	@Autowired
	private IAccountDao dao;
	


	@Override
	public boolean transferFund(int from, int to, double amt) throws IDException, BalException {
	    Account facc = dao.getAccount(from);
	    Account tacc = dao.getAccount(to);
	    if(facc.getBal() >= amt) {
	    	facc.setBal(facc.getBal()-amt);
	    	tacc.setBal(tacc.getBal() + amt);
	    	dao.updateAccount(facc);
	    	dao.updateAccount(tacc);
	    	return true;
	    }else
	    	throw new BalException("no sufficient balance");
	    	
		
	}

	@Override
	public Account getAccount(int aid) throws IDException {
		return dao.getAccount(aid);
	}

}



