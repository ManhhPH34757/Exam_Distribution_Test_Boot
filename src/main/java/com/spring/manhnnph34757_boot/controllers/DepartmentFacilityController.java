package com.spring.manhnnph34757_boot.controllers;


import com.spring.manhnnph34757_boot.entities.Department;
import com.spring.manhnnph34757_boot.entities.DepartmentFacility;
import com.spring.manhnnph34757_boot.entities.Facility;
import com.spring.manhnnph34757_boot.entities.Staff;
import com.spring.manhnnph34757_boot.repositories.DepartmentFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/department-facilities")
public class DepartmentFacilityController {

    @Autowired
    private DepartmentFacilityRepository departmentFacilityRepository;

    @PostMapping()
    public DepartmentFacility saveDepartmentFacility(@RequestBody DepartmentFacility departmentFacility) {
        return departmentFacilityRepository.save(departmentFacility);
    }

    @GetMapping()
    public DepartmentFacility getDepartmentFacility() {
        return departmentFacilityRepository.getDepartmentFacilityLatest();
    }
}
