package com.dadindi.petclinic.services;

import org.springframework.stereotype.Service;

import com.dadindi.petclinic.model.Owner;

@Service
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName (String lastName);

}
