package com.hexa.dao;

public class JdbcDaoImpl implements IDao{

	public JdbcDaoImpl() {
		System.out.println("Jdbc DAO constructor fires.");
	}
	@Override
	public String getDao() {
		
		return "jdbc";
	}

}
