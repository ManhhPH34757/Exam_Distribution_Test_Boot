package com.spring.manhnnph34757_boot.services;

import com.spring.manhnnph34757_boot.entities.Staff;
import com.spring.manhnnph34757_boot.entities.StaffMajorFacility;
import com.spring.manhnnph34757_boot.repositories.StaffMajorFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffMajorFacilityService {

    @Autowired
    private StaffMajorFacilityRepository staffMajorFacilityRepository;

    public List<StaffMajorFacility> getStaffMajorFacilities(Staff staff){
        return staffMajorFacilityRepository.findByIdStaff(staff);
    }
}
