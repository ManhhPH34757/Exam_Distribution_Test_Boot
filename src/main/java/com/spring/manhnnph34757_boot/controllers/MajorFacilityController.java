package com.spring.manhnnph34757_boot.controllers;

import com.spring.manhnnph34757_boot.entities.MajorFacility;
import com.spring.manhnnph34757_boot.repositories.MajorFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/major-facilities")
public class MajorFacilityController {

    @Autowired
    private MajorFacilityRepository majorFacilityRepository;

    @PostMapping()
    public MajorFacility addMajorFacility(@RequestBody MajorFacility majorFacility) {
        return majorFacilityRepository.save(majorFacility);
    }

    @GetMapping()
    public MajorFacility getFacilityLast() {
        return majorFacilityRepository.findByFacilityLast();
    }
}

