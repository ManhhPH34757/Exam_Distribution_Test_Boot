package com.spring.manhnnph34757_boot.repositories;

import com.spring.manhnnph34757_boot.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {
}