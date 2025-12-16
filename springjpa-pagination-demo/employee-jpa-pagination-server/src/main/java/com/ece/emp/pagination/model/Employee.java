package com.ece.emp.pagination.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee {
	@Id
	private Long id;
	private String empName;
	private Double salary;
	private String departmentName;
	private LocalDate dateOfJoining;

}