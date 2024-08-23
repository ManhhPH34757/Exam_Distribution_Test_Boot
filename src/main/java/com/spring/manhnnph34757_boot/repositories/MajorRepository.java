package com.spring.manhnnph34757_boot.repositories;

import com.spring.manhnnph34757_boot.entities.Major;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MajorRepository extends JpaRepository<Major, String> {
}