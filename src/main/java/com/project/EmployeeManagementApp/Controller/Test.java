package com.project.EmployeeManagementApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")  
public class Test {

	@GetMapping("/")
	public String testmethod() {
		return "hello worold";
}
}
