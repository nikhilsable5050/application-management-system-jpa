package com.example.ApplicationManagementSystem.services;

import com.example.ApplicationManagementSystem.entities.Applicant;
import com.example.ApplicationManagementSystem.repositories.ApplicantCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicantService {

    @Autowired
    private ApplicantCrudRepository applicantCrudRepository;
    public List<Applicant> getAllApplicants(){
        Iterable<Applicant> all = applicantCrudRepository.findAll();
        List<Applicant> applicationList = new ArrayList<>();
        all.forEach(applicationList::add);
        return applicationList;
    }
    public Applicant saveApplicantCrud(Applicant applicant){
        return applicantCrudRepository.save(applicant);
    }
}
