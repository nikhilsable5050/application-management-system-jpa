package com.example.ApplicationManagementSystem.controllers;

import com.example.ApplicationManagementSystem.entities.Applicant;
import com.example.ApplicationManagementSystem.services.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applicants")
public class ApplicationController {

    @Autowired
    private ApplicantService applicantService;

    @GetMapping
    public List<Applicant> getAllApplicants(){
        return applicantService.getAllApplicants();
    }

    @PostMapping
    public Applicant saveApplicant(@RequestBody Applicant applicant){
        return applicantService.saveApplicantCrud(applicant);
    }
}
