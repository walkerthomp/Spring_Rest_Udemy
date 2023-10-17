package com.udemy.spring.learnspringframework.enterprise.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.udemy.spring.learnspringframework.enterprise.example.*;
import com.udemy.spring.learnspringframework.enterprise.example.business.BusinessService;
@Component
public class MyWebController {
	@Autowired
	private BusinessService bs;
	
	public long returnValueFromBusinessService() {
		return bs.calculateSum();
	}

}

