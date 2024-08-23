package com.spring.manhnnph34757_boot.controllers;

import com.spring.manhnnph34757_boot.entities.Facility;
import com.spring.manhnnph34757_boot.repositories.FacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/facilities")
public class FacilityController {
    @Autowired
    private FacilityRepository facilityRepository;

    @GetMapping("/{id}")
    public List<Facility> getFacilityNameByIdStaff(@PathVariable String id) {
        return facilityRepository.getFacilities(id);
    }
}
