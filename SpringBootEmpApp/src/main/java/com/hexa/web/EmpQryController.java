package com.hexa.web;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hexa.dao.IEmpDao;
import com.hexa.entity.Emp;

@Controller
public class EmpQryController {

	
	@Autowired
	private IEmpDao dao;

	@RequestMapping(value = { "/", "home" })
	public String displayHome() {
		return "Home";
	}

	@RequestMapping(value = "viewall")
	public String viewAllEmpllyee(Model model) {
		model.addAttribute("elist", dao.getEmployee());
		return "EmpList";
	}

	@RequestMapping(value = "viewdepts")
	public String viewAllDepartment(Model model) {
		model.addAttribute("dlist", dao.getDepartments());
		return "DeptList";
	}

	@RequestMapping(value = "viewbyid")
	public String viewEmployeebyId(Model model) {
//		model.addAttribute("employee", dao.getEmployee(empId);
		return "EmpId";
	}

	@RequestMapping(value = "viewid")
	public String viewById(@RequestParam("txteid") String empId, Model model) {

		int id = Integer.parseInt(empId);
		model.addAttribute("employee", dao.getEmployee(id));
		return "EmpId";
	}

	@RequestMapping(value = "add")
	public String viewAddEmployee(Model model) {
//		model.addAttribute("employee", dao.getEmployee(empId);
		return "AddEmployee";
	}

	@RequestMapping(value = "removeemp/{empid}")
	public String removeemp(@PathVariable("empid") String empId, Model model) {
		int id = Integer.parseInt(empId);
		model.addAttribute(dao.removeEmployee(id));
		model.addAttribute("message", id);
		return "EmpById";
	}

	@RequestMapping(value = "addemp")
	public String addEmployee(@RequestParam("txteid") String empId, @RequestParam("txtname") String empName,
			@RequestParam("txtsal") String empSal, @RequestParam("cbodept") String dept,
			@RequestParam("txtdt") @DateTimeFormat(pattern = "yyyy-M-d") LocalDate doj, Model model) {

		int id = Integer.parseInt(empId);
		double sal = Double.parseDouble(empSal);
		Emp emp = new Emp(id, empName, sal, dept, doj);
		model.addAttribute("employee", dao.addEmployee(emp));
		model.addAttribute("msg", "Employee successfully updated...");
		return "AddEmployee";
	}

}