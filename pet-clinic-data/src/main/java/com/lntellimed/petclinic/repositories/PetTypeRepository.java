package com.lntellimed.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.lntellimed.petclinic.model.PetType;


public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}