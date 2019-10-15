package com.hexa.client;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexa.dao.EmpDaoImpl;
import com.hexa.dao.IEmpDao;
import com.hexa.entity.Emp;

public class AddEmployee {
	static ApplicationContext ctx = new AnnotationConfigApplicationContext(JpaConfig.class);
	public static void main(String[] args) {
		IEmpDao dao= ctx.getBean("mydao", IEmpDao.class);
		Emp emp = new Emp(1014,"Raju",42000,"Cleaner", LocalDate.of(2018, 6, 18));
		dao.addEmployee(emp);
		System.out.println("row added");

	}

}
