package za.co.fnb.nav.is.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import za.co.fnb.nav.is.sfgpetclinic.model.Pet;
import za.co.fnb.nav.is.sfgpetclinic.services.PetService;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {


    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
