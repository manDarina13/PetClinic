package com.dadindi.petclinic.services;

import java.util.Set;

import com.dadindi.petclinic.model.Vet;

public interface VetService {

    Vet findById (Long id);

    Vet save (Vet vet);

    Set<Vet> finAll ();
}
