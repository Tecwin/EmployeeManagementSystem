package com.project.EmployeeManagementApp.Mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.EmployeeManagementApp.DTO.EmployeeDTO;
import com.project.EmployeeManagementApp.POJO.Employee;

@Service
public class EmployeeMapper {

	@Autowired
	private BCryptPasswordEncoder bcryptPasswordEncoder;
	
	public Employee toEmployee(EmployeeDTO employeeDTO) {
		Employee employee=new Employee();
		employee.setFirstName(employeeDTO.getFirstName());
		employee.setLastName(employeeDTO.getLastName());
		employee.setBirthDate(employeeDTO.getBirthDate());
		employee.setHireDate(employeeDTO.getHireDate());
		employee.setPassword( bcryptPasswordEncoder.encode(employeeDTO.getPassword()));
		employee.setPhoneNo(employeeDTO.getPhoneNo());
		employee.setEmail(employeeDTO.getEmail());;
		
		return employee;
		
	}
}
