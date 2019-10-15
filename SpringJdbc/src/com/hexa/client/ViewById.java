package com.hexa.client;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import com.hexa.dao.IDao;

public class ViewById {

	static ApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfig.class);
	 
	public static void main(String[] args) {

		IDao dao = ctx.getBean("mydao", IDao.class);
		
		try {
		Map<String, Object> row = dao.getEmployee(1002);
		System.out.println(row.get("emp_id"));
		System.out.println(row.get("emp_name"));
		System.out.println(row.get("emp_sal"));
		System.out.println(row.get("emp_doj"));
		System.out.println(row.get("emp_dept"));
		} catch (EmptyResultDataAccessException e) {
			System.out.println("row now found");
		}
	
	}

}