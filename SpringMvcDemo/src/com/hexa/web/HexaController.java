package com.hexa.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HexaController {
	
	@RequestMapping(value ="home.htm")
	public String displayHome() {
		return "Home";
	}
	
	@RequestMapping(value ="taxfrm.htm")
	public String displayTaxForm() {
		return "TaxFrm";
	}
	@RequestMapping(value ="tax.htm", method= RequestMethod.POST)
	public String processTaxForm(@RequestParam("txtincome") double income, Model model) {
		double tax = 0;
		if(income> 1000000)
			tax = (500000*0.1)+(income - 1000000)*015;
		else if(income> 500000)
			tax = (income - 500000)*0.1;
		model.addAttribute("tax", tax);
		
		return "TaxResult";
	}
	@RequestMapping(value ="loanfrm.htm")
	public String displayLoanForm() {
		return "LoanFrm";
	}
	@RequestMapping(value ="loan.htm", method= RequestMethod.POST)
	public String processLoanForm(@RequestParam("txtamt") double amt,@RequestParam("txtyears") int years, Model model) {
		double ci = amt * Math.pow(1+0.1, years);
		ci=Math.round(ci*100)/100.0;
		double emi = ci/(years*12);
		emi=Math.round(emi*100)/100.0;
		
		model.addAttribute("ci", ci);
		model.addAttribute("emi", emi);
		
		return "LoanResult";
	}

}
