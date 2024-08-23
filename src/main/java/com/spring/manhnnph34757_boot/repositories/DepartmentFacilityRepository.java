package com.spring.manhnnph34757_boot.repositories;

import com.spring.manhnnph34757_boot.entities.DepartmentFacility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentFacilityRepository extends JpaRepository<DepartmentFacility, String> {

    @Query(
            value = "select top 1 * from department_facility order by created_date desc ",
            nativeQuery = true
    )
    DepartmentFacility getDepartmentFacilityLatest();
}