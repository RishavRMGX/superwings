package com.rishav.assignment.service.impl;

import com.rishav.assignment.entity.Department;
import com.rishav.assignment.repository.DepartmentRepository;
import com.rishav.assignment.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Page<Department> getDepartmentList(Pageable pageable) {
        return departmentRepository.findAll(pageable);
    }

    @Override
    public Department getDepartmentById(Long id) {
        Department department = departmentRepository.findById(id).orElse(null);
        if(department==null) throw new RuntimeException("Department Not Found");
        return department;
    }

    @Override
    public Department getDepartmentByName(String name) {
        Department department = departmentRepository.findDepartmentByName(name).orElse(null);
        if(department==null) throw new RuntimeException("Department Not Found");
        return department;
    }

    @Override
    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}
