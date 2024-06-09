package com.project1.ecom.service.impl;
import org.springframework.stereotype.Service;

import com.project1.ecom.model.Employee;
import com.project1.ecom.repository.EmployeeRepository;
import com.project1.ecom.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
