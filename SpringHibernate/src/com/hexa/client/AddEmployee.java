package com.hexa.client;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexa.dao.EmpDaoImpl;
import com.hexa.dao.IEmpDao;
import com.hexa.entity.Emp;
import com.hexa.exceptions.EmpException;

public class AddEmployee {
	static ApplicationContext ctx = new AnnotationConfigApplicationContext(HibernateConfig.class);
	public static void main(String[] args) throws EmpException {
		IEmpDao dao= ctx.getBean("mydao", IEmpDao.class);
		try {
			Emp emp = new Emp(1016,"Ashraf",22000,"Gardner", LocalDate.of(2018, 6, 18));
			dao.addEmployee(emp);
			System.out.println("row added");
		} catch (Exception e) {
			System.out.println("Exception occured.");
			e.printStackTrace();
			
		}
		

	}

}