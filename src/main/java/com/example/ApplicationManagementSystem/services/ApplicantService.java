package com.example.ApplicationManagementSystem.services;

import com.example.ApplicationManagementSystem.entities.Applicant;
import com.example.ApplicationManagementSystem.repositories.ApplicantCrudRepository;
import com.example.ApplicationManagementSystem.repositories.ApplicantPagingAndSortingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicantService {

    @Autowired
    private ApplicantCrudRepository applicantCrudRepository;

    @Autowired
    private ApplicantPagingAndSortingRepository applicantPagingAndSortingRepository;
    public List<Applicant> getAllApplicants(){
        Iterable<Applicant> all = applicantCrudRepository.findAll();
        List<Applicant> applicationList = new ArrayList<>();
        all.forEach(applicationList::add);
        return applicationList;
    }
    public Applicant saveApplicantCrud(Applicant applicant){
        return applicantCrudRepository.save(applicant);
    }

    public Iterable<Applicant> getApplicantsWithPagination(int page,int size){
        return applicantPagingAndSortingRepository.findAll(PageRequest.of(page,size));
    }
}
