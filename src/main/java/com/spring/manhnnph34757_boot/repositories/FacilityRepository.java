package com.spring.manhnnph34757_boot.repositories;

import com.spring.manhnnph34757_boot.entities.Facility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacilityRepository extends JpaRepository<Facility, String> {
    @Query(
            value = "SELECT DISTINCT facility.id, facility.name, facility.code, facility.created_date, facility.last_modified_date, facility.status FROM  \n" +
                    "                    facility join department_facility on facility.id = department_facility.id_facility JOIN  \n" +
                    "                    major_facility on department_facility.id = major_facility.id_department_facility  \n" +
                    "                    join staff_major_facility on staff_major_facility.id_major_facility = major_facility.id  \n" +
                    "                    JOIN staff on staff.id = staff_major_facility.id_staff join major on major.id = major_facility.id_major  \n" +
                    "                    join department on department.id = department_facility.id_department \n" +
                    "                    WHERE facility.id NOT IN (\n" +
                    "\t\t\t\t\t\t\t\tselect DISTINCT facility.id FROM  \n" +
                    "\t                    facility join department_facility on facility.id = department_facility.id_facility JOIN  \n" +
                    "\t                    major_facility on department_facility.id = major_facility.id_department_facility  \n" +
                    "\t                    join staff_major_facility on staff_major_facility.id_major_facility = major_facility.id  \n" +
                    "\t                    JOIN staff on staff.id = staff_major_facility.id_staff join major on major.id = major_facility.id_major  \n" +
                    "\t                    join department on department.id = department_facility.id_department WHERE staff.id = ?1\n" +
                    "\t\t\t\t\t\t  )",
            nativeQuery = true
    )
    List<Facility> getFacilities(String id);
}