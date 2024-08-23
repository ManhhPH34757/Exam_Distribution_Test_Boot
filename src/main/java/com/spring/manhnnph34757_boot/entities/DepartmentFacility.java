package com.spring.manhnnph34757_boot.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "department_facility")
public class DepartmentFacility {
    @Id
    @Size(max = 36)
    @Column(name = "id", nullable = false, length = 36)
    private String id;

    @Column(name = "status")
    private Byte status;

    @Column(name = "created_date")
    private Long createdDate;

    @Column(name = "last_modified_date")
    private Long lastModifiedDate;

    @ManyToOne()
    @JoinColumn(name = "id_department")
    private Department idDepartment;

    @ManyToOne()
    @JoinColumn(name = "id_facility")
    private Facility idFacility;

    @ManyToOne()
    @JoinColumn(name = "id_staff")
    private Staff idStaff;

}