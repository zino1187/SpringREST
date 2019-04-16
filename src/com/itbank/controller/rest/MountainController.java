package com.itbank.controller.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MountainController {
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String test() {
		System.out.println("웹서비스로 목록 요청했네요");
		return null;
	}
}
