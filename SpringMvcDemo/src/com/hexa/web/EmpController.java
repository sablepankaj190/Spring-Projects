package com.hexa.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hexa.dao.IDao;

@Controller
public class EmpController {

	@Autowired
	private IDao dao;
	
	@RequestMapping(value ="viewall.htm")
	public String displayEmoloyee(Model model) {
		model.addAttribute("elist", dao.viewEmployee());
		return "EmpList";
	}
	
}
