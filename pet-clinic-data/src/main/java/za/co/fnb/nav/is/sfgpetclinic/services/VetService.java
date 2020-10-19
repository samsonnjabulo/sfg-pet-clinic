package za.co.fnb.nav.is.sfgpetclinic.services;

import za.co.fnb.nav.is.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
