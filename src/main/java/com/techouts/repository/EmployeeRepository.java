package com.techouts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techouts.model.Employee;

@Repository
	public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	 
	}

