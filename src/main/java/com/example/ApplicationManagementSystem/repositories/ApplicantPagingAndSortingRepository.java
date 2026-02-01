package com.example.ApplicationManagementSystem.repositories;

import com.example.ApplicationManagementSystem.entities.Applicant;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ApplicantPagingAndSortingRepository extends PagingAndSortingRepository<Applicant,Long> {
}
