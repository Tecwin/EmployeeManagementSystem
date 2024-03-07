package com.project.EmployeeManagementApp.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.EmployeeManagementApp.DTO.CustomResponseDTO;
import com.project.EmployeeManagementApp.DTO.EmployeeDTO;
import com.project.EmployeeManagementApp.Mapper.EmployeeMapper;
import com.project.EmployeeManagementApp.POJO.Employee;
import com.project.EmployeeManagementApp.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	public CustomResponseDTO addEmployee(EmployeeDTO employeeDTO) {
		Employee employee=employeeMapper.toEmployee(employeeDTO);
		try {
			employeeRepository.save(employee);
			return new CustomResponseDTO("Success",200,"Employee Added Successfully");
		}
		catch(Exception e) {
			return new CustomResponseDTO("Failure",400,"Employee not Added");
		}
	}
	
	public List<Employee> getAllEmployee(){
		List<Employee> allEmployees=employeeRepository.findAll();
		return allEmployees;
	}
	
	public CustomResponseDTO deleteEmployee(Integer id) {
		Optional<Employee> employee=employeeRepository.findById(id);
		if(!employee.isEmpty()) {
		employeeRepository.delete(employee.get());
		return new CustomResponseDTO("Success",200,"Employee Deleted Successfully");
		}
		else
			return new CustomResponseDTO("Failure",400,"Failed to Delete");
		
	}
	
	public Optional<Employee> getEmployee(Integer id) {
		
		try {
		Optional<Employee> employee=employeeRepository.findById(id);
		return employee;
		}
		catch(Exception e) {
			return Optional.ofNullable(new Employee());
		}
		
	}
	
	public CustomResponseDTO updateEmployee(EmployeeDTO employeeDTO,Integer id) {
		Optional<Employee> e=employeeRepository.findById(id);
		if(!e.isEmpty()) {
		Employee updatedEmployee=employeeMapper.toEmployee(employeeDTO);
		updatedEmployee.setEmployeeID(id);
		employeeRepository.save(updatedEmployee);
		return new CustomResponseDTO("Success",200,"Employee updated Successfully");
		}
		else
			return new CustomResponseDTO("Failure",400,"Employee not Found");
	}
}
