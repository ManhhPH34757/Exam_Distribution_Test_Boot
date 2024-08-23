package com.spring.manhnnph34757_boot.repositories;

import com.spring.manhnnph34757_boot.entities.Staff;
import com.spring.manhnnph34757_boot.entities.StaffMajorFacility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffMajorFacilityRepository extends JpaRepository<StaffMajorFacility, String> {
    List<StaffMajorFacility> findByIdStaff(Staff staff);

}