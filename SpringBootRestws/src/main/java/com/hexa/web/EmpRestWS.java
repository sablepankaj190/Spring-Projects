package com.hexa.web;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hexa.dao.IEmpDao;
import com.hexa.entity.Emp;

@RestController
public class EmpRestWS {

	@Autowired
	private IEmpDao dao;

	@RequestMapping(value = "byid/{eid}", method = RequestMethod.GET)
	public Emp viewEmpById(@PathVariable("eid") int empId) {
		Emp emp = dao.getEmployee(empId);
		return emp;
	}
	
	@RequestMapping(value = "bydept", method = RequestMethod.GET)
	public List<Emp> viewEmpById(@RequestParam("dname") String dept) {
		List<Emp> emp = dao.getEmployee(dept);
		return emp;
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String addEmployee(@RequestBody Emp emp) {
		try {
			dao.addEmployee(emp);
			return "Employee added and id is : " + emp.getEmpId();
		} catch (Exception e) {

			return "Id already exists";
		}
	}
	
	@RequestMapping(value="add2", method=RequestMethod.POST)
	public String addEmployee2(@RequestParam("eid") int eid, @RequestParam("ename") String ename,
			@RequestParam("sal") double sal, @RequestParam("dept") String dept, @RequestParam("doj") @DateTimeFormat(pattern="yyyy-M-d") LocalDate doj ){
		try {
			Emp emp=new Emp(eid,ename,sal,dept,doj);
		dao.addEmployee(emp);
		return "employee added and the id is  "+emp.getEmpId();
		}catch(Exception ex){
			return "ID already exists";
		}
	}
	
	@RequestMapping(value="add3", method=RequestMethod.POST)
	public String addEmployee3(@ModelAttribute Emp emp){
		try {
			
		dao.addEmployee(emp);
		return "employee added and the id is  "+emp.getEmpId();
		}catch(Exception ex){
			return "ID already exists";
		}
	}
	
	
	
	@RequestMapping(value = "edit", method = RequestMethod.PUT)
	public String editEmployee(@RequestBody Emp emp) {
		try {
			dao.editEmployee(emp);
			return "employee edited";
		} catch (Exception e) {

			return "Not edited";
		}
	}
	
	@RequestMapping(value = "remove", method = RequestMethod.DELETE)
	public String removeEmployee(@PathVariable("eid") int empId) {
		try {
			dao.removeEmployee(empId);
			return "employee deleted";
		} catch (Exception e) {

			return "Not deleted";
		}
	}

}
