package com.rishav.assignment.service.impl;

import com.rishav.assignment.entity.Employee;
import com.rishav.assignment.repository.EmployeeRepository;
import com.rishav.assignment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Page<Employee> getEmployeeList(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public Employee getEmployeeByName(String name) {
        Employee employee = employeeRepository.findByName(name).orElse(null);
        if(employee==null) throw new RuntimeException("Employee Not Found");
        return employee;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        if(employee==null) throw new RuntimeException("Employee Not Found");
        return employee;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }
}
