package com.lntellimed.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.lntellimed.petclinic.model.Speciality;


public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}