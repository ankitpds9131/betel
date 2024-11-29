package com.betel.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.betel.dto.EmployeeDto;
import com.betel.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService s;
	
	

	
	@PostMapping("/ashish")
	public void m1(@RequestBody EmployeeDto dto) {
		s.saveEmployee(dto);
	}
	
	@GetMapping("/empData")
	public EmployeeDto getEmp(@RequestParam int empId) {

		EmployeeDto d = s.s3(empId);
		return d;
		
		
	}

	
}
