package com.hexa.demos;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.hexa.entity.Emp;

public class AddEmployee {

	public static void main(String[] args) {

		RestTemplate rt=new RestTemplate();
//		String url = "http://172.25.229.141:8080/add";
//		Emp emp = new Emp(2017, "Naik", 69, "Production Support", LocalDate.of(2019, 9, 30));
//		String res = rt.postForObject(url, emp, String.class);
//		System.out.println(res);
	
		System.out.println("-------------------");
//		MultiValueMap<String, Object> params = new LinkedMultiValueMap<String, Object>();
//		params.add("eid", 2013);
//		params.add("ename", "Pankaj");
//		params.add("sal", 90000);
//		params.add("dept", "Finance");
//		params.add("doj", "2018-9-12");
//		String url2 = "http://172.25.229.141:8082/add2";
//		String res = rt.postForObject(url2, params, String.class);
//	    System.out.println(res);
	    
		MultiValueMap<String, Object> params = new LinkedMultiValueMap<String, Object>();
		params.add("empId", 2014);
		params.add("empName", "Ashraf");
		params.add("empSal", 80000);
		params.add("dept", "Developer");
		params.add("doj", "2018-9-12");
		String url3 = "http://172.25.229.141:8082/add3";
		String res = rt.postForObject(url3, params, String.class);
	    System.out.println(res);
	    
	    
	}

}