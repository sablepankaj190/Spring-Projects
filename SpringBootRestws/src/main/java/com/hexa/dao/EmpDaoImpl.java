package com.hexa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hexa.entity.Department;
import com.hexa.entity.Emp;

@Repository("mydao")
@Transactional
public class EmpDaoImpl implements IEmpDao{

	@PersistenceContext
	private EntityManager em;

	@Override
	public int addEmployee(Emp emp) {
		em.persist(emp);
		return 1;
	}

	@Override
	public int editEmployee(Emp emp) {
		em.merge(emp);
		return 1;
	}

	@Override
	public Emp getEmployee(int eid) {
		return em.find(Emp.class, eid);
	}

	@Override
	public int removeEmployee(int eid) {
		em.remove(em.find(Emp.class, eid)); 
		return 1;
	}

	@Override
	public List<Emp> getEmployee() {
		Query qry = em.createQuery("from Emp emp");
		return qry.getResultList();
	}
	@Override
	public List<Emp> getEmployee(String dept) {
		Query qry = em.createQuery("from Emp emp where dept=:dname");
		qry.setParameter("dname", dept);
		return qry.getResultList();
	}

	@Override
	public List<Department> getDepartments() {
		Query qry = em.createQuery("from Department dept");
		return qry.getResultList();
	}
	
	
}
