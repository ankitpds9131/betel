package com.betel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EmployeeEntity {
	
	@Id
	private int empId;
	
	private String firstName;
	
	private String lastName;
	
	private int age;
	
	private String city;

}
