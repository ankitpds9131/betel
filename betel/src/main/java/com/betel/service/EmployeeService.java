package com.betel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betel.dto.EmployeeDto;
import com.betel.entity.EmployeeEntity;
import com.betel.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repo;
	
	public void saveEmployee(EmployeeDto dto) {
		
		EmployeeEntity entity = new EmployeeEntity();
		
		entity.setFirstName(dto.getFirstName());
		entity.setLastName(dto.getLastName());
		entity.setAge(dto.getAge());
		entity.setCity(dto.getCity());
		entity.setEmpId(dto.getEmpId());
		
		repo.save(entity);
		
	}
	
	public EmployeeDto s3(int empId) {
		
		EmployeeEntity entity =  repo.getById(empId);
		
		EmployeeDto dto = new EmployeeDto();
		
		dto.setEmpId(entity.getEmpId());
		dto.setAge(entity.getAge());
		dto.setCity(entity.getCity());
		dto.setFirstName(entity.getFirstName());
		dto.setLastName(entity.getLastName());
		
		
		return dto;
	
		

		
	}
	
	
}
