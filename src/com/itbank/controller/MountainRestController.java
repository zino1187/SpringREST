package com.itbank.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MountainRestController {
	
	@RequestMapping(value="/rest/mountains", method=RequestMethod.GET)
	public String test() {
		System.out.println("�����񽺷� ��� ��û�߳׿�");
		
		return null;
	}
}
