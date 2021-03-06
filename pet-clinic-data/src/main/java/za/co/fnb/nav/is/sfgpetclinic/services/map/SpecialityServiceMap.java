package za.co.fnb.nav.is.sfgpetclinic.services.map;

import za.co.fnb.nav.is.sfgpetclinic.model.Speciality;
import za.co.fnb.nav.is.sfgpetclinic.services.SpecialityService;

import java.util.Set;

public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialityService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality speciality) {
        super.delete(speciality);

    }

    @Override
    public Speciality save(Speciality speciality) {
        return super.save(speciality);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
