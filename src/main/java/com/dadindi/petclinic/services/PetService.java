package com.dadindi.petclinic.services;

import org.springframework.stereotype.Service;

import com.dadindi.petclinic.model.Pet;

@Service
public interface PetService extends CrudService<Pet, Long> {


}
