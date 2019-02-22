package com.rnehul.model.sfgpetclinic.service;

import com.rnehul.model.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PerService {

    Pet findById(long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
