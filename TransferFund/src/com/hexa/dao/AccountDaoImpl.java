package com.hexa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hexa.entity.Account;
import com.hexa.exceptions.IDException;

@Repository("adao")

public class AccountDaoImpl implements IAccountDao{

	@PersistenceContext
	private EntityManager em;
	
	
	
	@Override
	public Account getAccount(int aid) throws IDException {
	
		return em.find(Account.class, aid);
	}

	@Override
	public int updateAccount(Account acc) {
		em.merge(acc);
		return 0;
	}

}
