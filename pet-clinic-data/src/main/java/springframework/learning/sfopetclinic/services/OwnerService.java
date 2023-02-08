package springframework.learning.sfopetclinic.services;

import springframework.learning.sfopetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
