package com.lntellimed.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.lntellimed.petclinic.model.Pet;


public interface PetRepository extends CrudRepository<Pet, Long> {
}