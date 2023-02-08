package springframework.learning.sfopetclinic.services;

import springframework.learning.sfopetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
