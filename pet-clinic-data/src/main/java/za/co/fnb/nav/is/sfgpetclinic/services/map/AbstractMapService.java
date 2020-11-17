package za.co.fnb.nav.is.sfgpetclinic.services.map;

import za.co.fnb.nav.is.sfgpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends  Long> {
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<T>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if(object!=null){
            if(object.getId()==null){
                object.setId(nextID());
            }
            map.put(object.getId(), object);
        }
        else {
            throw  new RuntimeException("object can not be null");
        }

        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(e -> e.getValue().equals(object));
    }

    private Long nextID() {
        if(map.size()== 0) {
            return   Long.parseLong("1") ;
        }
        return Collections.max(map.keySet()) + 1;
    }
}
