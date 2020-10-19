package za.co.fnb.nav.is.sfgpetclinic.services;

import za.co.fnb.nav.is.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
