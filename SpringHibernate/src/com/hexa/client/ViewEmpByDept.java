package com.hexa.client;

import java.time.LocalDate;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexa.dao.IEmpDao;
import com.hexa.entity.Emp;

public class ViewEmpByDept {
	static ApplicationContext ctx = new AnnotationConfigApplicationContext(HibernateConfig.class);

	public static void main(String[] args) {

		IEmpDao dao = ctx.getBean("mydao", IEmpDao.class);
		List<Emp> lst=dao.getEmployee("Developer");
		lst.forEach(System.out::println);

}
}
