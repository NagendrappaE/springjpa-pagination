package com.ece.emp.pagination.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ece.emp.pagination.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Page findByDepartmentName(String departmentName, Pageable firstPageWithTwoElements) {

		return employeeRepository.findByDepartmentName(departmentName, firstPageWithTwoElements);
	}

}
