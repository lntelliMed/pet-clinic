package com.lntellimed.petclinic.services;

import java.util.List;

import com.lntellimed.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);

	List<Owner> findAllByLastNameLike(String lastName);

}
