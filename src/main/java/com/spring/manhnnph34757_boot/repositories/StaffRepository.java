package com.spring.manhnnph34757_boot.repositories;

import com.spring.manhnnph34757_boot.entities.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StaffRepository extends JpaRepository<Staff, String> {

    Optional<Staff> findByStaffCode(String staffCode);

    Optional<Staff> findByAccountFpt(String accountFpt);

    Optional<Staff> findByAccountFe(String accountFe);
}