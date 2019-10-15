package com.hexa.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import com.hexa.dao.IDao;
import com.hexa.entity.Emp;

public class ViewByDeptAsList {

	static ApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfig.class);
	public static void main(String[] args) {

		 IDao dao = ctx.getBean("mydao", IDao.class);
			
			try {
				List<Emp> emp = dao.viewEmployee("Developer");
				emp.forEach(System.out::println);
			} catch (EmptyResultDataAccessException e) {
				System.out.println("row now found");
			}

		
	}

}
