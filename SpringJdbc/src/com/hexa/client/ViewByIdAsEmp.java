package com.hexa.client;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import com.hexa.dao.IDao;
import com.hexa.entity.Emp;

public class ViewByIdAsEmp {

	static ApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfig.class);
	public static void main(String[] args) {
       IDao dao = ctx.getBean("mydao", IDao.class);
		
		try {
			Emp emp = dao.viewEmployee(1002);
			System.out.println(emp);
		} catch (EmptyResultDataAccessException e) {
			System.out.println("row now found");
		}
	}

}
