package com.hexa.demos;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hexa.entity.Emp;

public class EditEmployee {

	public static void main(String[] args) {
		RestTemplate rt = new RestTemplate();
		String editurl = "http://172.25.229.141:8080/edit";

		String getbyidurl = "http://172.25.229.141:8080/byid/1001";
		Emp emp = rt.getForObject(getbyidurl, Emp.class);
		emp.setEmpSal(200000);
		emp.setEmpName("Rahul khan");
		HttpEntity<Emp> req = new HttpEntity<Emp>(emp);
        ResponseEntity<String> resp= rt.exchange(editurl, HttpMethod.PUT, req, String.class);
		System.out.println(resp.getBody());
	}

}
