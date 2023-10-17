package com.udemy.spring.learnspringframework.enterprise.example.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.udemy.spring.learnspringframework.enterprise.example.*;
import com.udemy.spring.learnspringframework.enterprise.example.data.DataService;

@Component
public
class BusinessService {
	@Autowired
	private DataService ds;
	
	public long calculateSum() {
		List<Integer> data = ds.getData();
		return data.stream().reduce(Integer::sum).get();
		
	}
}

