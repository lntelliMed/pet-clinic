package com.lntellimed.petclinic.services;

import com.lntellimed.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
