package com.spring.manhnnph34757_boot.controllers;

import com.spring.manhnnph34757_boot.entities.Major;
import com.spring.manhnnph34757_boot.repositories.MajorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/majors")
public class MajorController {

    @Autowired
    private MajorRepository majorRepository;

    @GetMapping()
    public Iterable<Major> getAllMajorNames() {
        return majorRepository.findAll();
    }
}
