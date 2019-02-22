package com.rnehul.model.sfgpetclinic.service;

import com.rnehul.model.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Set<Vet> findAll();

    Vet findById(long id);

    Vet save(Vet vet);
}
