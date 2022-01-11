package com.rishav.assignment.service;

import com.rishav.assignment.entity.Department;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface DepartmentService {

    Page<Department> getDepartmentList(Pageable pageable);

    Department getDepartmentById(Long id);

    Department getDepartmentByName(String name);

    Department addDepartment(Department department);

    void deleteDepartment(Long id);

}
