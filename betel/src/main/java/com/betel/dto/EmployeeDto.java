package com.betel.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmployeeDto {

	private int empId;
	private String firstName;
	private String lastName;
	private int age;
	private String city;
	
}
