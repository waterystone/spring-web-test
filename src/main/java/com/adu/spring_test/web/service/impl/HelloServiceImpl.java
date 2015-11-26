package com.adu.spring_test.web.service.impl;

import org.springframework.stereotype.Service;

import com.adu.spring_test.web.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	public String hello() {
		return "Hello,World!";
	}

}
