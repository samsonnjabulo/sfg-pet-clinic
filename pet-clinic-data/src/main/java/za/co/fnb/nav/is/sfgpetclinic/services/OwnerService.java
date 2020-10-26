package za.co.fnb.nav.is.sfgpetclinic.services;

import za.co.fnb.nav.is.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastname);
  }
