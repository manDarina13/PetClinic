package com.dadindi.petclinic.services;

import com.dadindi.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName (String lastName);

}
