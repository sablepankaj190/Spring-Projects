package com.hexa.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hexa.entity.Department;
import com.hexa.entity.Emp;

public interface IEmpDao {
	
	public int addEmployee(Emp emp);
	public int editEmployee(Emp emp);
	public Emp getEmployee(int eid);
	public int removeEmployee(int eid);
	public List<Emp> getEmployee();
	public List<Emp> getEmployee(String dept);
	public List<Department> getDepartments();
}
