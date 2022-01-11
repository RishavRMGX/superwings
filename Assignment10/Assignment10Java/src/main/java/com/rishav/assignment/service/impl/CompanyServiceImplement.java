package com.rishav.assignment.service.impl;

import com.rishav.assignment.entity.Company;
import com.rishav.assignment.entity.Department;
import com.rishav.assignment.repository.CompanyRepository;
import com.rishav.assignment.service.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
public class CompanyServiceImplement implements CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Override
    public Page<Company> getCompaniesList(Pageable pageable) {
        return companyRepository.findAll(pageable);
    }

    @Override
    public Page<Department> getDepartmentList(Pageable pageable) {
        return companyRepository.findDepartments(pageable);
    }

    @Override
    public Company getCompanyById(Long id) {
        Company company = companyRepository.findById(id).orElse(null);
        if(company==null) throw new RuntimeException("Company Not Found");
        return company;
    }

    @Override
    public Company getCompanyInfo(String regNo) {
        Company company = companyRepository.findCompanyByRegNo(regNo).orElse(null);
        if(company==null) throw new RuntimeException("Company Not Found");
        return company;
    }

    @Override
    public Company getCompanyByName(String name) {
        Company company = companyRepository.findCompanyByName(name).orElse(null);
        if(company==null) throw new RuntimeException("Company Not Found");
        return company;
    }

    @Override
    public Company addCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }
}
