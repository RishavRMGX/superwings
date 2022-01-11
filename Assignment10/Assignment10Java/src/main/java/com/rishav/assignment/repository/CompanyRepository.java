package com.rishav.assignment.repository;

import com.rishav.assignment.entity.Company;
import com.rishav.assignment.entity.Department;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    Optional<Company> findCompanyByName(String name);

    Optional<Company> findCompanyByRegNo(String regNo);

    @Query("select d from Company c join c.Department")
    Page<Department> findDepartments(Pageable pageable);
}
