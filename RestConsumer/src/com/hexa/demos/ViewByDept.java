package com.hexa.demos;

import java.util.List;
import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.hexa.entity.Emp;

public class ViewByDept {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();
		List<Map> emp = rt.getForObject("http://172.25.229.141:8080/bydept?dname=Finance", List.class);
		emp.forEach(System.out::println);

		System.out.println("-----------------------------------------------");
		ParameterizedTypeReference<List<Emp>> type = new ParameterizedTypeReference<List<Emp>>() {
		};

		ResponseEntity<List<Emp>> resp = rt.exchange("http://172.25.229.141:8080/bydept?dname=Finance", HttpMethod.GET, null,
				type);
		List<Emp> elist = resp.getBody();
		elist.forEach(System.out::println);

	}

}
