package za.co.fnb.nav.is.sfgpetclinic.services;

import za.co.fnb.nav.is.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastname);
    Owner findById(long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
