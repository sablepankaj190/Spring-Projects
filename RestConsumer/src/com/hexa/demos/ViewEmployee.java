package com.hexa.demos;

import org.springframework.web.client.RestTemplate;

import com.hexa.entity.Emp;

public class ViewEmployee {
	
	public static void main(String args[]) {
		RestTemplate rt=new RestTemplate();
		Emp emp=rt.getForObject("http://172.25.229.80:8080/byid/2017", Emp.class);
		System.out.println(emp);
	}

}