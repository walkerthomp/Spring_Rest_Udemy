package com.udemy.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Rest API
@RestController
public class HelloWorldController {
	
	
	@GetMapping(path = "/hello-world")
	public String hellowWorld() {
		return "Hello World";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean hellowWorldBean() {
		return new HelloWorldBean("Hello World");
	}

	
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean hellowWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(
				String.format("Hello world, %s", name));
	}
	
	@GetMapping(path = "/hellow-world-internationalized")
	public String hellowWorldInternationalized() {
		return "Hello World V2";
	}
}
