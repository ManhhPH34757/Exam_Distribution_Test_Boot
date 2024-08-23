package com.spring.manhnnph34757_boot.controllers;

import com.spring.manhnnph34757_boot.entities.Staff;
import com.spring.manhnnph34757_boot.entities.StaffMajorFacility;
import com.spring.manhnnph34757_boot.services.StaffMajorFacilityService;
import com.spring.manhnnph34757_boot.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/staffs")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @Autowired
    private StaffMajorFacilityService staffMajorFacilityService;

    @GetMapping()
    public Iterable<Staff> getAllStaffNames() {
        return staffService.getAllStaff();
    }

    @PostMapping()
    public Staff createStaff(@RequestBody Staff staff) {
        return staffService.save(staff);
    }

    @GetMapping("/code/{staffCode}")
    public Staff getStaffByStaffCode(@PathVariable String staffCode) {
        return staffService.findStaffByStaffCode(staffCode);
    }

    @GetMapping("/id/{id}")
    public Staff getStaffById(@PathVariable String id) {
        return staffService.findById(id);
    }

    @PutMapping("/{id}")
    public Staff updateStaff(@PathVariable String id, @RequestBody Staff staff) {
        staff.setId(id);
        return staffService.save(staff);
    }

    @GetMapping("/check-code/{staffCode}")
    public boolean checkStaffCodeDuplicate(@PathVariable String staffCode) {
        return staffService.checkStaffCodeDuplicate(staffCode);
    }

    @GetMapping("/check-email-fpt/{accountFpt}")
    public boolean checkEmailFptDuplicate(@PathVariable String accountFpt) {
        return staffService.checkEmailFptDuplicate(accountFpt);
    }

    @GetMapping("/check-email-fe/{accountFe}")
    public boolean checkEmailFeDuplicate(@PathVariable String accountFe) {
        return staffService.checkEmailFeDuplicate(accountFe);
    }

    @GetMapping("/{id}/staff-major-facility")
    public Iterable<StaffMajorFacility> getStaffMajorFacilities(@PathVariable String id) {
        return staffMajorFacilityService.getStaffMajorFacilities(staffService.findById(id));
    }

}
