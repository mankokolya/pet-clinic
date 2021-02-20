package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 7/18/18.
 */
@Service
public interface PetService extends CrudService<Pet, Long> {

}
