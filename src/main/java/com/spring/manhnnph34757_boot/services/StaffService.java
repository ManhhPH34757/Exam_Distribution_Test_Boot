package com.spring.manhnnph34757_boot.services;

import com.spring.manhnnph34757_boot.entities.Staff;
import com.spring.manhnnph34757_boot.repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService {

    @Autowired
    private StaffRepository staffRepository;

    public Iterable<Staff> getAllStaff() {
        return staffRepository.findAll();
    }

    public Staff save(Staff staff) {
        return staffRepository.save(staff);
    }

    public boolean checkStaffCodeDuplicate(String staffCode) {
        Staff existingStaff = staffRepository.findByStaffCode(staffCode).orElse(null);
        return existingStaff != null;
    }

    public boolean checkEmailFptDuplicate(String accountFpt) {
        Staff existingStaff = staffRepository.findByAccountFpt(accountFpt).orElse(null);
        return existingStaff != null;
    }

    public boolean checkEmailFeDuplicate(String accountFe) {
        Staff existingStaff = staffRepository.findByAccountFe(accountFe).orElse(null);
        return existingStaff != null;
    }

    public Staff findStaffByStaffCode(String staffCode) {
        return staffRepository.findByStaffCode(staffCode).orElse(null);
    }

    public Staff findById(String id) {
        return staffRepository.findById(id).orElse(null);
    }
}
