package com.hexa.dao;

import java.util.List;

import com.hexa.entity.Department;
import com.hexa.entity.Emp;
import com.hexa.exceptions.EmpException;

public interface IEmpDao {
	
	
	public int addEmployee(Emp emp)throws EmpException;
	public int editEmployee(Emp emp);
	public Emp getEmployee(int eid)throws EmpException;
	public int removeEmployee(int eid);
	public List<Emp> getEmployee();
	public List<Emp> getEmployee(String dept);
	public List<Department> getDepartments();
}
