package com.ece.emp.pagination.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ece.emp.pagination.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	Page<Employee> findByDepartmentName(String departmentName, Pageable pageable);
}
