package com.rishav.assignment.service;

import com.rishav.assignment.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {

    Page<Employee> getEmployeeList(Pageable pageable);

    Employee getEmployeeByName(String name);

    Employee getEmployeeById(Long id);

    Employee addEmployee(Employee employee);

    void deleteEmployeeById(Long id);
}
