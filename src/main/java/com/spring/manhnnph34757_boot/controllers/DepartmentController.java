package com.spring.manhnnph34757_boot.controllers;

import com.spring.manhnnph34757_boot.entities.Department;
import com.spring.manhnnph34757_boot.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping()
    public Iterable<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

}
