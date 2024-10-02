package com.ce.fisa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TestController {
	
	@GetMapping("/test")
	public String test() {
		log.info("k8s test입니다.");
		return "SpringApp k8s test입니다.";
	}
}
