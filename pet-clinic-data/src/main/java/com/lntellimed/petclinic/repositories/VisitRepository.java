package com.lntellimed.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.lntellimed.petclinic.model.Visit;


public interface VisitRepository extends CrudRepository<Visit, Long> {
}