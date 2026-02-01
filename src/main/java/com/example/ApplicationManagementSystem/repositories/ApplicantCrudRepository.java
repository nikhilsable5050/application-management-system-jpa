package com.example.ApplicationManagementSystem.repositories;

import com.example.ApplicationManagementSystem.entities.Applicant;
import org.springframework.data.repository.CrudRepository;

public interface ApplicantCrudRepository extends CrudRepository<Applicant, Long> {

}
