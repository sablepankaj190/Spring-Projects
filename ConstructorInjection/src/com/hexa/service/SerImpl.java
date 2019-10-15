package com.hexa.service;

import com.hexa.dao.IDao;

public class SerImpl implements ISer{

	private IDao dao;

	
	public SerImpl(IDao dao) {
		this.dao = dao;
		System.out.println("Service Constructor fires");
	}


	@Override
	public String viewDao() {
		// TODO Auto-generated method stub
		return dao.getDao();
	}
	
	
}
