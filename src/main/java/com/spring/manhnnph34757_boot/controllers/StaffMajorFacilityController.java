package com.spring.manhnnph34757_boot.controllers;

import com.spring.manhnnph34757_boot.entities.StaffMajorFacility;
import com.spring.manhnnph34757_boot.repositories.StaffMajorFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/staffs-majors-facilities")
public class StaffMajorFacilityController {

    @Autowired
    private StaffMajorFacilityRepository staffMajorFacilityRepository;

    @PostMapping()
    public StaffMajorFacility save(@RequestBody StaffMajorFacility staffMajorFacility){
        return staffMajorFacilityRepository.save(staffMajorFacility);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        staffMajorFacilityRepository.deleteById(id);
    }

}
