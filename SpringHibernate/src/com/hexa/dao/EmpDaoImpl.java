package com.hexa.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hexa.entity.Department;
import com.hexa.entity.Emp;
import com.hexa.exceptions.EmpException;


@Repository("mydao")
@Transactional
public class EmpDaoImpl implements IEmpDao{
	
	
   @Autowired
    SessionFactory sfac;
   
   
	@Override
	public int addEmployee(Emp emp){
		Session sess = sfac.getCurrentSession();
		sess.save(emp);
		return 1;
		
	}

	@Override
	public int editEmployee(Emp emp) {
		Session sess = sfac.getCurrentSession();
		sess.saveOrUpdate(emp);
		
		return 1;
	}

	@Override
	public Emp getEmployee(int eid) throws EmpException {
		Session sess = sfac.getCurrentSession();
		Emp emp = sess.get(Emp.class, eid);
		if(emp == null)
			throw new EmpException("ID Not Found for " + eid);
		return emp;
	}

	@Override
	public int removeEmployee(int eid) {
		Session sess = sfac.getCurrentSession();
			Emp emp = sess.get(Emp.class, eid);
			sess.delete(emp);
		return 1;
	}

	@Override
	public List<Emp> getEmployee() {
		Session sess = sfac.getCurrentSession();
		Query qry  = sess.createQuery("from Emp ");
		List<Emp> lst = qry.list();
		return lst;
	}

	@Override
	public List<Emp> getEmployee(String dept) {
		Session sess = sfac.getCurrentSession();
		Query qry  = sess.createQuery("from Emp where dept=:dname");
		qry.setParameter("dname", dept);
		List<Emp> lst = qry.list();
		return lst;
	}

	@Override
	public List<Department> getDepartments() {
		Session sess = sfac.getCurrentSession();
		Query qry  = sess.createQuery("from Department");
		List<Department> lst = qry.list();
		return lst;
	}

}
