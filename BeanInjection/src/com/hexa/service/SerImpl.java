package com.hexa.service;

import com.hexa.dao.IDao;

public class SerImpl implements ISer{

	public IDao dao;
	
	public SerImpl() {
		System.out.println("Service Constructor fires");
	 
	}
	
	
	@Override
	public String viewDao() {
		return dao.getDao();
	}




	public void setDao(IDao dao) {
		System.out.println("Injected dao via setter.");
		this.dao = dao;
	}

	
}
