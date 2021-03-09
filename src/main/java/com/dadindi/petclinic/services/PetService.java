package com.dadindi.petclinic.services;

import java.util.Set;

import com.dadindi.petclinic.model.Pet;

public interface PetService {

    Pet findById (Long id);

    Pet save (Pet pet);

    Set<Pet> finAll ();

}
