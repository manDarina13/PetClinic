package com.dadindi.petclinic.services;

import java.util.Set;

import com.dadindi.petclinic.model.Owner;

public interface OwnerService {

    Owner findByLastName (String lastName);

    Owner findById (Long id);

    Owner save (Owner owner);

    Set<Owner> finAll ();
}
