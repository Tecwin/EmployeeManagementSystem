package com.project.EmployeeManagementApp.Service;

import java.util.List;

import com.project.EmployeeManagementApp.DTO.CustomResponseDTO;
import com.project.EmployeeManagementApp.DTO.EmployeeDTO;
import com.project.EmployeeManagementApp.POJO.Employee;

public interface EmployeeService {

	CustomResponseDTO addEmployee(EmployeeDTO employeeDTO);
	List<Employee> getAllEmployees();
	CustomResponseDTO deleteEmployee(Integer id);
	}
