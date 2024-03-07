package com.project.EmployeeManagementApp.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.EmployeeManagementApp.DTO.CustomResponseDTO;
import com.project.EmployeeManagementApp.DTO.EmployeeDTO;
import com.project.EmployeeManagementApp.POJO.Employee;
import com.project.EmployeeManagementApp.ServiceImpl.EmployeeServiceImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	
	@PostMapping("/save")
	public CustomResponseDTO saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
		System.out.println(employeeDTO.toString());
		CustomResponseDTO customResponseDTO=employeeServiceImpl.addEmployee(employeeDTO);
		return customResponseDTO;		
		
	} 
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployee(){
		List<Employee> allEmployees=employeeServiceImpl.getAllEmployee();
		System.out.println("employee fetched");
		return allEmployees;
	}
	
	@DeleteMapping("/delete/{id}")
	public CustomResponseDTO deleteEmployee(@PathVariable Integer id) {
		CustomResponseDTO customResponseDTO=employeeServiceImpl.deleteEmployee(id);
		return customResponseDTO;
		
	}
	
	@GetMapping("/getEmployee/{id}")
	public Optional<Employee> getEmployee(@PathVariable Integer id) {
		Optional<Employee> employee=employeeServiceImpl.getEmployee(id);
		return employee;
	}
	
	@PutMapping("/updateEmployee/{id}")
	public CustomResponseDTO updateEmployee(@RequestBody EmployeeDTO employeeDTO,@PathVariable Integer id) {
		CustomResponseDTO customResponseDTO=employeeServiceImpl.updateEmployee(employeeDTO,id);
		return customResponseDTO;
	}

}
