package com.spring.manhnnph34757_boot.repositories;

import com.spring.manhnnph34757_boot.entities.MajorFacility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MajorFacilityRepository extends JpaRepository<MajorFacility, String> {

    @Query(
            value = "select top 1 * from major_facility order by created_date desc",
            nativeQuery = true
    )
    MajorFacility findByFacilityLast();
}