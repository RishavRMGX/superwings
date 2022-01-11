package com.rishav.assignment.service;

import com.rishav.assignment.entity.Company;
import com.rishav.assignment.entity.Department;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CompanyService {

    Page<Company> getCompaniesList(Pageable pageable);

    Page<Department> getDepartmentList(Pageable pageable);

    Company getCompanyById(Long id);

    Company getCompanyInfo(String regNo);

    Company getCompanyByName(String name);

    Company addCompany(Company company);

    void deleteCompany(Long id);
}

