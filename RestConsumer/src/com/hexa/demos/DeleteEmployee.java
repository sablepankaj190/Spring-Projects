package com.hexa.demos;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class DeleteEmployee {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();
		String editurl = "http://172.25.228.17:8080/remove/1001";
		
		ResponseEntity<String> resp= rt.exchange(editurl, HttpMethod.DELETE, null, String.class);
		
		System.out.println(resp.getBody());
		
	}

}
