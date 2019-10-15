package com.hexa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.hexa.dao.IDao;

@Component("myservice")
public class SerImpl implements ISer{

	public IDao dao;
	
	public SerImpl() {
		System.out.println("Service Constructor fires");
	 
	}
	
	
	@Override
	public String viewDao() {
		return dao.getDao();
	}




	@Autowired
	@Qualifier("jdbc")
	public void setDao(IDao dao) {
		System.out.println("Injected dao via setter.");
		this.dao = dao;
	}

	
}
