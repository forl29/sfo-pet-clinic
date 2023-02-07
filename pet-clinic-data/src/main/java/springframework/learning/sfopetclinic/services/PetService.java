package springframework.learning.sfopetclinic.services;

import springframework.learning.sfopetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
