package com.hexa.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("jdbc")
@Lazy(true)
public class JdbcDaoImpl implements IDao{

	public JdbcDaoImpl() {
		System.out.println("Jdbc DAO constructor fires.");
	}
	@Override
	public String getDao() {
		
		return "jdbc";
	}

}
