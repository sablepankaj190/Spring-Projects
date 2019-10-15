package com.hexa.dao;

public class JpaDaoImpl implements IDao{

	
	public JpaDaoImpl() {
		System.out.println("Jpa DAO constructor fires.");
	}
	
	@Override
	public String getDao() {
		return "jpa";
	}
}
