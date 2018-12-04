package com.lntellimed.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.lntellimed.petclinic.model.Vet;


public interface VetRepository extends CrudRepository<Vet, Long> {
}