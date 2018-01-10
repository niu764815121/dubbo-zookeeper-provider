package com.niu.service;

import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloServiceImpl implements HelloService{

	public String sayHello(String name) {
		return "hello"+name;
	}
}
