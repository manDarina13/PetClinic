package com.dadindi.petclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

    T findById (ID id);

    T save (T objec);

    Set<T> finAll ();

    void delete (T object);

    void deleteById (ID id);

}
