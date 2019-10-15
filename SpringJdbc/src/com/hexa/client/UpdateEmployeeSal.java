package com.hexa.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import com.hexa.dao.IDao;
import com.hexa.entity.Emp;

public class UpdateEmployeeSal {

	static ApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfig.class);
	public static void main(String[] args) {

    IDao dao = ctx.getBean("mydao", IDao.class);
		
		try {
			Emp emp = dao.viewEmployee(1003);
			System.out.println(emp);
			int row = dao.editEmployee(1003, 43000.0);
			
			System.out.println("Updated...");
			emp = dao.viewEmployee(1003);
			System.out.println(emp);
		} catch (EmptyResultDataAccessException e) {
			System.out.println("row now found");
		}
	}

	}

