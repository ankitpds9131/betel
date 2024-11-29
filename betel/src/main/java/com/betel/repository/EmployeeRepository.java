package com.betel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.betel.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>{

}
