package com.project.EmployeeManagementApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.EmployeeManagementApp.POJO.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
