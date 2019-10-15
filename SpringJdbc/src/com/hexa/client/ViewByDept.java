package com.hexa.client;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import com.hexa.dao.IDao;

public class ViewByDept {

	static ApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfig.class);
	public static void main(String[] args) {

       IDao dao = ctx.getBean("mydao", IDao.class);
		
		List<Map<String, Object>> lst = dao.getEmployee("Developer");
		for(Map row : lst) {
		System.out.println(row.get("emp_id"));
		System.out.println(row.get("emp_name"));
		System.out.println(row.get("emp_sal"));
		System.out.println(row.get("emp_doj"));
		System.out.println(row.get("emp_dept"));
		System.out.println("---------------------------");
		} 
	}

}
