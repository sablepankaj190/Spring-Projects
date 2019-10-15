package com.hexa.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("jpa")
@Lazy(true)
public class JpaDaoImpl implements IDao{

	
	public JpaDaoImpl() {
		System.out.println("Jpa DAO constructor fires.");
	}
	
	@Override
	public String getDao() {
		return "jpa";
	}
}
