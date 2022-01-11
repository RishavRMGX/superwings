package com.rishav.assignment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Employee {

    @Id
    private Long Id;

    private String Code;

    private String name;

    private String designation;

    private LocalDate joinDate;

}
