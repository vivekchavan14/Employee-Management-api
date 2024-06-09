package com.project1.ecom.service;

import java.util.List;

import com.project1.ecom.model.Employee;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
}
